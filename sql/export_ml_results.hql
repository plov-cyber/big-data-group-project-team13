USE team13_projectdb;

-- Table with predictions of Model 1
DROP TABLE IF EXISTS model1_predictions;
CREATE EXTERNAL TABLE model1_predictions
(
    label      FLOAT,
    prediction FLOAT
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    STORED AS TEXTFILE
    LOCATION 'project/output/model1_predictions.csv'
    TBLPROPERTIES ("skip.header.line.count" = "1");

-- Table with predictions of Model 2
DROP TABLE IF EXISTS model2_predictions;
CREATE EXTERNAL TABLE model2_predictions
(
    label      FLOAT,
    prediction FLOAT
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    STORED AS TEXTFILE
    LOCATION 'project/output/model2_predictions.csv'
    TBLPROPERTIES ("skip.header.line.count" = "1");

-- Table with evaluation results
DROP TABLE IF EXISTS evaluation;
CREATE EXTERNAL TABLE evaluation
(
    model STRING,
    RMSE  FlOAT,
    R2    FLOAT,
    MAPE  FLOAT
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    STORED AS TEXTFILE
    LOCATION 'project/output/evaluation.csv'
    TBLPROPERTIES ("skip.header.line.count" = "1");

-- Checking the correctness of script
SELECT *
FROM model1_predictions
LIMIT 5;

SELECT *
FROM model2_predictions
LIMIT 5;

SELECT *
FROM evaluation
LIMIT 5;
