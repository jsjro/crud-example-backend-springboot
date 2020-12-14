# Crud Example Backend Springboot

## Introduction

This is a web server made with Java 11.

### Available resources

The following resources are available:

+ ``GET /v1/tutorials`` (``JSON``)
+ ``POST /v1/tutorials``
+ ``DELETE /v1/tutorials``
+ ``GET /v1/tutorials/:id`` (``JSON``)
+ ``PUT /v1/tutorials/:id``
+ ``DELETE /v1/tutorials/:id``
+ ``GET /v1/tutorials/published`` (``JSON``)

### Back-end

The back-end is using an [PostgreSQL database](https://www.postgresql.org) behind to store the tutorial.

## How to build and execute it

### Requirements

+ git
+ Java 11
+ Maven 3

Just clone this project and execute ``mvn package``. Then, go to the ``target``folder and execute ``java -jar crudExampleBackendSpringboot-0.0.1-SNAPSHOT.jar``.