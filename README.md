#  TechOverflow — Full Stack Blog Platform

A modern **full-stack blog application** built with **Spring Boot + React (Vite)** featuring authentication, JWT security, and REST APIs.


---

## 📸 Screenshots

> Add screenshots here (Home, Login, Dashboard)
> <img width="1920" height="1080" alt="Screenshot (23)" src="https://github.com/user-attachments/assets/a2a6ba87-3c2d-4bf1-9c8f-61450265f76d" />
<img width="1920" height="1080" alt="Screenshot (24)" src="https://github.com/user-attachments/assets/d50cabe4-c632-4db4-9b89-2da594b0fd1e" />
> <img width="1920" height="1080" alt="Screenshot (25)" src="https://github.com/user-attachments/assets/3f7c42fd-16e8-4486-bf7b-e1c33a3cda38" />
<img width="1920" height="1080" alt="Screenshot (26)" src="https://github.com/user-attachments/assets/5eda688d-733f-48f0-8819-95d5e5eea8c6" />
> 





---

## 🛠️ Tech Stack

### 🔹 Backend

* Java 21
* Spring Boot 3
* Spring Security (JWT Authentication)
* Spring Data JPA (Hibernate)
* PostgreSQL (Dockerized)
* Lombok
* MapStruct

### 🔹 Frontend

* React + Vite
* TypeScript
* Tailwind CSS
* Axios

### 🔹 DevOps

* Docker & Docker Compose
* Git & GitHub

---

## ✨ Features

### 🔐 Authentication

* JWT-based login system
* Secure API endpoints
* Stateless session management

### 📝 Blog System

* Create, update, delete posts
* Draft & publish system
* Categories & tags
* Reading time calculation

### 📊 Data Management

* PostgreSQL database
* RESTful API design
* DTO mapping (MapStruct)

---

## 📂 Project Structure

```
techoverflow/
│
├── blog/                # Backend (Spring Boot)
│   └── blog/
│       ├── src/
│       └── pom.xml
│
├── frontend/            # Frontend (React + Vite)
│   ├── src/
│   └── package.json
│
└── README.md
```

---

## ⚙️ Setup Instructions

### 🔹 1. Clone Repository

```bash
git clone https://github.com/your-username/techoverflow.git
cd techoverflow
```

---

### 🔹 2. Run Backend (Spring Boot)

```bash
cd blog/blog
mvn spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

---

### 🔹 3. Run Frontend (React)

```bash
cd frontend
npm install
npm run dev
```

Frontend runs on:

```
http://localhost:5173
```

---

### 🔹 4. Run Database (Docker)

```bash
docker-compose up -d
```

---

## 🔑 Environment Variables

### Backend (`application.properties`)

```
spring.datasource.url=jdbc:postgresql://localhost:5433/blog
spring.datasource.username=postgres
spring.datasource.password=your_password

jwt.secret=your-secret-key
```

---

## 🔌 API Endpoints

| Method | Endpoint             | Description    |
| ------ | -------------------- | -------------- |
| POST   | `/api/v1/auth/login` | Login          |
| GET    | `/api/v1/posts`      | Get all posts  |
| POST   | `/api/v1/posts`      | Create post    |
| GET    | `/api/v1/categories` | Get categories |
| GET    | `/api/v1/tags`       | Get tags       |

---

## 🔒 Authentication Flow

1. User logs in → receives JWT token
2. Token stored in `localStorage`
3. Token sent in headers:

```
Authorization: Bearer <token>
```

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repo
2. Create feature branch
3. Commit changes
4. Open Pull Request

---

##  License

This project is licensed under the MIT License.

---

##  Author

**Mahfooz Alam**

* GitHub: https://github.com/mahfoozalamcse
* LinkedIn: (https://in.linkedin.com/in/mahfooz-alam-116b2a2b7)

---

⭐ If you like this project, give it a star!
