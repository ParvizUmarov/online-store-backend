#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE cash_operation_db;
    CREATE DATABASE item_db;
    CREATE DATABASE user_db;
    CREATE DATABASE warehouse_db;
EOSQL