# 🧪 Web Shop Test Automation Framework


A scalable and maintainable **UI Test Automation Framework** built using **Java, Selenium WebDriver, and TestNG**.  
The framework follows the **Page Object Model (POM)** design pattern and includes reporting with **ExtentReports**.

This project demonstrates practical skills in building real-world automation frameworks.
=======
A **UI + API Test Automation Framework** built with **Java, Selenium WebDriver, TestNG, and Rest Assured**, following the **Page Object Model (POM)** design pattern.

This project demonstrates real-world automation skills for both **frontend and backend testing**.


---

## 🚀 Tech Stack

- Java 17
- Selenium WebDriver
- TestNG

- Maven
- ExtentReports
- Page Object Model (POM)
=======
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


The framework is designed for **scalability, maintainability, and reusability**.

### Main Layers:

- **pages** → Page Object classes (UI elements + actions)
- **tests** → Test cases and validations
- **base** → WebDriver setup and teardown
- **config** → Configuration management (properties)
- **utils** → Utility classes (ExtentReports, helpers)
=======
## 🏗️ Framework Design

- Page Object Model (POM) for UI automation
- Separate API testing layer using Rest Assured
- Reusable BaseTest for setup and teardown
- Centralized configuration management
- ExtentReports for test reporting

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

=======

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


Currently implemented test scenarios:

- User Register Test
- User Login Test
- User Logout Test
- Add to Cart Test
- Remove From Cart Test

> Framework is structured to easily add more modules like Search, Wishlist, etc.
=======
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
=======
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

QA Automation Engineer  
(Manual & Automation Testing | Selenium | Java | TestNG | POM | Postman API Testing)




=======
## 🔮 Future Improvements

Data-driven testing (JSON / Excel)
Parallel execution
CI/CD integration (GitHub Actions / Jenkins)
Advanced API validation (schema + contract testing)
Cross-browser testing

 ## 👩‍💻 Author

QA Engineer
Manual | Selenium | Java | TestNG | POM | API Testing (Rest Assured)

