# 🧪 SauceDemo End-to-End Automation Framework

This project is an automated test suite for [SauceDemo](https://www.saucedemo.com/), built using:

- 🕸️ **Selenium WebDriver**
- 🥒 **Cucumber BDD**
- 🧪 **TestNG**
- 📸 **Allure Reporting**
- 🧱 **Page Object Model (POM)**
- 🧰 **WebDriverManager**
- 🔍 **AssertJ** / **JUnit** / **TestNG Assertions**
- 📂 **Apache POI** (for future Excel-based test data)
- 🌐 **Rest Assured** (optional API layer for integration tests)

## 🗂️ Project Structure
![](/Users/abhisheksharma/Downloads/SDETProjects/BDD_RestAssured_Integration/src/main/java/images/1.png)

## 🚀 How to Run
1. Clone the repository
   bash
   Copy
   Edit
   git clone https://github.com/your-username/SauceEndToEndAutomation.git
   cd SauceEndToEndAutomation
2. Run tests via Maven
   bash
   Copy
   Edit
   mvn clean test
   To specify a browser (Chrome is default):

   bash
   Copy
   Edit
   mvn clean test -Dbrowser=firefox
3. Generate Allure Report
   bash
   Copy
   Edit
   allure serve target/allure-results