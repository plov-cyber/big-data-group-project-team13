#!/bin/bash

password=$(head -n 1 secrets/.hive.pass)

# Export ML results to Hive tables
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/export_ml_results.hql 2> /dev/null
