USE team13_projectdb;

DROP TABLE IF EXISTS q1_results;
CREATE EXTERNAL TABLE q1_results
(
    category_code         STRING,
    raised_amount_mln_usd FLOAT
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q1';

INSERT INTO q1_results
SELECT category_code, raised_amount_mln_usd
FROM (SELECT category_code, ROUND(raised_amount_usd / POW(10, 6), 2) AS raised_amount_mln_usd
      FROM funding_rounds_part
               LEFT JOIN (SELECT category_code, id
                          FROM objects_part
                          WHERE entity_type = 'Company'
                            AND category_code IS NOT NULL
                            AND country_code IS NOT NULL
                            AND founded_at IS NOT NULL
                            AND category_code IN ('web', 'advertising', 'mobile', 'software',
                                                  'ecommerce')) companies_from_top_categories
                         ON (funding_rounds_part.object_id = companies_from_top_categories.id)) money_by_category
WHERE raised_amount_mln_usd <= 50
  AND category_code IS NOT NULL;

SELECT *
FROM q1_results
LIMIT 100;