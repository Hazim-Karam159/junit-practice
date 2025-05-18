# 🎯 Unit Testing with JUnit and Spring Boot – Full Course Practice Repository

![Java](https://img.shields.io/badge/Java-21-blue.svg) 
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green) 
![JUnit 5](https://img.shields.io/badge/JUnit-5.9-red)
![Maven](https://img.shields.io/badge/Maven-3.8-blue)

This repository contains my full hands-on practice and implementation based on the **Unit Testing with JUnit and Spring Boot** course. Every section, concept, and project has been fully applied, tested, and customized to enhance understanding.

---

## 📌 Table of Contents
- [📚 Course Contents & Practical Implementation](#-course-contents--practical-implementation)
- [🚀 Spring Boot Unit Testing](#-spring-boot-unit-testing)
- [🧪 Mockito - Mocking Framework](#-mockito---mocking-framework)
- [🧠 Reflection TestUtils](#-reflection-testutils)
- [💼 Course Project: Student Gradebook System](#-course-project-student-gradebook-system)
- [🌐 REST API Testing](#-rest-api-testing)
- [✅ Tools & Technologies Used](#-tools--technologies-used)
- [📦 How to Run](#-how-to-run)
- [🙌 Final Words](#-final-words)

---

## 📚 Course Contents & Practical Implementation

### 🧪 JUnit Basics
- Introduction to Unit Testing
- Writing Basic JUnit Tests
- Lifecycle Methods (@BeforeEach, @AfterEach)
- Custom Display Names
- Assertions:
  - assertEquals / assertNotEquals
  - assertNull / assertNotNull
  - assertSame / assertNotSame
  - assertTrue / assertFalse
  - assertArrayEquals / assertLinesMatch / assertIterableEquals
  - assertThrows / assertTimeout

### 🧬 Test Lifecycle & Organization
- Test Case Lifecycle
- Test Ordering with @Order and @TestMethodOrder
- Conditional Tests using:
  - @Disabled
  - @EnabledOnOs, @EnabledOnJre, @EnabledIfEnvironmentVariable
- Parameterized Tests with @ValueSource, @CsvSource

### 📈 Code Coverage
- Code Coverage using IntelliJ
- Code Coverage using Maven + JaCoCo

### 🧠 Test Driven Development (TDD)
- FizzBuzz Project
- Red-Green-Refactor Approach

---

## 🚀 Spring Boot Unit Testing
- Project Setup & Dependencies
- Testing with `@SpringBootTest`
- Using application.properties for test configs
- Testing Spring Beans
- Working with Prototype Beans

---

## 🧪 Mockito - Mocking Framework
- Basics of Mockito
- Creating Mocks and Injecting Dependencies
- MockitoBean Configuration
- Throwing Exceptions with Mocks

---

## 🧠 Reflection TestUtils
- Using Reflection to Test Private Fields/Methods

---

## 💼 Course Project: Student Gradebook System

### 🧩 Service Layer Testing
- `StudentAndGradeServiceTest`:
  - Creating Failing Tests
  - Implementing Service and Repository
  - Deleting Students
  - GradeBook Tests
  - SQL Integration Tests with `@Sql`

### 🖥️ MVC Web Controller Testing
- Testing GET/POST/DELETE Methods
- Asserting View Names
- Handling UI and Error Scenarios

### 🧪 MVC TDD Approach
- Testing Grade Services (Math, Science, History)
- Delete Grades and Handle Invalid Data
- Refactoring with Collections and Reusability

---

## 🗃️ Integration with Databases
- H2 Embedded DB Setup
- MySQL Database Schema Creation
- application-test.properties Configuration

---

## 🌐 REST API Testing
- Full Coverage of REST Endpoints:
  - Get All Students
  - Create Student
  - Create/Delete Grades
  - Handle Invalid Inputs via REST
- GradebookController REST Tests (GET, POST, DELETE)

---

## ✅ Tools & Technologies Used
- Java
- JUnit 5
- Spring Boot
- Mockito
- IntelliJ IDEA
- Maven
- H2 / MySQL
- JaCoCo (Code Coverage)
- Thymeleaf (for Web Views)

---

## 📦 How to Run
1. Clone the repository.
2. Navigate to the project folder.
3. Run tests using:
   - `mvn test` (for Maven)
   - or via your IDE (e.g., IntelliJ)
4. View coverage reports in the `/target/site/jacoco/index.html`

---

## 🙌 Final Words

This repository is the result of actively watching, coding along, and applying each concept from the course. It serves as a complete reference and solid foundation for mastering unit testing in real-world Spring Boot applications.

---
