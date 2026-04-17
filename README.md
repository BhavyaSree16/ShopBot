# Problem Statement 4: ShopBot – Selenium-Java Test Automation Framework for a Retail E-Commerce Application
A comprehensive Selenium-based test automation framework for the SauceDemo application, built using Java, TestNG, and Maven.

---

# Project Overview

This project implements end-to-end automated testing for the SauceDemo application, covering:

* Authentication workflows
* Product listing and sorting
* Cart functionality
* Checkout process
* Negative testing (problem user scenarios)

The framework follows the Page Object Model design pattern for scalability and maintainability.

---

# Technologies & Dependencies

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Apache POI (Excel handling)
* Extent Reports

---

# Project Structure

```id="projstruct"
saucedemo-automation/
│
├── pom.xml                          Maven dependencies and plugins
├── testng.xml                       TestNG suite configuration
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   │   ├── BaseTest.java
│   │   │   │   └── BasePage.java
│   │   │   │
│   │   │   ├── pages/
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── ProductPage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   └── CheckoutPage.java
│   │   │   │
│   │   │   ├── tests/
│   │   │   │   ├── LoginTest.java
│   │   │   │   ├── ProductTest.java
│   │   │   │   ├── CartTest.java
│   │   │   │   ├── CheckoutTest.java
│   │   │   │   └── ProblemUserTest.java
│   │   │   │
│   │   │   └── utils/
│   │   │       ├── ConfigReader.java
│   │   │       ├── ExcelUtil.java
│   │   │       ├── ScreenshotUtil.java
│   │   │       ├── Listeners.java
│   │   │       └── ExtentManager.java
│   │   │
│   │   └── resources/
│   │       ├── config.properties
│   │       ├── logindata.xlsx
│   │       └── testng.xml
│
├── reports/                         Extent HTML reports
├── screenshots/                     Failure screenshots
├── test-output/                     TestNG reports
└── README.md
```

---

# Must-Have Requirements Implemented

* Page Object Model design pattern
* No hardcoded values (uses config.properties)
* Explicit waits (no Thread.sleep used)
* Data-driven testing using Excel
* Screenshot capture on test failure using ITestListener
* Test execution through TestNG.xml
* Maven-based execution

```id="mvnrun"
mvn clean test
```

---

#  Good-To-Have Features

* Extent Reports for detailed HTML reporting
* Console logging for validation clarity
* Cross-browser support (Chrome, Firefox)
* Modular and reusable framework design
* Negative testing for edge cases (problem user)
* Centralized configuration management

---
#  Application Under Test

The application under test is **SauceDemo**, a sample e-commerce web application used for automation practice.

### 🔗 URL

https://www.saucedemo.com

###  Key Features Tested

* User authentication (login/logout)
* Product listing and sorting
* Shopping cart operations
* Checkout and order placement
* Error handling and edge cases (problem user scenarios)

### Test Users

| Username        | Purpose                         |
| --------------- | ------------------------------- |
| standard_user   | Valid user for normal workflows |
| locked_out_user | To validate login restrictions  |
| problem_user    | To validate broken UI behavior  |

### Test Data Source

* Credentials and configuration → `config.properties`
* Data-driven inputs → Excel file (`logindata.xlsx`)

#  Test Modules

## 🔹 Module 1: Authentication

* Verify valid login
* Verify locked user error
* Verify empty login
* Verify logout functionality

## 🔹 Module 2: Product

* Verify product list is displayed
* Sort by Name and validate first product
* Sort by Price and validate cheapest product
* Verify product details (name and price)

## 🔹 Module 3: Cart

* Add single product and verify badge
* Add multiple products
* Remove product from cart
* Verify cart persistence after navigation

## 🔹 Module 4: Checkout

* Enter user details
* Verify product summary
* Verify total price
* Complete order and validate confirmation

## 🔹 Module 5: Problem User

* Validate broken images
* Validate inconsistent add-to-cart behavior

---

#  Reports

Extent Report is generated at:

```id="reppathfinal"
/reports/ExtentReport.html
```

Includes:

* Test execution status
* Screenshots on failure
* Detailed logs

---

#  Screenshots

Screenshots are automatically captured on test failures:

```id="screenpath"
/screenshots/
```

---

#  Configuration

Edit `config.properties`:

```id="configfinal"
browser=chrome
baseUrl=https://www.saucedemo.com
timeout=10

username=standard_user
password=secret_sauce
problemUser=problem_user

firstname=Bhavya
lastname=Sree
zipcode=522001
```

---

#  Setup & Execution

## Prerequisites

* JDK 8 or above
* Maven 3.6+
* Chrome or Firefox browser

---

## Build Project

```id="buildcmd"
mvn clean install
```

---

## Run All Tests

```id="runcmd"
mvn test
```

---

## Run Specific Suite

```id="suitecmd"
mvn test -DsuiteXmlFile=testng.xml
```

---

## View Reports

* TestNG Report: `test-output/index.html`
* Extent Report: `reports/ExtentReport.html`

---

#  Key Design Principles

* Separation of concerns
* Reusable page methods
* Maintainable test structure
* Config-driven framework
* Robust error handling

---

#  Best Practices Followed

* No hardcoded values
* Proper wait handling
* Screenshot on failure
* Modular test design
* Clean and readable code

---

# Author

Bhavya Sree Kasa

---

#  Conclusion

This project demonstrates a complete Selenium automation framework covering:

* Functional testing
* UI validation
* Negative testing
* Reporting and logging

It follows industry standards and is suitable for QA/SDET roles.
