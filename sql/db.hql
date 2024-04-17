SET hive.exec.dynamic.partition=true;

DROP DATABASE IF EXISTS team13_projectdb CASCADE;

-- Creating database
CREATE DATABASE team13_projectdb
    LOCATION "project/hive/warehouse";
USE team13_projectdb;

-- Creating external tables
-- acquisitions table
CREATE EXTERNAL TABLE acquisitions
    STORED AS AVRO
    LOCATION 'project/warehouse/acquisitions'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/acquisitions.avsc');

-- objects table
CREATE EXTERNAL TABLE objects
    STORED AS AVRO
    LOCATION 'project/warehouse/objects'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/objects.avsc');


-- people table
CREATE EXTERNAL TABLE people
    STORED AS AVRO
    LOCATION 'project/warehouse/people'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/people.avsc');


-- offices table
CREATE EXTERNAL TABLE offices
    STORED AS AVRO
    LOCATION 'project/warehouse/offices'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/offices.avsc');


-- relationships table
CREATE EXTERNAL TABLE relationships
    STORED AS AVRO
    LOCATION 'project/warehouse/relationships'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/relationships.avsc');


-- milestones table
CREATE EXTERNAL TABLE milestones
    STORED AS AVRO
    LOCATION 'project/warehouse/milestones'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/milestones.avsc');


-- ipos table
CREATE EXTERNAL TABLE ipos
    STORED AS AVRO
    LOCATION 'project/warehouse/ipos'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/ipos.avsc');


-- degrees table
CREATE EXTERNAL TABLE degrees
    STORED AS AVRO
    LOCATION 'project/warehouse/degrees'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/degrees.avsc');


-- investments table
CREATE EXTERNAL TABLE investments
    STORED AS AVRO
    LOCATION 'project/warehouse/investments'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/investments.avsc');


-- funds table
CREATE EXTERNAL TABLE funds
    STORED AS AVRO
    LOCATION 'project/warehouse/funds'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/funds.avsc');


-- funding_rounds table
CREATE EXTERNAL TABLE funding_rounds
    STORED AS AVRO
    LOCATION 'project/warehouse/funding_rounds'
    TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/funding_rounds.avsc');


-- For checking the content of tables
SELECT *
FROM acquisitions
LIMIT 5;
SELECT *
FROM objects
LIMIT 5;
SELECT *
FROM people
LIMIT 5;
SELECT *
FROM offices
LIMIT 5;
SELECT *
FROM relationships
LIMIT 5;
SELECT *
FROM milestones
LIMIT 5;
SELECT *
FROM ipos
LIMIT 5;
SELECT *
FROM degrees
LIMIT 5;
SELECT *
FROM investments
LIMIT 5;
SELECT *
FROM funds
LIMIT 5;
SELECT *
FROM funding_rounds
LIMIT 5;


-- Create external table with partitions
CREATE EXTERNAL TABLE objects_buck
(
    id                  VARCHAR(255),
    entity_type         VARCHAR(50),
    entity_id           BIGINT,
    normalized_name     VARCHAR(255),
    permalink           VARCHAR(255),
    category_code       VARCHAR(50),
    status              VARCHAR(50),
    domain              VARCHAR(255),
    homepage_url        VARCHAR(500),
    twitter_username    VARCHAR(50),
    logo_url            VARCHAR(500),
    logo_width          SMALLINT,
    logo_height         SMALLINT,
    short_description   STRING,
    description         STRING,
    overview            STRING,
    tag_list            STRING,
    country_code        VARCHAR(3),
    state_code          VARCHAR(2),
    city                VARCHAR(255),
    region              VARCHAR(255),
    first_investment_at DATE,
    last_investment_at  DATE,
    investment_rounds   SMALLINT,
    invested_companies  SMALLINT,
    first_funding_at    DATE,
    last_funding_at     DATE,
    funding_rounds      SMALLINT,
    funding_total_usd   NUMERIC(19, 2),
    first_milestone_at  DATE,
    last_milestone_at   DATE,
    milestones          SMALLINT,
    relationships       SMALLINT,
    created_by          VARCHAR(255),
    created_at          TIMESTAMP,
    updated_at          TIMESTAMP
)
    CLUSTERED BY (id) INTO 1000 buckets
    STORED AS AVRO
    LOCATION 'project/hive/warehouse/objects_buck'
    TBLPROPERTIES ('AVRO.COMPRESS' = 'SNAPPY');