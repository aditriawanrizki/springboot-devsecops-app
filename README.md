# Spring Boot DevSecOps Application

## Overview
A Spring Boot 3.5.7 application built with Java 21 and Maven. 


## Technology Stack
- Java 21
- Spring Boot 3.5.7
- Maven
- Spring Web
- Spring Boot Actuator
- Docker

## Build and Test
Run the application tests:
./mvnw test

Build the executable JAR:
./mvnw clean package

The generated JAR is located in `target/`.


## Run Locally
java -jar target/demo-0.0.1-SNAPSHOT.jar

The application listens on port `8080` by default.


## Health Check
Spring Boot Actuator health endpoint:
http://localhost:8080/actuator/health


## Docker
Build the Docker image:
docker build -t springboot-devsecops-app:1.0.0 .

Run the container:
docker run -d --name springboot-app -p 8085:8080 springboot-devsecops-app:1.0.0

Verify application health:
http://localhost:8085/actuator/health


## CI/CD
The application is designed to use a Jenkins Declarative Pipeline and a reusable Jenkins Shared Library for automated testing, packaging, container image publishing, and deployment.

