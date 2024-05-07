USE team13_projectdb;

DROP TABLE IF EXISTS q3_results;
CREATE EXTERNAL TABLE q3_results
(
    raised_amount_mln_usd INTEGER,
    time_gap              INTEGER
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q3';

INSERT INTO q3_results
SELECT raised_amount_mln_usd, (funded_at_year - founded_at_year) AS time_gap
FROM (SELECT id, year(founded_at) AS founded_at_year
      FROM objects_part
      WHERE entity_type = 'Company'
        AND category_code IS NOT NULL
        AND country_code IS NOT NULL
        AND founded_at IS NOT NULL) companies
         JOIN (SELECT x.object_id, x.funded_at_year, ROUND(raised_amount_usd / POW(10, 6), 2) as raised_amount_mln_usd
               FROM funding_rounds_part x
                        JOIN
                    (SELECT object_id,
                            MAX(
                                    named_struct(
                                            'raised_amount_mln_usd', ROUND(raised_amount_usd / POW(10, 6), 2),
                                            'funded_at_year', funded_at_year
                                    )
                            ).funded_at_year
                     FROM funding_rounds_part
                     GROUP BY object_id) y
                    ON x.object_id = y.object_id AND x.funded_at_year = y.funded_at_year) max_raised_amount
              ON companies.id = max_raised_amount.object_id;


SELECT *
FROM q3_results;