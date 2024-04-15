#!/bin/bash

# download the data
url="https://disk.yandex.ru/d/ErRH7JdGugYe8A"

wget "$(yadisk-direct $url)" -O data/data.zip

# save the data
unzip data/data.zip -d data/
cp data/ibd_group_project/*.csv data/
rm -rf data/ibd_group_project
rm data/data.zip

# build db
python3 scripts/build_projectdb.py

# Import the database into HDFS via Sqoop
cd output
password=$(head -n 1 secrets/.psql.pass)
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team13_projectdb --username team13 --password $password --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1

#
cd ..
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc