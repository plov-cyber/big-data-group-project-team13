#!/bin/bash

password=$(head -n 1 secrets/.hive.pass)

# Create Hive tables and save results
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null

# Q1
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q1.csv 2> /dev/null

# Q2
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q2.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q2.csv 2> /dev/null

# Q3
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q3.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q3.csv 2> /dev/null

# Q4
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q4.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q4.csv 2> /dev/null

# Q5
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q5.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q5.csv 2> /dev/null

# Q6
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/q6.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q6.csv 2> /dev/null
