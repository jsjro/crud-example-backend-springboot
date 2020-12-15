# Crud Example Backend Springboot

## Introduction

This is a web server made with Java 11.

### Available resources

The following resources are available:

+ ``GET /api/posts`` (``JSON``)
+ ``POST /api/posts``
+ ``DELETE /api/posts``
+ ``GET /api/posts/:id`` (``JSON``)
+ ``PUT /api/posts/:id``
+ ``DELETE /api/posts/:id``
+ ``GET /api/posts/published`` (``JSON``)

### Back-end

The back-end is using an [PostgreSQL database](https://www.postgresql.org) behind to store the post.

## How to build and execute it

### Requirements

+ git
+ Java 11
+ Maven 3

Just clone this project and execute ``mvn package``.
Then, go to the ``target``folder and execute ``java -jar crudExampleBackendSpringboot-0.0.1-SNAPSHOT.jar``.

### Swagger UI

+ ``http://localhost:8080/swagger-ui.html``