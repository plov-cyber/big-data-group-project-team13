"""
Python script that builds the projectdb database in PostgreSQL
"""

import os
from pprint import pprint
import psycopg2 as psql

# Read password from secrets file
FILE = os.path.join("secrets", ".psql.pass")
with open(FILE, "r", encoding="utf-8") as file:
    PASSWORD = file.read().rstrip()

# build connection string
CONN_STRING = (
    f"host=hadoop-04.uni.innopolis.ru port=5432 "
    f"user=team13 dbname=team13_projectdb password={PASSWORD}"
)

# Connect to the remote dbms
with psql.connect(CONN_STRING) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "create_tables.sql"), "r", encoding="utf-8") as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql"), "r", encoding="utf-8") as file:
        # We assume that the COPY commands in the file are ordered (1.depts, 2.emps)
        commands = file.readlines()

        files = sorted(list(filter(lambda path: '.csv' in path, os.listdir("data"))))
        files.remove("objects.csv")
        files = ["objects.csv"] + files

        for idx, file in enumerate(files):
            with open(os.path.join("data", file), "r", encoding="utf-8") as table:
                cur.copy_expert(commands[idx], table)

    # If the SQL statements are CRUD then you need to commit the change
    conn.commit()

    pprint(conn)
    cur = conn.cursor()

    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql"), "r", encoding="utf-8") as file:
        commands = file.readlines()
        for command in commands:
            cur.execute(command)
            # Read all records and print them
            pprint(cur.fetchall())
