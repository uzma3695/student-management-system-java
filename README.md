# Student Management System (Java + MySQL)

This is a simple console-based Student Management System built using **Java and MySQL**.  
I created this project to practice connecting Java with a database using **JDBC** and performing basic CRUD operations.
The system allows users to manage student records through a menu-driven interface in the terminal.

## Features

- Add a new student
- View all students
- Update student details
- Delete student records

## Technologies Used

- Java
- JDBC
- MySQL

## Project Structure
student-management-system-java
│
├── DBConnection.java
├── StudentDAO.java
├── Main.java
└── mysql-connector-j-9.6.0.jar
## How to Run the Project
Compile the project:
javac -cp ".;mysql-connector-j-9.6.0.jar" *.java
Run the program:
java -cp ".;mysql-connector-j-9.6.0.jar" Main

## About the Project
This project demonstrates how Java applications can interact with a MySQL database using JDBC. 
It performs basic **CRUD operations (Create, Read, Update, Delete)** on student records.
This was built as a **beginner-friendly project to understand database connectivity and Java application structure**.
