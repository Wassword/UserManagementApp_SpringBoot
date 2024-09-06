User Management Application
Overview
This is a Spring Boot application for managing users. It allows users to register, log in, and manage user details with different access levels for regular users and admins. The app uses Spring Security for security, Spring Data JPA for database operations, Thymeleaf for the web interface, and an H2 in-memory database for data storage.

Features
User Registration and Login: Users can register and log in through simple forms.
Role-Based Access: Regular users can manage their own details, while admins can manage all users.
Data Storage: Uses H2 in-memory database with JPA for saving user data.
Custom Validation: Validates user input, such as password strength.
Exception Handling: Provides meaningful error messages when something goes wrong.
Thymeleaf Integration: Uses Thymeleaf templates to create web pages.
Tools and Technologies
Spring Boot: Main framework for building the application.
Spring Security: For login, registration, and access control.
Spring Data JPA: For database interactions.
H2 Database: An in-memory database for testing and development.
Thymeleaf: To render HTML pages.
Maven: For managing dependencies and building the project.
How to Run the Application
Clone the Project:

bash
Copy code
git clone <repository-url>
cd UserManagementApp
Build the Project:

bash
Copy code
mvn clean install
Run the Application:

bash
Copy code
mvn spring-boot:run
Access the Application:

Register Page: http://localhost:8080/register
Login Page: http://localhost:8080/login
Admin Users List: http://localhost:8080/users
Access the H2 Database Console:

Visit http://localhost:8080/h2-console
Use JDBC URL: jdbc:h2:mem:testdb, Username: sa, Password: (leave empty)
API Endpoints
POST /register: Register a new user.
POST /login: Login a user.
GET /users: View all users (Admin only).
GET /users/{id}: View user details by ID.
PUT /users/{id}: Update user details.
DELETE /users/{id}: Delete a user.
Notes
The application runs on localhost:8080.
Make sure to provide correct login credentials to access certain pages.
The H2 database is in-memory, so all data is lost when the application restarts.
Future Improvements
Use JWT for better authentication.
Improve the user interface.
Add more tests for different parts of the app.
Summary
This project shows how to build a basic user management system with Spring Boot, including secure user authentication and a simple web interface.