# 🧪 Web Shop UI Test Automation Framework

A scalable and maintainable **UI Test Automation Framework** built using **Java, Selenium WebDriver, and TestNG**.
The framework follows the **Page Object Model (POM)** design pattern and includes reporting with **ExtentReports**.

This project demonstrates hands-on experience in designing automation frameworks for real-world web applications.

---

## 🚀 Tech Stack

* Java 17
* Selenium WebDriver
* TestNG
* Maven
* ExtentReports
* Page Object Model (POM)

---

## 🌐 Application Under Test

https://demowebshop.tricentis.com

---

## 🏗️ Framework Architecture

The framework is designed with reusability, scalability, and maintainability in mind:

* **pages** → Page Object classes encapsulating UI elements and actions
* **tests** → Test scenarios and validations
* **base** → WebDriver setup and teardown logic
* **config** → Centralized configuration management
* **utils** → Utility classes (reporting, helpers)
* **listeners** → TestNG listeners for reporting and screenshots

---

## 📁 Project Structure

```
Web_Shop/
│
├── src
│   ├── main/java
│   │   ├── pages        # Page Object classes
│   │   ├── config       # Configuration management
│   │   └── utils        # Utilities (ExtentReports, helpers)
│   │
│   ├── test/java
│       ├── base         # BaseTest (setup & teardown)
│       ├── tests        # Test cases
│       └── listeners    # TestNG listeners (reporting, screenshots)
│
├── test-output          # Generated test reports
├── pom.xml              # Maven dependencies & build configuration
```

---

## 🧪 Test Coverage

Currently automated scenarios:

* User login functionality validation

> The framework is designed to be easily extendable (e.g., Cart, Checkout, Search scenarios).

---

## ⚙️ Key Features

* Page Object Model (POM) for clean and maintainable test design
* Centralized configuration using `config.properties`
* Reusable BaseTest class for WebDriver management
* Explicit waits for stable test execution
* ExtentReports integration for detailed HTML reporting
* Modular and scalable project structure

---

## ▶️ How to Run Tests

### Option 1 — IntelliJ IDEA

* Import project as a Maven project
* Run test classes (e.g., `LoginTest.java`)

### Option 2 — Maven

```bash
mvn clean test
```

---

## 📊 Test Reporting

After execution, an **ExtentReports HTML report** is generated.

Report includes:

* Test execution status (Pass/Fail)
* Step-level logs
* Execution time details

---

## 🔧 Future Improvements

* Add more test scenarios (Cart, Checkout, Search)
* Data-driven testing implementation
* Parallel test execution
* CI/CD integration (GitHub Actions / Jenkins)
* Cross-browser testing

---

## 👩‍💻 Author

QA Automation Engineer
(Java | Selenium | TestNG | POM)

---

## 📌 Note

This project is developed for **learning and portfolio purposes**, demonstrating practical skills in automation framework design.
