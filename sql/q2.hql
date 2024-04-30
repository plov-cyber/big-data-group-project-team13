USE team13_projectdb;

DROP TABLE IF EXISTS q2_results;
CREATE EXTERNAL TABLE q2_results
(
    category_code   STRING,
    founded_at_year INTEGER,
    cnt_companies   INTEGER
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q2';

INSERT INTO q2_results
SELECT category_code, founded_at_year, COUNT(*) as cnt_companies
FROM (SELECT category_code, year(founded_at) AS founded_at_year
      FROM objects_part
      WHERE entity_type = 'Company'
        AND category_code IS NOT NULL
        AND country_code IS NOT NULL
        AND founded_at IS NOT NULL
        AND category_code IN ('web', 'advertising', 'mobile', 'software', 'ecommerce')) companies
WHERE founded_at_year > 2000
GROUP BY category_code, founded_at_year;

SELECT *
FROM q2_results;