# syntax=docker/dockerfile:1
FROM mongo:7.0.0-rc5-jammy

ENV MONGODB_INITDB_DATABASE MediscreenDatabase

ADD initdb.js /docker-entrypoint-initdb.d/
