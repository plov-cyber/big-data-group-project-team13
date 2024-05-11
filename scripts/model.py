"""
Training ML models, tuning hyperparameters via GridSearch and evaluation part.
"""

import math
import os
import pyspark.sql.functions as F
from pyspark import keyword_only
from pyspark.ml import Pipeline, Transformer
from pyspark.ml.evaluation import Evaluator, RegressionEvaluator
from pyspark.ml.feature import OneHotEncoder, StringIndexer, VectorAssembler
from pyspark.ml.param.shared import (
    HasInputCol,
    HasOutputCol,
    Param,
    Params,
    TypeConverters,
)
from pyspark.ml.regression import GBTRegressor, LinearRegression
from pyspark.ml.tuning import CrossValidator, ParamGridBuilder
from pyspark.ml.util import DefaultParamsReadable, DefaultParamsWritable
from pyspark.sql import DataFrame, SparkSession
from pyspark.sql.functions import col, cos, sin, udf
from pyspark.sql.types import IntegerType, StringType

# Our team number team13
TEAM = "team13"

# Location of Hive database in HDFS
WAREHOUSE = "project/hive/warehouse"

spark = (
    SparkSession.builder.appName(f"{TEAM} - spark ML")
    .master("yarn")
    .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")
    .config("spark.sql.warehouse.dir", WAREHOUSE)
    .config("spark.sql.avro.compression.codec", "snappy")
    .config("spark.executor.instances", 8)
    .config("spark.executor.cores", 1)
    .config("spark.executor.memory", "2g")
    .config("spark.dynamicAllocation.enabled", "false")
    .enableHiveSupport()
    .getOrCreate()
)

# Read tables
objects = spark.read.format("avro").table("team13_projectdb.objects_part")
fund_rounds = spark.read.format("avro").table("team13_projectdb.funding_rounds_part")

# Select features and the label
obj_features = [
    "id",
    "status",
    "category_code",
    "country_code",
    "investment_rounds",
    "invested_companies",
    "milestones",
    "relationships",
]
fund_features = [
    "object_id",
    "funded_at",
    "funding_round_type",
    "participants",
    "is_first_round",
    "is_last_round",
]
LABEL = "raised_amount_usd"

objects = objects.select(obj_features)
fund_rounds = fund_rounds.select(fund_features + [LABEL])

# Join tables to form one Dataframe for the ML task
final = (
    objects.join(fund_rounds, objects["id"] == fund_rounds["object_id"], how="right")
    .drop("id")
    .drop("object_id")
)

# Preprocess category_code feature
leisure = [
    "games_video",
    "photo_video",
    "social",
    "hospitality",
    "sports",
    "fashion",
    "messaging",
    "music",
]
bizsupport = [
    "network_hosting",
    "advertising",
    "enterprise",
    "consulting",
    "analytics",
    "public_relations",
    "security",
    "legal",
]
building = [
    "cleantech",
    "manufacturing",
    "semiconductor",
    "automotive",
    "real_eastate",
    "nanotech",
]
travel = ["travel", "transportation"]
health = ["health", "medical", "biotech"]
other = [
    "web",
    "other",
    "pets",
    "mobile",
    "software",
    "finance",
    "education",
    "ecommerce",
    "search",
    "hardware",
    "news",
    "government",
    "nonprofit",
    "local",
]


@udf(returnType=StringType())
def map_category_code(category_code):
    """
    Map category code to a specific group.
    """

    if category_code in leisure:
        return "leisure"
    if category_code in bizsupport:
        return "bizsupport"
    if category_code in building:
        return "building"
    if category_code in travel:
        return "travel"
    if category_code in health:
        return "health"
    return "other"


final = final.withColumn("category_code", map_category_code(final["category_code"]))

# Preprocess country_code feature
Africa = [
    "AGO",
    "BDI",
    "BEN",
    "BWA",
    "CIV",
    "CMR",
    "DZA",
    "EGY",
    "ETH",
    "GHA",
    "GIN",
    "KEN",
    "LSO",
    "MAR",
    "MDG",
    "MUS",
    "NAM",
    "NER",
    "NGA",
    "REU",
    "RWA",
    "SDN",
    "SEN",
    "SLE",
    "SOM",
    "SWZ",
    "SYC",
    "TUN",
    "TZA",
    "UGA",
    "ZAF",
    "ZMB",
    "ZWE",
]
Asia = [
    "AFG",
    "ARE",
    "BGD",
    "BHR",
    "BRN",
    "CHN",
    "HKG",
    "IDN",
    "IND",
    "IOT",
    "IRN",
    "IRQ",
    "ISR",
    "JOR",
    "JPN",
    "KAZ",
    "KGZ",
    "KHM",
    "KOR",
    "KWT",
    "LAO",
    "LBN",
    "LKA",
    "MAC",
    "MDV",
    "MMR",
    "MYS",
    "NPL",
    "OMN",
    "PAK",
    "PCN",
    "PHL",
    "PRK",
    "PST",
    "QAT",
    "SAU",
    "SGP",
    "SYR",
    "THA",
    "TJK",
    "TWN",
    "UZB",
    "VNM",
    "YEM",
]
Europe = [
    "AIA",
    "ALB",
    "AND",
    "ARM",
    "AUT",
    "AZE",
    "BEL",
    "BGR",
    "BIH",
    "BLR",
    "CHE",
    "CYP",
    "CZE",
    "DEU",
    "DNK",
    "ESP",
    "EST",
    "FIN",
    "FRA",
    "GBR",
    "GEO",
    "GIB",
    "GLB",
    "GRC",
    "HRV",
    "HUN",
    "IRL",
    "ISL",
    "ITA",
    "LIE",
    "LTU",
    "LUX",
    "LVA",
    "MCO",
    "MDA",
    "MKD",
    "MLT",
    "NLD",
    "NOR",
    "POL",
    "PRT",
    "ROM",
    "RUS",
    "SMR",
    "SVK",
    "SVN",
    "SWE",
    "TUR",
    "UKR",
]
North_America = [
    "ATG",
    "BHS",
    "BLZ",
    "BMU",
    "BRB",
    "CAN",
    "CRI",
    "CUB",
    "CYM",
    "DMA",
    "GRD",
    "GTM",
    "HND",
    "HTI",
    "JAM",
    "MEX",
    "MTQ",
    "PAN",
    "PRI",
    "SLV",
    "UMI",
    "USA",
    "VGB",
    "VIR",
]
South_America = [
    "ARG",
    "BOL",
    "BRA",
    "CHL",
    "COL",
    "DOM",
    "ECU",
    "NIC",
    "PER",
    "PRY",
    "SUR",
    "TTO",
    "URY",
    "VEN",
    "VCT",
]
Other = ["ANT", "ARA", "AUS", "CSS", "FST", "HMI", "NCL", "NFK", "NRU", "NZL"]


@udf(returnType=StringType())
def map_country(country_code):
    """
    Map country code to a specific group.
    """

    if country_code in Africa:
        return "Africa"
    if country_code in Asia:
        return "Asia"
    if country_code in Europe:
        return "Europe"
    if country_code in North_America:
        return "North_America"
    if country_code in South_America:
        return "South_America"
    return "Other"


final = final.withColumn("country_code", map_country(final["country_code"]))

# Split funded_at with datetime to year, month and day
split_col = F.split(F.to_date("funded_at"), "-")
final = (
    final.withColumn("funded_year", split_col.getItem(0).cast(IntegerType()))
    .withColumn("funded_month", split_col.getItem(1).cast(IntegerType()))
    .withColumn("funded_day", split_col.getItem(2).cast(IntegerType()))
)
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
categorical_cols = ["status", "funding_round_type", "category_code", "country_code"]
numerical_cols = [
    "investment_rounds",
    "invested_companies",
    "milestones",
    "relationships",
    "funded_year",
    "participants",
    "is_first_round",
    "is_last_round",
]
cyclical_cols = ["funded_month", "funded_day"]
periods = [12, 31]  # periods for months and days accordingly


# Build a custom transformer to encode cyclical features
# pylint: disable=all
class CyclicTransformer(
    Transformer, HasInputCol, HasOutputCol, DefaultParamsReadable, DefaultParamsWritable
):
    """
    A custom tranformer to encode cyclical features.
    """

    input_col = Param(
        Params._dummy(),
        "input_col",
        "input column name.",
        typeConverter=TypeConverters.toString,
    )
    output_col = Param(
        Params._dummy(),
        "output_col",
        "output column name.",
        typeConverter=TypeConverters.toString,
    )

    @keyword_only
    def __init__(
            self, input_col: str = "input", output_col: str = "output", period: int = 12
    ):
        super().__init__()
        self._setDefault(input_col=None, output_col=None)
        kwargs = self._input_kwargs
        del kwargs["period"]
        self.set_params(**kwargs)
        self.period = period

    @keyword_only
    def set_params(self, input_col: str = "input", output_col: str = "output"):
        """
        Set parameters.
        """

        kwargs = self._input_kwargs
        self._set(**kwargs)

    def get_input_col(self):
        """
        Get input column.
        """

        return self.getOrDefault(self.input_col)

    def get_output_col(self):
        """
        Get output column.
        """

        return self.getOrDefault(self.output_col)

    def _transform(self, dataset: DataFrame):
        """
        Transform a dataset with encoded cyclical features.
        """

        input_col = self.get_input_col()
        output_col = self.get_output_col()

        sin_col = sin(2 * math.pi * dataset[input_col] / self.period)
        cos_col = cos(2 * math.pi * dataset[input_col] / self.period)

        return dataset.withColumn(output_col + "_sin", sin_col).withColumn(
            output_col + "_cos", cos_col
        )


# pylint: enable=all


# Create String indexer to assign index for the string fields
indexers = [
    StringIndexer(inputCol=c, outputCol=f"{c}_indexed").setHandleInvalid("skip")
    for c in categorical_cols
]

# Encode strings using One Hot encoding
encoders = [
    OneHotEncoder(
        inputCol=indexer.getOutputCol(), outputCol=f"{indexer.getOutputCol()}_encoded"
    )
    for indexer in indexers
]

# Encode cyclical features using custom Cyclic Transformer
cyclic_transformers = [
    CyclicTransformer(input_col=col, output_col=col + "_cyc_enc", period=period)
    for col, period in zip(cyclical_cols, periods)
]

# This will concatenate the input cols into a single column
assembler = VectorAssembler(
    inputCols=[encoder.getOutputCol() for encoder in encoders]
              + [transformer.get_output_col() + "_sin" for transformer in cyclic_transformers]
              + [transformer.get_output_col() + "_cos" for transformer in cyclic_transformers]
              + numerical_cols,
    outputCol="features",
)

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


def run(command):
    """
    A function to run commands.
    """

    return os.popen(command).read()


train_data.select("features", "label").coalesce(1).write.mode("overwrite").format(
    "json"
).save("project/data/train")

# Run it from root directory of the repository
run("hdfs dfs -cat project/data/train/*.json > data/train.json")

test_data.select("features", "label").coalesce(1).write.mode("overwrite").format(
    "json"
).save("project/data/test")

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
    """
    A custom evaluator to calculate the Mean Absolute Percentage Error for a regression task.
    """

    def __init__(self, prediction_col="prediction", label_col="label"):
        super().__init__()
        self.prediction_col = prediction_col
        self.label_col = label_col

    def _evaluate(self, dataset):
        """
        Calculate the Mean Absolute Percentage Error (MAPE) for regression tasks.
        """

        prediction_and_labels = dataset.select(
            self.prediction_col, self.label_col
        ).rdd.map(
            lambda row: (float(row[self.prediction_col]), float(row[self.label_col]))
        )

        absolute_percentage_errors = prediction_and_labels.map(
            lambda x: abs((x[1] - x[0]) / x[1]) if x[1] != 0 else 1
        )

        mape = absolute_percentage_errors.mean()

        return mape

    def isLargerBetter(self):
        """
        Indicate whether a larger value of the metric is better.
        """

        return False


# Evaluate the performance of the model
evaluator_rmse = RegressionEvaluator(
    labelCol="label", predictionCol="prediction", metricName="rmse"
)
evaluator_r2 = RegressionEvaluator(
    labelCol="label", predictionCol="prediction", metricName="r2"
)
evaluator_mape = MAPEEvaluator(label_col="label", prediction_col="prediction")

rmse_lr = evaluator_rmse.evaluate(predictions)
r2_lr = evaluator_r2.evaluate(predictions)
mape_lr = evaluator_mape.evaluate(predictions)

# Hyperparameter optimization
grid = ParamGridBuilder()
grid = (
    grid.addGrid(model_lr.aggregationDepth, [2, 3, 4])
    .addGrid(model_lr.regParam, [0.0, 0.001, 0.1, 0.3, 0.5])
    .build()
)

cv = CrossValidator(
    estimator=lr,
    estimatorParamMaps=grid,
    evaluator=evaluator_mape,
    parallelism=5,
    numFolds=3,
)

cvModel = cv.fit(train_data)
model1 = cvModel.bestModel

# Save the model to HDFS
model1.write().overwrite().save("project/models/model1")

# Run it from root directory of the repository
run("hdfs dfs -get project/models/model1 models/model1")

# Prediction of the best model 1
predictions = model1.transform(test_data)

predictions.select("label", "prediction").coalesce(1).write.mode("overwrite").format(
    "csv"
).option("sep", ",").option("header", "true").save(
    "project/output/model1_predictions.csv"
)

# Run it from root directory of the repository
run(
    "hdfs dfs -cat project/output/model1_predictions.csv/*.csv > output/model1_predictions.csv"
)

# Evaluate the performance of the best model
rmse1 = evaluator_rmse.evaluate(predictions)
r2_1 = evaluator_r2.evaluate(predictions)
mape1 = evaluator_mape.evaluate(predictions)

# Modeling: Second model
# Second model is Gradient-Boosted Tree Regression
# Create Gradient-Boosted Tree regression Model
gbt = GBTRegressor()

# Fit the data to the model
model_gbt = gbt.fit(train_data)

# Transform the data (Prediction)
predictions = model_gbt.transform(test_data)

# Evaluate the performance of the model
rmse_gbt = evaluator_rmse.evaluate(predictions)
r2_gbt = evaluator_r2.evaluate(predictions)
mape_gbt = evaluator_mape.evaluate(predictions)

# Hyperparameter optimization
grid = (
    ParamGridBuilder()
    .addGrid(model_gbt.maxDepth, [5, 10])
    .addGrid(model_gbt.lossType, ["absolute", "squared"])
    .build()
)

cv = CrossValidator(
    estimator=gbt,
    estimatorParamMaps=grid,
    evaluator=evaluator_mape,
    parallelism=5,
    numFolds=3,
)

cvModel = cv.fit(train_data)
model2 = cvModel.bestModel

model2.write().overwrite().save("project/models/model2")

# Run it from root directory of the repository
run("hdfs dfs -get project/models/model2 models/model2")

# Prediction of the best model 2
predictions = model2.transform(test_data)

predictions.select("label", "prediction").coalesce(1).write.mode("overwrite").format(
    "csv"
).option("sep", ",").option("header", "true").save(
    "project/output/model2_predictions.csv"
)

# Run it from root directory of the repository
run(
    "hdfs dfs -cat project/output/model2_predictions.csv/*.csv > output/model2_predictions.csv"
)

# Evaluate the performance of the best model
rmse2 = evaluator_rmse.evaluate(predictions)
r2_2 = evaluator_r2.evaluate(predictions)
mape2 = evaluator_mape.evaluate(predictions)

# Compare best models
# Create dataframe to report performance of the models
models = [[str(model1), rmse1, r2_1, mape1], [str(model2), rmse2, r2_2, mape2]]
df = spark.createDataFrame(models, ["model", "RMSE", "R2", "MAPE"])

# Save it to HDFS
df.coalesce(1).write.mode("overwrite").format("csv").option("sep", ",").option(
    "header", "true"
).save("project/output/evaluation.csv")

# Run it from root directory of the repository
run("hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv")

# Stop spark
spark.stop()
