# 🛒 E-Commerce RESTful Backend API

A production-grade, multi-tier E-Commerce REST API built with **Java 21**, **Spring Boot 3**, **Spring Security 6 (JWT)**, **Spring Data JPA**, and **PostgreSQL**.

---

## 🌐 Live API Documentation & Interactive Demo
- **Live Swagger UI:** `https://ecommerce-backend-api-7a68.onrender.com/swagger-ui.html`

---

## 🚀 Tech Stack & Tools
- **Language & Core:** Java 21 / 24
- **Framework:** Spring Boot 3.x
- **Security:** Spring Security 6, JWT (JJWT), BCrypt Password Hashing
- **Database & Persistence:** PostgreSQL, Spring Data JPA, Hibernate
- **Containerization & Deployment:** Docker, Docker Compose, Render
- **Documentation:** SpringDoc OpenAPI 3 / Swagger UI
- **Testing:** JUnit 5, Mockito
- **Build Tool:** Maven

---

## ✨ Key Features & Architecture
- **Stateless JWT Authentication:** Secure login/registration flows returning signed JWT tokens.
- **Role-Based Access Control (RBAC):** Public read-only endpoints, customer shopping flows, and protected `ROLE_ADMIN` management endpoints.
- **Transactional Stock Management (`@Transactional`):** Atomic conversion of active user cart items into orders, with real-time inventory decrementing and automatic rollback protection.
- **Pagination & Dynamic Sorting:** Scalable catalog queries powered by Spring Data `Pageable` and `Sort`.
- **Global Error Handling:** Centralized exception mapping (`@RestControllerAdvice`) returning structured JSON error payloads.

---

## 🛠️ Local Setup with Docker Compose

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/logic-smith/ecommerce-backend.git](https://github.com/logic-smith/ecommerce-backend.git)
   cd ecommerce-backend
   ```
