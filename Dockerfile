# syntax=docker/dockerfile:1
FROM mongo:latest

ENV MONGODB_DATABASE=MediscreenDatabase

ADD Notes.json /docker-entrypoint-Notes.d