# Java_RMI

## 1.0 Calculator Example API Project Explation 
### RMI Project Overview:
This RMI (Remote Method Invocation) project demonstrates a simple client-server application. It allows the client to remotely invoke a method on the server to perform addition.

### Project Structure:
 The project is organized into three packages: Calculator_Example_API, Inside this package there are 3 files (Server, Client, adder for addition)

1. Calculator_Example_API contains the Adder interface, which declares the add method.
2. Calculator_Example_Server contains the Server class, which implements the Adder interface and provides the server-side implementation for the add method.

### Building and Running the Project:
### To build and run the project, follow these steps:

1. Ensure that you have Java Development Kit (JDK) installed on your machine.
2. Compile the project files using the following command: javac *.java -d <output_directory>.
3. Start the RMI registry by running the command: start rmiregistry.
4. In a separate terminal or command prompt, navigate to the output directory.
5. Run the server application with the command: java Calculator_Example_Server.Server.
6. Open another terminal or command prompt, navigate to the output directory, and run the client application with the command: java Calculator_Example_Client.Client

### Troubleshooting and FAQs:
1. If you encounter a connection issue, ensure that the RMI registry is running and the server is started before running the client application.
2. Make sure the server and client are using the same registry port number (1088 in this example).
3. Verify that the server and client are located in the same network or reachable from each other.


## 2.0 RMI Java Calculator 2
- This project demonstrates a simple calculator implemented using Java's Remote Method Invocation (RMI) framework. It allows clients to perform basic arithmetic operations remotely on a server.

### Features
- Addition: Add two numbers together.

- Subtraction: Subtract one number from another.

- Multiplication: Multiply two numbers.

- Division: Divide one number by another.

### How to Use
- Clone the repository: git clone <repository-url>
  
- Compile the Java files: javac *.java (Compile all files at once)
  
- Start the server: java RMI_Calculator_Example2.CalculatorOpServer
  
- Run the client: java RMI_Calculator_Example2.CalculatorOpClient
 
### Requirements
- Java Development Kit (JDK) 20.0.1
  
- Java RMI
  
### Contributing
- Contributions are welcome! If you find any issues or have suggestions for improvement, please submit an issue or a pull request.

### Acknowledgments
- This project is based on the concepts of RMI and serves as a basic example of its usage. Special thanks to the Java community for providing valuable resources and documentation on RMI.

### Feel free to customize and enhance the README file as per your specific needs.

  
## 3.0 E-Commerce Site with database connection
  - This is a Java application for an e-commerce system that interacts with a MySQL database. It includes functionality to establish a database connection, insert data into a table, and retrieve data from the table.
  ### Prerequisites
  To run this application, you need to have the following:
    - Java Development Kit (JDK) installed on your machine
    - MySQL database server installed and running
    - MySQL Connector/J JDBC driver added to your project's dependencies
 ### Setup
1. Clone the repository to your local machine.
   git clone https://github.com/gokul-pathak/Java_RMI.git
2. Open the project in your preferred Java IDE.

3. Import the MySQL Connector/J library into the project.

4. Adjust the database connection details in the DatabaseConnection class according to your MySQL server configuration. Update the url, username, and password variables to match your database connection settings.
 ### Usage
 1. Inserting Data
 - The InsertData class demonstrates how to insert data into the "products" table. To insert new products, you can modify the main method as per your requirements.
 2. Retrieving Data
 - The mainf class demonstrates how to retrieve data from the "products" table. It retrieves all rows from the table and prints the id and name of each product.
 3. Deleteing Data
   - 
  
 ### Contributing
- Contributions are welcome! If you have any suggestions, improvements, or bug fixes, feel free to open an issue or submit a pull request.

### Acknowledgments
- This project was developed as a learning exercise.
