# 🏢 HR Synergy — Human Resource Management System

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/Spring%20MVC-6.x-green?style=for-the-badge&logo=spring" />
  <img src="https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate" />
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />
</p>

<p align="center">
  <b>A modern, web-based Human Resource Management System designed to simplify and digitize everyday HR operations.</b>
</p>

---

## ✨ Overview

**HR Synergy** is a full-stack Human Resource Management System built with **Java and Spring Boot**.

The system provides a centralized platform for managing employees, departments, authentication, sessions, and HR-related operations while following a structured **MVC architecture**.

> 🎯 **Goal:** Reduce manual HR processes, improve data management, and provide a centralized digital workspace for HR operations.

---

## 🚀 Key Features

### 👨‍💼 Employee Management

* Add new employees
* Update employee information
* Delete employee records
* View employee details
* Manage employee-related data

### 🔐 Authentication & Security

* User authentication
* Login/logout functionality
* Session management
* Role-based access handling

### 🏢 Department Management

* Create departments
* Manage department information
* Associate employees with departments

### 📊 HR Operations

* Centralized employee database
* CRUD-based HR operations
* Organized employee records
* Server-side form validation

### 🖥️ User Interface

* Responsive web interface
* Server-side rendered pages using Thymeleaf
* Bootstrap-based styling
* Clean and intuitive dashboard

---

## 🛠️ Tech Stack

| Technology            | Purpose                       |
| --------------------- | ----------------------------- |
| ☕ Java                | Core programming language     |
| 🌱 Spring Boot        | Backend framework             |
| 🌐 Spring MVC         | Web architecture              |
| 🗄️ Spring Data JPA   | Database interaction          |
| 🔄 Hibernate          | ORM                           |
| 🎨 Thymeleaf          | Server-side UI                |
| 🐬 MySQL              | Database                      |
| 📦 Maven              | Dependency & build management |
| 🎨 Bootstrap          | Frontend styling              |
| 🔌 REST APIs          | Backend communication         |
| 🔒 Session Management | Authentication state          |
| 🐙 Git & GitHub       | Version control               |
| 🐱 Apache Tomcat      | Application server            |

---

## 🏗️ Architecture

The project follows the **MVC (Model-View-Controller)** architecture.

```text
                    ┌───────────────────┐
                    │      Browser      │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │    Controller     │
                    │   Spring MVC      │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │     Service       │
                    │   Business Logic  │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │    Repository     │
                    │   Spring Data JPA │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │       MySQL       │
                    │     Database      │
                    └───────────────────┘
```

---

## 📁 Project Structure

```text
HRMS/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.hrms/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── entity/
│   │   │       ├── dto/
│   │   │       └── HrmsApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

## 🔄 Application Flow

```text
User
 │
 ▼
Login / Request
 │
 ▼
Controller
 │
 ▼
Service Layer
 │
 ▼
Repository
 │
 ▼
MySQL Database
 │
 ▼
Response
 │
 ▼
Thymeleaf View
```

---

## ⚙️ Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/divyansh1502/HRMS-Project.git
```

### 2️⃣ Open the Project

Open the project in:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3️⃣ Configure MySQL

Create a database:

```sql
CREATE DATABASE hrms;
```

Update your database configuration inside:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hrms
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run:

```text
HrmsApplication.java
```

### 5️⃣ Open in Browser

```text
http://localhost:8080
```

---

## 🧠 What This Project Demonstrates

This project demonstrates practical implementation of:

* Object-Oriented Programming
* MVC Architecture
* Dependency Injection
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate ORM
* CRUD Operations
* REST API development
* Database Design
* MySQL Integration
* Authentication
* Session Management
* Server-side Rendering
* Maven dependency management
* Git & GitHub workflow

---

---

## 🔮 Future Improvements

* 📊 Advanced HR analytics dashboard
* 📈 Employee performance tracking
* 📅 Attendance management
* 💰 Payroll management
* 📧 Automated email notifications
* 📄 Employee document management
* 🔑 JWT-based authentication
* 👥 Advanced role-based authorization
* ☁️ Cloud deployment
* 📱 Improved mobile responsiveness

---

## 👨‍💻 Developer

**Divyansh Singh**

B.Tech CSE | Java Backend Developer

### Tech Interests

```text
Java • Spring Boot • Backend Development
DSA • SQL • REST APIs • System Design
```

---

## ⭐ Support

If you found this project useful, consider giving the repository a ⭐ on GitHub.

<p align="center">
  <b>Built with ☕ Java, 🌱 Spring Boot & ❤️ by Divyansh</b>
</p>
