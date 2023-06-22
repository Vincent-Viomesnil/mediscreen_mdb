## syntax=docker/dockerfile:1
#FROM mongo:latest
#
#ENV MONGODB_DATABASE=MediscreenDatabase
#
#ADD Notes.json /docker-entrypoint-initdb.d/Notes.json
#

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /patient_mdb

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]