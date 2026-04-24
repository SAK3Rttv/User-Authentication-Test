# User Authentication Test Suite

This project contains automated TestNG tests for a dummy User Authentication system. It uses **DataProviders** to test multiple scenarios, including valid, invalid, null, and empty credentials.

## 🚀 Getting Started

### Prerequisites
* **Java 17** or higher
* **Eclipse IDE** (or IntelliJ IDEA)
* **Maven** (built into most IDEs)

### Installation & Cloning
1. Open your terminal or command prompt.
2. Clone the repository:
   ```bash
   git clone https://github.com/SAK3Rttv/User-Authentication-Test.git
   ```
3. Import into Eclipse:
   * File > Import > Maven > Existing Maven Projects.
   * Select the cloned folder and click **Finish**.

## 🛠 How to Run the Tests

### Option 1: Using TestNG Suite (Recommended)
1. Locate the `testng.xml` file in the project root.
2. Right-click `testng.xml`.
3. Select **Run As > TestNG Suite**.

### Option 2: Using Maven (Command Line)
In the project root, run:
```bash
mvn test
```

## 📊 Test Scenarios Covered
* Valid admin credentials (Success)
* Invalid passwords/usernames (Failure)
* Case-sensitivity checks (Failure)
* Edge cases: Null values and Empty strings (Failure/Robustness check)

## 📁 Project Structure
* `src/ch4_1/UserAuthentication.java` - The core logic being tested.
* `src/ch4_1/UserAuthenticationTest.java` - The TestNG class with DataProviders.
* `testng.xml` - Suite configuration file.
* `pom.xml` - Maven dependencies (TestNG, SLF4J).
