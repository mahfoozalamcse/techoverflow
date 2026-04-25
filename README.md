# TechOverflow – Enterprise-Grade Full Stack Blog Platform

<div align="center">

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-6DB33F?logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-18-61DAFB?logo=react&logoColor=black)](https://react.dev)
[![TypeScript](https://img.shields.io/badge/TypeScript-5.0-3178C6?logo=typescript&logoColor=white)](https://www.typescriptlang.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14+-336791?logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?logo=docker&logoColor=white)](https://www.docker.com/)

A modern, production-ready full-stack blog platform combining **Spring Boot 3** backend with **React + TypeScript** frontend, featuring enterprise-grade authentication, JWT security, and comprehensive REST APIs.

[Features](#features) • [Tech Stack](#tech-stack) • [Setup](#setup) • [API Documentation](#api-endpoints) • [Contributing](#contributing)

</div>

---

## 📸 Screenshots

<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/a2a6ba87-3c2d-4bf1-9c8f-61450265f76d" width="100%"></td>
    <td><img src="https://github.com/user-attachments/assets/d50cabe4-c632-4db4-9b89-2da594b0fd1e" width="100%"></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/3f7c42fd-16e8-4486-bf7b-e1c33a3cda38" width="100%"></td>
    <td><img src="https://github.com/user-attachments/assets/5eda688d-733f-48f0-8819-95d5e5eea8c6" width="100%"></td>
  </tr>
</table>

---

## ✨ Features

### 🔐 Security & Authentication
- **JWT-based Authentication**: Secure token-based authentication with configurable expiration
- **Role-Based Access Control**: Fine-grained permission management
- **Spring Security Integration**: Industry-standard security framework with stateless session management
- **Secure API Endpoints**: Protected routes with token validation

### 📝 Content Management
- **Blog Post Management**: Create, read, update, and delete blog posts with full CRUD operations
- **Draft & Publish System**: Save drafts before publishing to production
- **Categorization & Tagging**: Organize content with flexible categories and tags
- **Automatic Metadata**: Reading time calculation and timestamp tracking
- **Rich Content Support**: Markdown-ready post structure for flexible formatting

### 📊 Data & Performance
- **Relational Database**: PostgreSQL with optimized schemas and indexes
- **RESTful API Architecture**: Standards-compliant API design for seamless integration
- **DTO Mapping**: MapStruct for efficient data transfer object transformations
- **Lazy Loading**: Optimized data retrieval strategies

### 🚀 Developer Experience
- **Type Safety**: Full TypeScript frontend for reduced runtime errors
- **Hot Module Replacement**: Vite's HMR for instant feedback during development
- **Docker Containerization**: One-command setup with Docker Compose
- **Comprehensive Documentation**: Well-organized API endpoints and setup guides

---

## 🛠️ Tech Stack

### Backend Architecture
| Component | Technology | Version |
|-----------|-----------|---------|
| **Language** | Java | 21 LTS |
| **Framework** | Spring Boot | 3.x |
| **Security** | Spring Security + JWT | - |
| **ORM** | Spring Data JPA (Hibernate) | - |
| **Database** | PostgreSQL | 14+ |
| **Mapping** | MapStruct | Latest |
| **Utilities** | Lombok | Latest |

### Frontend Architecture
| Component | Technology | Version |
|-----------|-----------|---------|
| **Framework** | React | 18.x |
| **Build Tool** | Vite | 5.x |
| **Language** | TypeScript | 5.x |
| **Styling** | Tailwind CSS | 3.x |
| **HTTP Client** | Axios | Latest |
| **State Management** | React Hooks | - |

### DevOps & Infrastructure
| Tool | Purpose |
|------|---------|
| **Docker** | Containerization of all services |
| **Docker Compose** | Multi-container orchestration |
| **Git** | Version control |
| **GitHub** | Repository hosting & collaboration |

---

## 📂 Project Structure

```
techoverflow/
│
├── blog/                                # Spring Boot Backend
│   └── blog/
│       ├── src/
│       │   ├── main/java/com/techoverflow/
│       │   │   ├── auth/               # Authentication & Security
│       │   │   ├── post/               # Blog Post Management
│       │   │   ├── category/           # Category Management
│       │   │   ├── tag/                # Tag Management
│       │   │   ├── dto/                # Data Transfer Objects
│       │   │   ├── entity/             # JPA Entities
│       │   │   ├── repository/         # Data Access Layer
│       │   │   ├── service/            # Business Logic
│       │   │   ├── controller/         # REST Controllers
│       │   │   └── config/             # Configuration Classes
│       │   └── resources/
│       │       └── application.properties
│       ├── pom.xml                     # Maven Dependencies
│       └── Dockerfile
│
├── frontend/                            # React + TypeScript Frontend
│   ├── src/
│   │   ├── components/                 # Reusable UI Components
│   │   ├── pages/                      # Page Components
│   │   ├── services/                   # API Services (Axios)
│   │   ├── hooks/                      # Custom React Hooks
│   │   ├── types/                      # TypeScript Interfaces
│   │   ├── utils/                      # Utility Functions
│   │   ├── styles/                     # Tailwind CSS Styles
│   │   ├── App.tsx
│   │   └── main.tsx
│   ├── package.json
│   ├── tsconfig.json
│   ├── vite.config.ts
│   ├── Dockerfile
│   └── .dockerignore
│
├── docker-compose.yml                  # Multi-container Setup
├── .gitignore
└── README.md                           # This File

```

---

## ⚙️ Quick Start Guide

### Prerequisites
- Java 21 JDK
- Node.js 18+ & npm
- Docker & Docker Compose
- Git

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/mahfoozalamcse/techoverflow.git
cd techoverflow
```

### 2️⃣ Start Database (Docker)

```bash
docker-compose up -d
```

This starts PostgreSQL on port 5433.

### 3️⃣ Configure Backend Environment

Create `blog/blog/src/main/resources/application.properties`:

```properties
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5433/blog
spring.datasource.username=postgres
spring.datasource.password=your_secure_password
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# JWT Configuration
jwt.secret=your_very_secure_jwt_secret_key_min_32_chars
jwt.expiration=86400000

# Server Configuration
server.port=8080
server.servlet.context-path=/api/v1
```

### 4️⃣ Run Backend (Spring Boot)

```bash
cd blog/blog
mvn clean install
mvn spring-boot:run
```

Backend runs at: **http://localhost:8080**

### 5️⃣ Run Frontend (React + Vite)

Open a new terminal:

```bash
cd frontend
npm install
npm run dev
```

Frontend runs at: **http://localhost:5173**

### ✅ Verify Setup

- Backend Health: `curl http://localhost:8080/health`
- API Documentation: Visit backend Swagger/OpenAPI endpoint
- Frontend: Open browser to `http://localhost:5173`

---

## 🔌 API Endpoints

### Authentication Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---|
| `POST` | `/auth/login` | User login with email & password | ❌ |
| `POST` | `/auth/register` | User registration | ❌ |
| `POST` | `/auth/refresh` | Refresh JWT token | ✅ |

### Blog Post Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---|
| `GET` | `/posts` | Fetch all published posts (paginated) | ❌ |
| `GET` | `/posts/{id}` | Fetch single post by ID | ❌ |
| `POST` | `/posts` | Create new post | ✅ |
| `PUT` | `/posts/{id}` | Update existing post | ✅ |
| `DELETE` | `/posts/{id}` | Delete post | ✅ |
| `GET` | `/posts/user/{userId}` | Get user's posts | ✅ |
| `PATCH` | `/posts/{id}/publish` | Publish draft post | ✅ |

### Category Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---|
| `GET` | `/categories` | Fetch all categories | ❌ |
| `POST` | `/categories` | Create new category | ✅ |
| `DELETE` | `/categories/{id}` | Delete category | ✅ |

### Tag Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---|
| `GET` | `/tags` | Fetch all tags | ❌ |
| `POST` | `/tags` | Create new tag | ✅ |
| `DELETE` | `/tags/{id}` | Delete tag | ✅ |

---

## 🔐 Authentication Flow

### JWT Token Lifecycle

```mermaid
graph LR
    A[User Login] -->|Email + Password| B[Backend Validation]
    B -->|Valid| C[Generate JWT Token]
    C -->|Token| D[Store in localStorage]
    D -->|Authorization Header| E[Subsequent Requests]
    E -->|Token Validation| F{Valid Token?}
    F -->|Yes| G[Process Request]
    F -->|No| H[Return 401 Unauthorized]
```

### Token Structure

```
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

### How It Works

1. **Login**: User provides credentials → Backend validates → JWT token issued
2. **Storage**: Token stored securely in browser's `localStorage`
3. **Transmission**: Token included in `Authorization` header for authenticated requests
4. **Validation**: Backend verifies signature and expiration before processing
5. **Refresh**: Expired tokens can be refreshed using `/auth/refresh` endpoint

---

## 📋 Environment Variables Reference

### Backend (`application.properties`)

```properties
# Server
server.port=8080
server.servlet.context-path=/api/v1

# Database
spring.datasource.url=jdbc:postgresql://HOST:PORT/DATABASE
spring.datasource.username=USER
spring.datasource.password=PASSWORD
spring.jpa.hibernate.ddl-auto=update

# JWT
jwt.secret=MINIMUM_32_CHARACTER_SECRET_KEY
jwt.expiration=86400000

# Logging
logging.level.root=INFO
logging.level.com.techoverflow=DEBUG
```

### Frontend (`.env`)

```env
VITE_API_URL=http://localhost:8080
VITE_API_TIMEOUT=10000
VITE_APP_NAME=TechOverflow
```

---

## 🚀 Deployment

### Docker Deployment

Build and run using Docker Compose:

```bash
docker-compose -f docker-compose.yml up --build
```

Services:
- Backend: `http://localhost:8080`
- Frontend: `http://localhost:3000`
- Database: PostgreSQL on port 5433

### Production Considerations

- Use environment-specific configuration files
- Enable HTTPS with SSL certificates
- Implement rate limiting and API throttling
- Configure CORS appropriately
- Use secrets management (AWS Secrets Manager, HashiCorp Vault)
- Implement comprehensive logging and monitoring
- Set up automated backups for PostgreSQL

---

## 🧪 Testing

### Backend Testing

```bash
cd blog/blog
mvn test
```

### Frontend Testing

```bash
cd frontend
npm run test
```

---

## 🤝 Contributing

We welcome contributions from the community! Please follow these guidelines:

### Development Workflow

1. **Fork** the repository
   ```bash
   git clone https://github.com/YOUR_USERNAME/techoverflow.git
   ```

2. **Create Feature Branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```

3. **Commit Changes**
   ```bash
   git commit -m "Add amazing feature"
   ```

4. **Push to Branch**
   ```bash
   git push origin feature/amazing-feature
   ```

5. **Open Pull Request** on GitHub

### Code Standards
- Follow Java/TypeScript style guides
- Write meaningful commit messages
- Include tests for new features
- Update documentation accordingly

---

## 📄 License

This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Mahfooz Alam**

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-mahfoozalamcse-181717?logo=github)](https://github.com/mahfoozalamcse)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Mahfooz%20Alam-0077B5?logo=linkedin)](https://linkedin.com/in/mahfooz-alam-116b2a2b7)

</div>

---

## 🙏 Acknowledgments

- Spring Boot & Spring Security teams for excellent framework
- React and Vite for modern frontend tooling
- PostgreSQL for reliable database
- Community contributors and feedback

---

<div align="center">

**⭐ If you find this project helpful, please consider giving it a star!**

[Back to Top](#techoverflow--enterprise-grade-full-stack-blog-platform)

</div>
