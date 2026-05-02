# 🧪 Web Shop UI Test Automation Framework

A scalable and maintainable **UI Test Automation Framework** built using **Java, Selenium WebDriver, and TestNG**.  
The framework follows the **Page Object Model (POM)** design pattern and includes reporting with **ExtentReports**.

This project demonstrates practical skills in building real-world automation frameworks.

---

## 🚀 Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- ExtentReports
- Page Object Model (POM)

---

## 🌐 Application Under Test

https://demowebshop.tricentis.com

---

## 🏗️ Framework Architecture

The framework is designed for **scalability, maintainability, and reusability**.

### Main Layers:

- **pages** → Page Object classes (UI elements + actions)
- **tests** → Test cases and validations
- **base** → WebDriver setup and teardown
- **config** → Configuration management (properties)
- **utils** → Utility classes (ExtentReports, helpers)

---

## 📁 Project Structure
Web_Shop/
│
├── src
│ ├── main/java
│ │ ├── pages # Page Object classes
│ │ ├── config # Config reader
│ │ └── utils # ExtentReports manager
│ │
│ ├── test/java
│ ├── base # BaseTest (setup & teardown)
│ ├── tests # Test cases
│ └── listeners # TestNG listeners (optional)
│
├── test-output # Test reports (TestNG)
├── pom.xml # Maven dependencies


---

## 🧪 Test Coverage

Currently implemented test scenarios:

- User Register Test
- User Login Test
- User Logout Test
- Add to Cart Test
- Remove From Cart Test

> Framework is structured to easily add more modules like Search, Wishlist, etc.

---

## ⚙️ Key Features

- Page Object Model (POM) design pattern
- Reusable BaseTest with WebDriver setup & teardown
- Centralized configuration management
- Explicit waits for stable automation
- ExtentReports HTML reporting integration
- Clean and scalable folder structure

---

## 📊 Reporting (ExtentReports)

After execution, an HTML report is generated via **ExtentReports**.

### Report includes:

- Test status (Pass / Fail / Skip)
- Step-by-step logs
- Execution time
- Error messages (if any)

---

## ▶️ How to Run Tests

### Option 1: IntelliJ IDEA
- Open project as Maven project
- Run test classes from `tests` package

### Option 2: Maven CLI
 ```bash
mvn clean test
```

🔧 Future Improvements
Add more test modules (Search, Wishlist)
Data-driven testing (Excel / JSON)
Parallel test execution
CI/CD integration (GitHub Actions / Jenkins)
Cross-browser testing support

## 👩‍💻 Author

QA Automation Engineer  
(Manual & Automation Testing | Selenium | Java | TestNG | POM | Postman API Testing)




