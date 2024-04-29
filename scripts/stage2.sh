#!/bin/bash

password=$(head -n 1 secrets/.hive.pass)

# Create Hive tables and save results
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null

# Q1
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q1.csv
