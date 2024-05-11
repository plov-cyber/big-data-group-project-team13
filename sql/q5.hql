USE team13_projectdb;

DROP TABLE IF EXISTS q5_results;
CREATE EXTERNAL TABLE q5_results
(
    funding_round_id INTEGER,
    funded_at_year INTEGER,
    funding_round_type STRING
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q5';

INSERT INTO q5_results
SELECT funding_round_id, funded_at_year, funding_round_type
FROM funding_rounds_part;


SELECT *
FROM q5_results
LIMIT 100;