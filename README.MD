# 🧪 Web Shop Test Automation Framework

A **UI + API Test Automation Framework** built with **Java, Selenium WebDriver, TestNG, and Rest Assured**, following the **Page Object Model (POM)** design pattern.

This project demonstrates real-world automation skills for both **frontend and backend testing**.

---

## 🚀 Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- Rest Assured (API Testing)
- Maven
- ExtentReports

---

## 🌐 Application Under Test

UI:
https://demowebshop.tricentis.com

API:
https://reqres.in

---

## 🏗️ Framework Design

- Page Object Model (POM) for UI automation
- Separate API testing layer using Rest Assured
- Reusable BaseTest for setup and teardown
- Centralized configuration management
- ExtentReports for test reporting

---

## 📁 Project Structure

src
├── main/java
│   ├── pages        # UI Page Objects
│   ├── api          # API client classes
│   ├── config       # Config reader
│   └── utils        # Helpers & reporting
│
├── test/java
│   ├── ui_tests     # UI test cases
│   └── api_tests    # API test cases
│
└── base             # BaseTest (setup/teardown)

test-output           # Test reports
pom.xml               # Dependencies

---

## 🧪 Test Coverage

### UI Tests
- User Registration
- Login / Logout
- Add to Cart
- Remove from Cart

### API Tests
- GET user details
- POST login / authentication
- Validate response status codes
- Basic schema validation

---

## ⚙️ Key Features

- UI + API combined automation framework
- Page Object Model (POM) architecture
- Reusable BaseTest setup
- Rest Assured API automation
- ExtentReports HTML reporting
- Scalable and maintainable structure

---

## 📊 Reporting

ExtentReports generates HTML reports including:

- Test status (Pass / Fail / Skip)
- API response logs
- UI step logs
- Execution time
- Error details

---

## ▶️ How to Run Tests

### IntelliJ IDEA
Run tests from:
- ui_tests package
- api_tests package


### Maven CLI
mvn clean test

🔮 Future Improvements

Data-driven testing (JSON / Excel)
Parallel execution
CI/CD integration (GitHub Actions / Jenkins)
Advanced API validation (schema + contract testing)
Cross-browser testing

 👩‍💻 Author

QA Engineer
Manual | Selenium | Java | TestNG | POM | API Testing (Rest Assured)
