USE team13_projectdb;

DROP TABLE IF EXISTS q6_results;
CREATE EXTERNAL TABLE q6_results
(
    object_id STRING,
    funded_at_year       INTEGER,
    raised_money_mln_usd FLOAT,
    continent            STRING
)
    ROW FORMAT DELIMITED
        FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q6';

INSERT INTO q6_results
SELECT object_id,
       funded_at_year,
       ROUND(raised_amount_usd / POW(10, 6), 2) AS raised_amount_mln_usd,
       (CASE
            WHEN
                (country_code IN
                 ('AGO', 'BDI', 'BEN', 'BWA', 'CIV', 'CMR', 'DZA', 'EGY', 'ETH', 'GHA', 'GIN', 'KEN', 'LSO', 'MAR',
                  'MDG', 'MUS', 'NAM', 'NER', 'NGA', 'REU', 'RWA', 'SDN', 'SEN', 'SLE', 'SOM', 'SWZ', 'SYC', 'TUN',
                  'TZA', 'UGA', 'ZAF', 'ZMB', 'ZWE')
                    ) THEN 'Africa'
            WHEN
                (country_code IN
                 ('AFG', 'ARE', 'BGD', 'BHR', 'BRN', 'CHN', 'HKG', 'IDN', 'IND', 'IOT', 'IRN', 'IRQ', 'ISR', 'JOR',
                  'JPN', 'KAZ', 'KGZ', 'KHM', 'KOR', 'KWT', 'LAO', 'LBN', 'LKA', 'MAC', 'MDV', 'MMR', 'MYS', 'NPL',
                  'OMN', 'PAK', 'PCN', 'PHL', 'PRK', 'PST', 'QAT', 'SAU', 'SGP', 'SYR', 'THA', 'TJK', 'TWN', 'UZB',
                  'VNM', 'YEM')
                    ) THEN 'Asia'
            WHEN
                (country_code IN
                 ('AIA', 'ALB', 'AND', 'ARM', 'AUT', 'AZE', 'BEL', 'BGR', 'BIH', 'BLR', 'CHE', 'CYP', 'CZE', 'DEU',
                  'DNK', 'ESP', 'EST', 'FIN', 'FRA', 'GBR', 'GEO', 'GIB', 'GLB', 'GRC', 'HRV', 'HUN', 'IRL', 'ISL',
                  'ITA', 'LIE', 'LTU', 'LUX', 'LVA', 'MCO', 'MDA', 'MKD', 'MLT', 'NLD', 'NOR', 'POL', 'PRT', 'ROM',
                  'RUS', 'SMR', 'SVK', 'SVN', 'SWE', 'TUR', 'UKR')
                    ) THEN 'Europe'
            WHEN
                (country_code IN
                 ('ATG', 'BHS', 'BLZ', 'BMU', 'BRB', 'CAN', 'CRI', 'CUB', 'CYM', 'DMA', 'GRD', 'GTM', 'HND', 'HTI',
                  'JAM', 'MEX', 'MTQ', 'PAN', 'PRI', 'SLV', 'UMI', 'USA', 'VGB', 'VIR')
                    ) THEN 'North America'
            WHEN
                (country_code IN
                 ('ARG', 'BOL', 'BRA', 'CHL', 'COL', 'DOM', 'ECU', 'NIC', 'PER', 'PRY', 'SUR', 'TTO', 'URY', 'VEN',
                  'VCT')
                    ) THEN 'South America'
            ELSE 'Other' END)                   AS continent
FROM funding_rounds_part
         LEFT JOIN (SELECT country_code, id
                    FROM objects_part
                    WHERE entity_type = 'Company'
                      AND category_code IS NOT NULL
                      AND country_code IS NOT NULL
                      AND founded_at IS NOT NULL) companies
                   ON (funding_rounds_part.object_id = companies.id);

SELECT *
FROM q6_results;