#!/bin/bash

# Clean local files
rm data/*
rm output/*
rm -rf models/*
rm -rf scripts/.ipynb_checkpoints
rm -rf sql/.ipynb_checkpoints

# Clean hdfs files
hdfs dfs -rm -r -skipTrash /user/team13/project/*