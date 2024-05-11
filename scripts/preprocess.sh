#!/bin/bash

# Clean local files
rm data/*
rm output/*
rm -rf scripts/.ipynb_checkpoints
rm -rf sql/.ipynb_checkpoints

# Clean hdfs files
hdfs dfs -rm -r -skipTrash /user/team13/project/warehouse
hdfs dfs -rm -r -skipTrash /user/team13/project/hive
hdfs dfs -rm -r -skipTrash /user/team13/project/output
hdfs dfs -rm -r -skipTrash /user/team13/project/models