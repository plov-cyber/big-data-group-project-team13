#!/bin/bash

# Clean everything
rm data/*
rm output/*
hdfs dfs -rm -r -skipTrash /user/team13/project/warehouse
hdfs dfs -rm -r -skipTrash /user/team13/project/hive