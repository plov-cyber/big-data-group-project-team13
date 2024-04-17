DROP DATABASE IF EXISTS team13_projectdb CASCADE;

CREATE DATABASE team13_projectdb LOCATION "project/hive/warehouse";
USE team13_projectdb;


-- acquisitions table
CREATE EXTERNAL TABLE acquisitions STORED AS AVRO LOCATION 'project/warehouse/acquisitions' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/acquisitions.avsc');


-- objects table
CREATE EXTERNAL TABLE objects STORED AS AVRO LOCATION 'project/warehouse/objects' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/objects.avsc');


-- people table
CREATE EXTERNAL TABLE people STORED AS AVRO LOCATION 'project/warehouse/people' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/people.avsc');


-- offices table
CREATE EXTERNAL TABLE offices STORED AS AVRO LOCATION 'project/warehouse/offices' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/offices.avsc');


-- relationships table
CREATE EXTERNAL TABLE relationships STORED AS AVRO LOCATION 'project/warehouse/relationships' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/relationships.avsc');


-- milestones table
CREATE EXTERNAL TABLE milestones STORED AS AVRO LOCATION 'project/warehouse/milestones' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/milestones.avsc');


-- ipos table
CREATE EXTERNAL TABLE ipos STORED AS AVRO LOCATION 'project/warehouse/ipos' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/ipos.avsc');


-- degrees table
CREATE EXTERNAL TABLE degrees STORED AS AVRO LOCATION 'project/warehouse/degrees' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/degrees.avsc');


-- investments table
CREATE EXTERNAL TABLE investments STORED AS AVRO LOCATION 'project/warehouse/investments' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/investments.avsc');


-- funds table
CREATE EXTERNAL TABLE funds STORED AS AVRO LOCATION 'project/warehouse/funds' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/funds.avsc');


-- funding_rounds table
CREATE EXTERNAL TABLE funding_rounds STORED AS AVRO LOCATION 'project/warehouse/funding_rounds' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/funding_rounds.avsc');


-- For checking the content of tables
SELECT * FROM acquisitions LIMIT 5;
SELECT * FROM objects LIMIT 5;
SELECT * FROM people LIMIT 5;
SELECT * FROM offices LIMIT 5;
SELECT * FROM relationships LIMIT 5;
SELECT * FROM milestones LIMIT 5;
SELECT * FROM ipos LIMIT 5;
SELECT * FROM degrees LIMIT 5;
SELECT * FROM investments LIMIT 5;
SELECT * FROM funds LIMIT 5;
SELECT * FROM funding_rounds LIMIT 5;
