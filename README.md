# 🛒 E-Commerce Microservices Project
### Built with Spring Boot 3, Spring Cloud, Kafka and Docker

---

## 📖 Overview

This project is a **microservices-based e-commerce application** built using **Spring Boot 3.  
It demonstrates a full distributed architecture with inter-service communication, asynchronous messaging, centralized configuration, and distributed tracing.

The system is composed of multiple independent microservices communicating through REST APIs and Kafka.  
Each service is containerized using Docker, and the infrastructure includes databases, message brokers, and monitoring tools.

---


### Microservices

| Service | Description | Technology | Database |
|----------|-------------|-------------|-----------|
| **Customer Service** | Manages customers and their profiles | Spring Boot | MongoDB |
| **Product Service** | Manages products and inventory | Spring Boot | PostgreSQL |
| **Order Service** | Handles order creation and order lines | Spring Boot | PostgreSQL |
| **Payment Service** | Processes payments and sends payment confirmations via Kafka | Spring Boot | PostgreSQL |
| **Notification Service** | Listens to Kafka topics and sends email notifications | Spring Boot | MongoDB |
| **API Gateway** | Routes all external requests to the correct service | Spring Cloud Gateway | — |
| **Config Server** | Centralized configuration for all services | Spring Cloud Config | — |
| **Eureka Server** | Service discovery and registry | Spring Cloud Netflix Eureka | — |

### Supporting Services

| Component | Role | Port |
|------------|------|------|
| **PostgreSQL** | Relational database for Product, Order, and Payment | 6432 |
| **MongoDB** | NoSQL database for Customer and Notification services | 27017 |
| **Kafka + Zookeeper** | Asynchronous message broker | 9092 / 2181 |
| **MailDev** | Local mail server for testing notifications | 1080 / 1025 |
| **Zipkin** | Distributed tracing for monitoring microservice communication | 9411 |
| **Keycloak** | Identity and access management for securing endpoints | 9098 |
| **PgAdmin** | Web UI for PostgreSQL database | 5050 |

---

## ⚙️ Prerequisites

Before starting, make sure you have the following installed:

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/)
- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/e-commerce-microservices.git
cd e-commerce-microservices
