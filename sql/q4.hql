USE team13_projectdb;

DROP TABLE IF EXISTS q4_results;
CREATE EXTERNAL TABLE q4_results
(
    funding_round_type    STRING,
    raised_amount_mln_usd INTEGER
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q4';

INSERT INTO q4_results
SELECT funding_round_type, ROUND(raised_amount_usd / POW(10, 6), 2) AS raised_amount_mln_usd
FROM funding_rounds_part
WHERE raised_amount_usd < 500000000;


SELECT *
FROM q4_results;