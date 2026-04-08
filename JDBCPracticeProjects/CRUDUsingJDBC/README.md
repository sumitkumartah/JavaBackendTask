# 🎓 Student Management System (JDBC CRUD Project)

## 📌 Project Overview
The **Student Management System** is a Java-based console application that performs CRUD (Create, Read, Update, Delete) operations using **JDBC with PostgreSQL**.

This project demonstrates:
- Connecting Java applications to a database
- Executing SQL queries using JDBC
- Using DAO (Data Access Object) design pattern
- Building a menu-driven console application

---

## ⚙️ Tech Stack
- ☕ Java
- 🔌 JDBC (Java Database Connectivity)
- 🐘 PostgreSQL
- 🧠 Object-Oriented Programming (OOP)

---

## 🚀 Features
- ➕ Insert new student record
- 📄 View all students
- ✏️ Update student details (Name / Marks)
- ❌ Delete student by ID
- 🔁 Continuous menu-driven execution

---

## 📂 Project Structure
com
├── DAO
│   └── StudentDao.java
├── DBCONNECTION
│   └── DBConnecttion.java
├── Entry
│   └── Student.java
├── Main
│   └── Main.java

---

## 🗄️ Database Setup

### Database Name
CRUD_Proj_DB

### Table Schema
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    marks INT
);

---

## 🔌 Database Configuration
private static final String URL = "jdbc:postgresql://localhost:5432/CRUD_Proj_DB";
private static final String UNAME = "postgres";
private static final String pass = "1234";

---

## 🛠️ Setup Instructions
1. Install PostgreSQL
2. Create database: CRUD_Proj_DB
3. Add PostgreSQL JDBC Driver (postgresql-<version>.jar)
4. Compile:
   javac com/Main/Main.java
5. Run:
   java com.Main.Main

---

## ▶️ Application Workflow
1. Insert
2. Read
3. Update
4. Delete
5. Exit

---

## 🧪 Sample Output
1 - Sumit - 90
2 - Rahul - 85

---

## ⚠️ Known Issue & Fix
Issue: nextLine() skips input after nextInt()

Fix:
sc.nextLine();
String name = sc.nextLine();

---

## 📌 Best Practices
- Used PreparedStatement
- Closed DB connections
- Followed DAO pattern


