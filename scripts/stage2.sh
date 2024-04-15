#!/bin/bash

password=$(head -n 1 secrets/.hive.pass)

# Run query and save results
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team13 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null