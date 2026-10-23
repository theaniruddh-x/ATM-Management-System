# ATM Management System

## Project Description
The ATM Management System is a console-based mini project developed using Core Java. It simulates basic ATM operations and allows users to perform banking activities through a simple menu-driven interface.

## Features
- **PIN Authentication:** Login using a four-digit PIN.
- **Check Balance:** View the available account balance.
- **Deposit Money:** Add money to the account.
- **Withdraw Money:** Withdraw money if sufficient balance is available.
- **Mini Statement:** View the most recent transaction and current balance.
- **Change PIN:** Change the existing ATM PIN.
- **Exit:** Safely exit the application.

## Technologies Used
- Java (Core Java)
- Java Development Kit (JDK)
- Visual Studio Code

## Java Concepts Used
- Variables and data types
- Scanner class for user input
- Conditional statements (`if-else`)
- Loops (`while` and `do-while`)
- `switch-case`
- Arithmetic operators

## Default Credentials
- **PIN:** 1234
- **Initial Balance:** ₹5,000

## How to Run the Project

### Step 1: Install Java
Install the JDK and verify that Java is available in your terminal.

```bash
java -version
javac -version
```

### Step 2: Download the Code
Clone this repository or download the source code from GitHub.

```bash
git clone https://github.com/YOUR-USERNAME/ATM-Management-System.git
```

Replace `YOUR-USERNAME` with your GitHub username.

### Step 3: Compile the Program

Open a terminal in the folder containing `ATM.java` and run:

```bash
javac ATM.java
```

### Step 4: Run the Program

```bash
java ATM
```

## Project Limitations
- Account details and balance are stored in memory.
- Data resets when the program is restarted.
- The mini statement displays only the most recent transaction.
- This project is an educational simulation and is not connected to a real banking system.

## Future Enhancements
- Store account information using file handling.
- Maintain a complete transaction history.
- Support multiple user accounts.
- Add a graphical user interface.

## Author
**Aniruddh**

## License
This project is intended for educational and learning purposes.
