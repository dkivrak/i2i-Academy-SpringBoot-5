# i2i Academy Spring Boot Homework

This repository contains a basic Spring Boot REST API project created for the i2i Academy Spring Boot homework.

## Project Overview

The purpose of this project is to create a simple Java web application using Spring Boot, understand the basic project structure, and deploy the application both locally and on a Cloud Virtual Machine.

The application includes simple REST endpoints that return text responses to verify that the service is running successfully.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- Spring Web
- Google Cloud VM
- Git & GitHub

## REST Endpoints

| Method | Endpoint | Response |
|---|---|---|
| GET | `/` | `Welcome to i2i Academy` |
| GET | `/hello` | `Hello World` |

## Running Locally

Make sure Java 21 is installed on your machine.

Clone the repository:

```bash
git clone https://github.com/dkivrak/i2i-Academy-SpringBoot-5.git
```

Go into the project directory:

```bash
cd i2i-Academy-SpringBoot-5
```

Run the application:

```bash
./mvnw spring-boot:run
```

Open the application in your browser:

```bash
http://localhost:8080
```

Expected output:

Welcome to i2i Academy



## Cloud Deployment

The project was also deployed on a Google Cloud VM. Java 21, Maven, and Git were installed on the VM, then the project was cloned from GitHub and started using the Maven wrapper.

The application was tested successfully through the VM external IP address on port 8080.

## Repository Structure
.
├── src
│   └── main
│       ├── java
│       │   └── springboot
│       │       ├── SpringbootApplication.java
│       │       └── WelcomeController.java
│       └── resources
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
