# CS 305 Secure Coding Project: SSL Server

This repository contains a secure coding course project from CS 305. The application is a small Java Spring Boot service for the fictional client **Artemis Financial**. It demonstrates HTTPS configuration, SHA-256 hashing, and dependency vulnerability review using OWASP Dependency-Check.

## Project Overview

Artemis Financial needed a way to secure internal software communication between client and server systems. This project focuses on applying secure software practices to improve confidentiality, integrity, and secure configuration.

## What This Project Demonstrates

- HTTPS/TLS configuration for a Spring Boot application
- SHA-256 hashing through a REST endpoint
- Maven-based dependency management
- OWASP Dependency-Check integration
- Secure repository hygiene by excluding local certificates, compiled artifacts, and IDE metadata

## Tech Stack

- Java 8
- Spring Boot
- Maven
- OWASP Dependency-Check Maven Plugin

## Main Endpoint

```text
GET /hash?data=HelloWorld
```

Example response:

```text
Data: HelloWorld
SHA-256 Hash: <generated SHA-256 hash>
```

## Security Notes

The original course submission included local development certificate material and generated build artifacts. Those files were intentionally removed from this public repository because local certificate files, compiled artifacts, and IDE metadata should not normally be committed to GitHub.

To run the project locally, create your own development certificate material and keep it outside version control. The `.gitignore` file is configured to avoid committing common local certificate and environment files.

## Running the Project

From the project root:

```bash
mvn spring-boot:run
```

The app runs on:

```text
https://localhost:8443/hash
```

Because the certificate is self-signed, the browser may show a local development warning.

## Dependency Review

The project includes OWASP Dependency-Check in `pom.xml`. To run a dependency scan:

```bash
mvn dependency-check:check
```

The generated report is written to the Maven `target/` directory and is not committed to the repository.

## Portfolio Framing

This project demonstrates basic secure coding and application security concepts: HTTPS configuration, hashing, dependency review, certificate handling, and safe repository cleanup before public release.

**Author:** Ryan Peguero  
**Course:** CS 305 Secure Software Development
