import os
import math

from pyspark.sql import SparkSession, DataFrame
import pyspark.sql.functions as F
from pyspark.sql.functions import col, udf, sin, cos
from pyspark.sql.types import IntegerType, StringType
from pyspark import keyword_only
from pyspark.ml import Transformer, Pipeline
from pyspark.ml.param.shared import HasInputCol, HasOutputCol, Param, Params, TypeConverters
from pyspark.ml.util import DefaultParamsReadable, DefaultParamsWritable
from pyspark.ml.feature import StringIndexer, OneHotEncoder, VectorAssembler, Tokenizer
from pyspark.ml.regression import LinearRegression, GBTRegressor
from pyspark.ml.evaluation import Evaluator, RegressionEvaluator 
from pyspark.ml.tuning import ParamGridBuilder, CrossValidator 


# Add here your team number teamx
team = "team13"

# Location of Hive database in HDFS
warehouse = "project/hive/warehouse"

spark = SparkSession.builder \
        .appName("{} - spark ML".format(team)) \
        .master("yarn") \
        .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883") \
        .config("spark.sql.warehouse.dir", warehouse) \
        .config("spark.sql.avro.compression.codec", "snappy") \
        .config("spark.executor.instances", 8) \
        .config("spark.executor.cores", 1) \
        .config("spark.executor.memory", "2g") \
        .config("spark.dynamicAllocation.enabled", "false") \
        .enableHiveSupport() \
        .getOrCreate()

# Read tables 
objects = spark.read.format("avro").table('team13_projectdb.objects_part')
fund_rounds = spark.read.format("avro").table('team13_projectdb.funding_rounds_part')

# Select features and the label
obj_features = ['id', 'status', 'category_code', 'country_code', 'investment_rounds', 'invested_companies', 'milestones', 'relationships']
fund_features = ['object_id', 'funded_at', 'funding_round_type', 'participants', 'is_first_round', 'is_last_round']
label = 'raised_amount_usd'

objects = objects.select(obj_features)
fund_rounds = fund_rounds.select(fund_features + [label])

# Join tables to form one Dataframe for the ML task
final = objects.join(fund_rounds, objects['id'] == fund_rounds['object_id'], how='right').drop('id').drop('object_id')

# Preprocess category_code feature
leisure = ['games_video', 'photo_video', 'social', 'hospitality', 'sports', 'fashion', 'messaging', 'music']
bizsupport = ['network_hosting', 'advertising', 'enterprise', 'consulting', 'analytics', 'public_relations', 'security', 'legal']
building = ['cleantech', 'manufacturing', 'semiconductor', 'automotive', 'real_eastate', 'nanotech']
petcare = ['pets']
travel = ['travel', 'transportation']
health = ['health', 'medical', 'biotech']
other = ['web', 'other', 'mobile', 'software', 'finance', 'education', 'ecommerce', 'search', 'hardware', 'news', 'government', 'nonprofit', 'local']

@udf(returnType=StringType())
def map_category_code(category_code):
    if category_code in leisure:
        return 'leisure'
    elif category_code in bizsupport:
        return 'bizsupport'
    elif category_code in building:
        return 'building'
    elif category_code in petcare:
        return 'petcare'
    elif category_code in travel:
        return 'travel'
    elif category_code in health:
        return 'health'
    else:
        return 'other'


final = final.withColumn('category_code', map_category_code(final['category_code']))

# Preprocess country_code feature
Africa = ['AGO', 'BDI', 'BEN', 'BWA', 'CIV', 'CMR', 'DZA', 'EGY', 'ETH', 'GHA', 'GIN', 'KEN', 'LSO', 'MAR', 'MDG', 'MUS', 'NAM', 'NER','NGA', 'REU','RWA', 'SDN','SEN', 'SLE', 'SOM','SWZ', 'SYC', 'TUN', 'TZA', 'UGA', 'ZAF', 'ZMB', 'ZWE']
Asia = ['AFG', 'ARE', 'BGD', 'BHR', 'BRN', 'CHN', 'HKG', 'IDN', 'IND', 'IOT', 'IRN', 'IRQ', 'ISR','JOR', 'JPN', 'KAZ', 'KGZ', 'KHM', 'KOR', 'KWT','LAO', 'LBN', 'LKA', 'MAC', 'MDV', 'MMR', 'MYS', 'NPL', 'OMN', 'PAK', 'PCN','PHL','PRK','PST', 'QAT', 'SAU', 'SGP','SYR', 'THA', 'TJK', 'TWN', 'UZB', 'VNM', 'YEM']
Europe = ['AIA', 'ALB', 'AND', 'ARM', 'AUT', 'AZE', 'BEL', 'BGR','BIH', 'BLR', 'CHE', 'CYP', 'CZE', 'DEU', 'DNK','ESP', 'EST', 'FIN', 'FRA', 'GBR', 'GEO', 'GIB', 'GLB', 'GRC', 'HRV', 'HUN', 'IRL', 'ISL', 'ITA', 'LIE', 'LTU','LUX', 'LVA', 'MCO', 'MDA', 'MKD', 'MLT', 'NLD', 'NOR', 'POL', 'PRT', 'ROM', 'RUS', 'SMR', 'SVK', 'SVN','SWE', 'TUR', 'UKR']
North_America = ['ATG', 'BHS','BLZ', 'BMU', 'BRB', 'CAN', 'CRI','CUB','CYM', 'DMA', 'GRD', 'GTM', 'HND', 'HTI', 'JAM', 'MEX', 'MTQ', 'PAN', 'PRI', 'SLV', 'UMI','USA', 'VGB', 'VIR']
South_America = ['ARG', 'BOL', 'BRA', 'CHL', 'COL', 'DOM', 'ECU', 'NIC', 'PER', 'PRY', 'SUR', 'TTO', 'URY','VEN', 'VCT']
Other = ['ANT', 'ARA', 'AUS', 'CSS', 'FST', 'HMI','NCL', 'NFK','NRU', 'NZL']

@udf(returnType=StringType())
def map_country(country_code):
    if country_code in Africa:
        return 'Africa'
    elif country_code in Asia:
        return 'Asia'
    elif country_code in Europe:
        return 'Europe'
    elif country_code in North_America:
        return 'North_America'
    elif country_code in South_America:
        return 'South_America'
    else:
        return 'Other'
    
    
final = final.withColumn('country_code', map_country(final['country_code']))

# Split funded_at with datetime to year, month and day
split_col = F.split(F.to_date("funded_at"), "-")
final = final.withColumn("funded_year", split_col.getItem(0).cast(IntegerType())) \
            .withColumn("funded_month", split_col.getItem(1).cast(IntegerType())) \
            .withColumn("funded_day", split_col.getItem(2).cast(IntegerType()))
# Remove funded_at
final = final.drop("funded_at")

# Drop all records which contain nulls
final = final.na.drop()

# Remove 0 values in raised_amount_usd (label) 
final = final.filter("raised_amount_usd > 0")

# Transform raised_amount_usd (label) 
final = final.withColumn("raised_amount_usd", F.log10(col("raised_amount_usd")))

# Rename label
final = final.withColumnRenamed("raised_amount_usd", "label")

# Saving intermediate results
final = final.cache()


# Building the Pipeline
# Extract categorical, numerical and cyclical features
categorical_cols = ['status', 'funding_round_type', 'category_code', 'country_code']
numerical_cols = ['investment_rounds', 'invested_companies', 'milestones', 'relationships', 'funded_year', 'participants', 'is_first_round', 'is_last_round']
cyclical_cols = ['funded_month', 'funded_day']
periods = [12, 31]  # periods for months and days accordingly

# Build a custom tranformer to encode cyclical features
class CyclicTransformer(Transformer, HasInputCol, HasOutputCol, DefaultParamsReadable, DefaultParamsWritable):
    inputCol = Param(Params._dummy(), "inputCol", "input column name.", typeConverter=TypeConverters.toString)
    outputCol = Param(Params._dummy(), "outputCol", "output column name.", typeConverter=TypeConverters.toString)
  
    @keyword_only
    def __init__(self, inputCol: str = "input", outputCol: str = "output", period: int = 12):
        super(CyclicTransformer, self).__init__()
        self._setDefault(inputCol=None, outputCol=None)
        kwargs = self._input_kwargs
        del(kwargs["period"])
        self.set_params(**kwargs)
        self.period = period
    
    @keyword_only
    def set_params(self, inputCol: str = "input", outputCol: str = "output"):
        kwargs = self._input_kwargs
        self._set(**kwargs)
    
    def getInputCol(self):
        return self.getOrDefault(self.inputCol)
  
    def getOutputCol(self):
        return self.getOrDefault(self.outputCol)
  
    def _transform(self, df: DataFrame):
        input_col = self.getInputCol()
        output_col = self.getOutputCol()
        
        sin_col = sin(2 * math.pi * df[input_col] / self.period) 
        cos_col = cos(2 * math.pi * df[input_col] / self.period)
       
        return df.withColumn(output_col + "_sin", sin_col).withColumn(output_col + "_cos", cos_col)

# Create String indexer to assign index for the string fields where each unique string will get a unique index
indexers = [StringIndexer(inputCol=c, 
                           outputCol="{0}_indexed".format(c)).setHandleInvalid("skip") for c in categorical_cols]

# Encode strings using One Hot encoding
encoders = [OneHotEncoder(inputCol=indexer.getOutputCol(), 
                           outputCol="{0}_encoded".format(indexer.getOutputCol())) for indexer in indexers]

# Encode cyclical features using custom Cyclic Transformer
cyclic_transformers = [CyclicTransformer(inputCol=col, 
                                         outputCol=col + "_cyc_enc", 
                                         period=period) for col, period in zip(cyclical_cols, periods)]

# This will concatenate the input cols into a single column
assembler = VectorAssembler(inputCols=[encoder.getOutputCol() for encoder in encoders] + 
                            [transformer.getOutputCol() + '_sin' for transformer in cyclic_transformers] + 
                            [transformer.getOutputCol() + '_cos' for transformer in cyclic_transformers] + 
                            numerical_cols, 
                            outputCol= "features")

# Create a pipeline to use only a single fit and transform on the data
pipeline = Pipeline(stages=indexers + encoders + cyclic_transformers + [assembler])

# Fit the pipeline ==> This will call the fit functions for all transformers if exist
model = pipeline.fit(final)

# Fit the pipeline ==> This will call the transform functions for all transformers
data = model.transform(final)

# Delete all features and keep only the features and label columns
data = data.select(["features", "label"])

# Split the data into 70% training and 30% test (it is not stratified)
(train_data, test_data) = data.randomSplit([0.7, 0.3], seed=10)

# A function to run commands
def run(command):
    return os.popen(command).read()

train_data.select("features", "label")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/train")

# Run it from root directory of the repository
run("hdfs dfs -cat project/data/train/*.json > data/train.json")

test_data.select("features", "label")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/test")

# Run it from root directory of the repository
run("hdfs dfs -cat project/data/test/*.json > data/test.json")

# Modeling: First model
# First model is Linear Regression
# Create Linear Regression Model
lr = LinearRegression(maxIter=250, loss="huber")

# Fit the data to the lr model
model_lr = lr.fit(train_data)

# Transform the data (Prediction)
predictions = model_lr.transform(test_data)

# Mean Absolute Percentage Error (MAPE) custom evaluator
class MAPEEvaluator(Evaluator):
    def __init__(self, predictionCol="prediction", labelCol="label"):
        self.predictionCol = predictionCol
        self.labelCol = labelCol

    def _evaluate(self, dataset):
        """
        Calculates the Mean Absolute Percentage Error (MAPE) for regression tasks.
        """
        predictionAndLabels = dataset.select(self.predictionCol, self.labelCol).rdd.map(
            lambda row: (float(row[self.predictionCol]), float(row[self.labelCol]))
        )

        absolutePercentageErrors = predictionAndLabels.map(
            lambda x: abs((x[1] - x[0]) / x[1]) if x[1] != 0 else 1
        )

        mape = absolutePercentageErrors.mean()

        return mape

    def isLargerBetter(self):
        """
        Indicates whether a larger value of the metric is better.
        """
        return False


# Evaluate the performance of the model
evaluator1_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
evaluator1_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")
evaluator1_mape = MAPEEvaluator(labelCol="label", predictionCol="prediction")

rmse_lr = evaluator1_rmse.evaluate(predictions)
r2_lr = evaluator1_r2.evaluate(predictions)
mape_lr = evaluator1_mape.evaluate(predictions)

# Hyperparameter optimization
grid = ParamGridBuilder()
grid = grid.addGrid(model_lr.aggregationDepth, [2, 3, 4]) \
                    .addGrid(model_lr.regParam, [0.0, 0.001, 0.1, 0.3, 0.5]) \
                    .build()

cv = CrossValidator(estimator=lr, 
                    estimatorParamMaps=grid, 
                    evaluator=evaluator1_mape,
                    parallelism=5,
                    numFolds=3)

cvModel = cv.fit(train_data)
model1 = cvModel.bestModel

# Save the model to HDFS
model1.write().overwrite().save("project/models/model1")

# Run it from root directory of the repository
run("hdfs dfs -get project/models/model1 models/model1")

# Prediction of the best model 1
predictions = model1.transform(test_data)

predictions.select("label", "prediction")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("csv")\
    .option("sep", ",")\
    .option("header","true")\
    .save("project/output/model1_predictions.csv")
    
# Run it from root directory of the repository
run("hdfs dfs -cat project/output/model1_predictions.csv/*.csv > output/model1_predictions.csv")

# Evaluate the performance of the best model
evaluator1_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
evaluator1_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")

rmse1 = evaluator1_rmse.evaluate(predictions)
r2_1 = evaluator1_r2.evaluate(predictions)
mape1 = evaluator1_mape.evaluate(predictions)

# Modeling: Second model
# Second model is Gradient-Boosted Tree Regression
# Create Gradient-Boosted Tree regression Model
gbt = GBTRegressor()

# Fit the data to the model
model_gbt = gbt.fit(train_data)

# Transform the data (Prediction)
predictions = model_gbt.transform(test_data)

# Evaluate the performance of the model
evaluator2_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
evaluator2_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")
evaluator2_mape = MAPEEvaluator(labelCol="label", predictionCol="prediction")

rmse_gbt = evaluator2_rmse.evaluate(predictions)
r2_gbt = evaluator2_r2.evaluate(predictions)
mape_gbt = evaluator2_mape.evaluate(predictions)

# Hyperparameter optimization
grid = ParamGridBuilder()
grid = (ParamGridBuilder().addGrid(model_gbt.maxDepth, [5, 10]) \
             .addGrid(model_gbt.lossType, ['absolute', 'squared']) \
             .build())

cv = CrossValidator(estimator=gbt, 
                    estimatorParamMaps=grid, 
                    evaluator=evaluator2_mape,
                    parallelism=5,
                    numFolds=3)

cvModel = cv.fit(train_data)
model2 = cvModel.bestModel

model2.write().overwrite().save("project/models/model2")

# Run it from root directory of the repository
run("hdfs dfs -get project/models/model2 models/model2")

# Prediction of the best model 2
predictions = model2.transform(test_data)

predictions.select("label", "prediction")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("csv")\
    .option("sep", ",")\
    .option("header","true")\
    .save("project/output/model2_predictions.csv")

# Run it from root directory of the repository
run("hdfs dfs -cat project/output/model2_predictions.csv/*.csv > output/model2_predictions.csv")

# Evaluate the performance of the best model
evaluator2_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
evaluator2_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")
evaluator2_mape = MAPEEvaluator(labelCol="label", predictionCol="prediction")

rmse2 = evaluator2_rmse.evaluate(predictions)
r2_2 = evaluator2_r2.evaluate(predictions)
mape2 = evaluator2_mape.evaluate(predictions)

# Compare best models
# Create dataframe to report performance of the models
models = [[str(model1), rmse1, r2_1, mape1], [str(model2), rmse2, r2_2, mape2]]
df = spark.createDataFrame(models, ["model", "RMSE", "R2", "MAPE"])

# Save it to HDFS
df.coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("csv")\
    .option("sep", ",")\
    .option("header","true")\
    .save("project/output/evaluation.csv")

# Run it from root directory of the repository
run("hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv")

# Stop spark
spark.stop()
