# Reference Data Aggregation Service (RDAS)

## Project Overview

The Reference Data Aggregation Service (RDAS) is a Spring Boot microservice that acts as a centralized source of truth for country reference data.

The service exposes REST APIs while consuming the CountryInfo SOAP Service internally.

RDAS solves the following challenges:

* Inconsistent SOAP integrations across channels
* Poor performance due to repeated SOAP requests
* Lack of filtering and pagination
* No centralized caching strategy
* Exposure of SOAP credentials
* Lack of auditability

---

## Features

* Search countries
* Filter by continent
* Filter by currency
* Filter by language
* Retrieve country details
* Retrieve countries sharing the same currency
* Pagination support
* Sorting support
* Caching support
* Global error handling
* Input validation
* Swagger/OpenAPI documentation

---

## Technology Stack

### Backend

* Java 17
* Spring Boot 3
* Maven

### Documentation

* OpenAPI / Swagger

### Caching

* Caffeine Cache

### Containerization

* Docker

### Orchestration

* Kubernetes

---

## Project Structure

src/main/java

* controller
* service
* client
* dto
* exception
* config

src/test/java

* unit tests
* integration tests

kubernetes

* deployment.yaml
* service.yaml
* configmap.yaml
* secret.yaml
* hpa.yaml

---

## Local Setup

### Prerequisites

* Java 17
* Maven 3.9+
* Git
* VS Code

### Clone Repository

git clone <repository-url>

cd RDAS

### Build Application

mvn clean install

### Run Application

mvn spring-boot:run

---

## API Documentation

Swagger UI:

http://localhost:8080/swagger-ui.html

---

## Configuration

application.yml

server:
port: 8080

cache:
ttl-hours: 24

soap:
wsdl-url: http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL

---

## Running Tests

Run all tests:

mvn test

Generate test report:

mvn verify

---

## Docker

Build Image:

docker build -t rdas:1.0 .

Run Container:

docker run -p 8080:8080 rdas:1.0

---

## Kubernetes

Deployment files are located under:

/kubernetes

Refer to:

docs/Kubernetes-Deployment-Guide.pdf

---

## Monitoring

Spring Boot Actuator endpoints:

/actuator/health

/actuator/info

---

## Author

Tabitha Wanjiku Mwangi
