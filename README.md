# 🧪 Web Shop Test Automation Framework

Automation testing framework designed for scalable UI and API regression testing using Selenium WebDriver, TestNG, REST Assured, and Jenkins CI integration

This project was built to simulate a real-world scalable e-commerce automation framework with UI, API, reporting, and CI/CD integration.

---

## 🚀 Tech Stack
Java 21 | Selenium WebDriver | TestNG | Rest Assured | Maven | Jenkins | ExtentReports

---

## 🌐 Application Under Test
UI: https://demowebshop.tricentis.com  
API: https://reqres.in

---

## 🏗️ Framework Structure
WebShop-Automation-Framework
│
├── src
│   ├── main/java
│   │   ├── pages → Page Object Model (UI pages)
│   │   ├── api → API client classes
│   │   ├── config → Configuration reader
│   │   └── utils → Utilities (drivers, helpers, reports)
│   │
│   └── test/java
│       ├── ui_tests → UI test cases
│       └── api_tests → API test cases
│
├── base
│   └── BaseTest → Setup & teardown
│
├── test-output → Reports (Extent/TestNG)
├── pom.xml → Maven dependencies
└── README.md

---

## ⚙️ Features
- UI + API automation framework
- Page Object Model (POM)
- Parallel execution (Chrome & Edge)
- Maven build management
- ExtentReports HTML reporting
- Jenkins CI/CD integration
- Stable execution with error handling

---

## 🔄 CI/CD Pipeline (Jenkins)
GitHub Push → Jenkins Trigger → Maven Build → Parallel Test Execution → Report Generation

✔ Successfully executed in Jenkins  
✔ GitHub integrated  
✔ Parallel execution enabled  
✔ Automated test runs on every commit

---

## 📊 Reporting
- ExtentReports HTML report
- Test status (Pass / Fail / Skip)
- Execution logs
- Jenkins HTML Publisher Plugin

---

## 📸 Screenshots
Jenkins Success → jenkins_success.png  
Parallel Execution → jenkins_parallel.png  
Extent Report → extent_report.png  
IntelliJ Project → intellij.png

---

## ▶️ Run Tests
mvn clean test

---

## 🔮 Future Improvements
- Data-driven testing (Excel / JSON)
- API contract testing

---

## 👩‍💻 Author
QA Automation Engineer | Java | Selenium | TestNG | Rest Assured | Jenkins CI/CD