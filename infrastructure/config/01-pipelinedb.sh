#!/bin/bash

set -o errexit

main() {
  init_db
}

init_db() {
  psql -v ON_ERROR_STOP=1 --username "pipeline" <<-EOSQL
     CREATE DATABASE firstpipeline;
     \connect firstpipeline;
     CREATE SCHEMA testSchema;
EOSQL
}

main "$@"
