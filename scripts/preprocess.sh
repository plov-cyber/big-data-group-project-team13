#!/bin/bash

# Clean everything
rm data/*
rm output/*
hdfs dfs -rmr -skipTrash /user/team13/project/warehouse