# ATM Management System

The ATM Management System is a Java-based application that simulates the functionalities of an automated teller machine (ATM). It provides a user-friendly interface for customers to perform various banking operations such as cash withdrawals, balance inquiries, fund transfers, and PIN changes.

## Features

1. User Registration: Customers can register their account by providing necessary details such as name, address, contact number, and initial deposit amount.

2. Account Login: Registered users can log in to their accounts using their unique account number and PIN (Personal Identification Number).

3. Cash Withdrawal: Customers can withdraw cash from their accounts by entering the desired amount. The system verifies the availability of funds and updates the account balance accordingly.

4. Balance Inquiry: Users can check their account balance to view the available funds.

5. Fund Transfer: Customers can transfer money from their account to another registered user's account. The system validates the sender's account balance and updates the balances of both the sender and receiver.

6. PIN Change: Users can change their PIN for account security purposes.

7. Transaction History: The system maintains a record of all transactions performed by the customers, including withdrawals, transfers, and balance inquiries.

8. Error Handling: The application handles various error scenarios such as invalid inputs, insufficient funds, incorrect PINs, etc., and provides appropriate error messages to the users.

## Technologies Used

- Java: The core programming language used for developing the application.
- Java Swing: The graphical user interface (GUI) library for creating the application's user interface.
- MySQL: The database management system used to store customer account information and transaction history.

## Getting Started

To run the ATM Management System on your local machine, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/atm-management-system.git
   ```

2. Set up the MySQL database:

   - Install MySQL and start the MySQL server.
   - Create a new database named `atm_management_system`.
   - Import the `atm_management_system.sql` file located in the repository's root directory into the database. This file contains the necessary table structure.
   - Configure the database connection settings in the `DatabaseConfig.java` file.

3. Open the project in your preferred Java IDE.

4. Build and compile the project.

5. Run the `Main.java` file to launch the application.

## Future Enhancements

The ATM Management System can be further enhanced by incorporating the following features:

- Deposit Functionality: Implement a feature that allows customers to deposit money into their accounts.
- Account Statement: Provide customers with an option to generate their account statements, displaying transaction details within a specific time range.
- Internationalization and Localization: Support multiple languages and localize the application for different regions.
- ATM Card Integration: Integrate the system with ATM card readers to enhance security and enable card-based transactions.

## Contributing

Contributions are welcome! If you want to contribute to this project, please follow these steps:

1. Fork the repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes and commit them.

4. Push the changes to your fork.

5. Submit a pull request explaining your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- [Java Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
