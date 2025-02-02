# **Web-Based Banking Application Automation Test Project**

## 📋 **About the Project**
This project covers the automation tests of a web-based banking application. The aim is to test all the necessary 
functionalities to ensure users can successfully log in, transfer money, deposit funds via card, and manage their account 
settings. The project provides a comprehensive testing strategy to enhance user experience and security.

---

## 🔧 **Proje Özellikleri**
- **Functions:**
  - **🔑 User login –** Users can log in with valid credentials.
  - **⚙️ Account settings management –** Users can edit their account information.
  - **💸 Money transfer transactions –** Users can transfer money to another account.
  - **💳 Depositing funds via card –** Users can deposit funds using card details.
  - **🌍 Cross-browser compatibility –** Tests on Chrome, Firefox, and Edge.

- **Technologies Used:**
  - **☕ Java –** For test automation coding.
  - **🖥️ Selenium WebDriver –** For browser automation.
  - **📜 Gauge –** For writing tests in BDD format and reporting.
  - **✅ JUnit –** For test management and organization.
  - **📄 Log4j –** For logging.
  - **🏗️ Maven –** For dependency management and test execution.
  - **🏛️ Tasarım Deseni –** Page Object Model (POM) is used.

---
## 🚀 **Installation Instructions**
### **1. Required Tools and Software**
Ensure that the following software is installed on your system before running the project:
- **Java JDK 11 or later:** [Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Apache Maven 3.7 or later:** [Download Maven](https://maven.apache.org/download.cgi)
- **Git** (optional): To clone the repository
- **IDE (IntelliJ IDEA, Eclipse etc.):** To edit and run the project
- **Gauge 1.6.3 or later:** [Gauge](https://gauge.org/)

### **2. Clone the Repository**
Use the following command to clone the project:

```
git clone https://github.com/fatihozdmr/CatchylabsBankApplication.git
```
---
## 🚀 **Usage Instructions**
### 🔍 **How to Run Tests?**
1. 📁 Navigate to the project directory.
2. 🏃‍♂️ Run tests using Maven:
```
mvn gauge:execute
```

### 🎯 **Run Tests with Tags**
To run specific tests using tags:
```
mvn gauge:execute -DspecsDir=specs -Dtags="exampleTag"
```
### 🔄 **Re-run Failed Tests**
If a test fails, retry with:
```
mvn gauge:execute -DretryFailed=true
```
### 🐞 **Debug Mode**
For detailed logs and debugging:
```
mvn gauge:execute -X
```
---
## 📊 Test Reports
Test results and details are automatically generated. The Gauge reporting tool provides detailed and visual test results.

* **Viewing Reports:**
  * Test results are saved in **reports/html-report/index.html**. You can open this file in a browser to review success rates and error details.

* **Error Logs:**
   * All test steps and errors are recorded in **logs/gauge.log**. This file can be used for detailed analysis of test results.
* **Reporting Issues**
  * If reports are missing or incorrectly generated, clean the report directory and re-run the tests:
```
mvn clean test
```
---
## 📂 Project Structure
```
CatchylabsBankApplication/
├── logs/
│   └── gauge.log               # Log records
├── reports/
│   └── html-report/
│           └── index.html      # Test reports
├── specs/
│   └── myAccount/              # My Account Scenarios
│   └── login/                  # Login Scenarios
├── src/
│   └── test/
│       └── java/
│           └── base/           # Base Test
│           └── helpers/        # Reusable Methods 
│           └── pages/          # Page Objects (Page Object Model)
│           └── steps/          # Test Steps
│       └── resources/          # Logger
│ 
│ 
├── pom.xml                     # Maven dependencies
└── README.md                   # README file
```
---
## 🔗 Resources
For better project development and management, you can refer to the following resources:

- [Selenium Official Documentation](https://www.selenium.dev/documentation/)
- [Gauge Official Documentation](https://docs.gauge.org/)
- [JUnit Official Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Usage Guide](https://maven.apache.org/guides/index.html)
---
## 📞 Contact
If you have any questions about the project or need support, feel free to reach out.

🔨 Created by: Fatih OZDEMIR

📧 E-mail: fatih.ozdemir@testinium.com

---
![Testinium Logo]( https://testinium.com/images/66813274c64757f6bfad1aeb_nav_logo_blue2.svg)
