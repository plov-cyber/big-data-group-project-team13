#!/bin/bash

url="https://disk.yandex.ru/d/ErRH7JdGugYe8A"

wget "$(yadisk-direct $url)" -O data/data.zip

unzip data/data.zip -d data/
cp data/ibd_group_project/*.csv data/
rm -rf data/ibd_group_project
rm data/data.zip
