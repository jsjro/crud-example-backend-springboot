# Crud Example Backend Springboot

## Introduction

CRUD REST api server

### Available resources

The following resources are available:

+ ``GET /api/posts`` (``JSON``) : getAllPosts
+ ``GET /api/posts/:id`` (``JSON``) : getPostById
+ ``POST /api/posts`` : createPost
+ ``PUT /api/posts/:id`` : updatePost
+ ``DELETE /api/posts/:id`` : deletePost
+ ``DELETE /api/posts`` : deleteAllPosts
+ ``GET /api/posts/status`` (``JSON``) : findByStatus

### Back-end

The back-end is using an [PostgreSQL database](https://www.postgresql.org) behind to store the post.

## How to build and execute it

### Requirements

+ git
+ Java 11
+ Maven 3

### Dependency

+ springboot-web
+ springboot-data-jpa
+ swagger2
+ postgresql

### Run Spring Boot application

```
mvn spring-boot:run
```

### Connected Swagger UI

+ ``http://localhost:8080/swagger-ui.html``