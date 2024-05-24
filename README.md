# Library_Management_System
Introduction
The Library Management System is a web-based application developed using Java and Spring Boot. It provides functionalities for managing books, users, and user roles within a library. The system allows users to add, edit, and delete books, search for books, register new users, and assign roles to users.

Technologies Used
Java
Spring Boot
Spring Security
Hibernate
PostgreSQL
Maven
Setup Instructions
Clone the Repository: Clone the project repository from your version control system.

Database Setup:

Install PostgreSQL if not already installed.
Create a new database named Library_management_system.
Configure the application.properties file with your PostgreSQL username and password.

Build the Project:
Navigate to the project root directory.
Run mvn clean install to build the project.

Run the Application:
Execute mvn spring-boot:run to start the application.

Access the Application:
Open your web browser and navigate to http://localhost:8080 to access the application.

Security Configuration:-
The application uses Spring Security for authentication and authorization.
A custom UserDetailsService is implemented to load user details from the database.
Passwords are encrypted using BCryptPasswordEncoder.

Model Classes:-
Book: Represents a book entity with attributes such as ID, name, author, student name, issue date, and expiry date.
Role: Represents a user role entity with an ID and name.
User: Represents a user entity with attributes including ID, username, password, and roles.

Repository Interfaces:-
BookRepository: JpaRepository interface for managing Book entities.
UserRepository: JpaRepository interface for managing User entities.

Service Classes:-
BookService: Provides methods for managing books including adding, updating, deleting, and searching for books.
UserService: Provides methods for managing users including user registration.

Controller Classes:-
AuthController: Controller for handling authentication-related requests such as login.
BookController: Controller for handling book-related requests such as adding, editing, and deleting books.
UserController: Controller for handling user-related requests such as user registration.

DTO Classes:-
UserRegistrationDto: Data transfer object for user registration containing username and password.
Application Properties
Contains configuration properties for the application including database connection settings and Hibernate configuration.
Conclusion :-
The Library Management System provides a robust and user-friendly interface for managing library resources. It is designed to be scalable and can be extended with additional features as needed.
