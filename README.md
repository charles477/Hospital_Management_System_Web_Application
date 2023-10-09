# Hospital Management System Web Application

This Hospital Management System Web Application is designed to facilitate the efficient management of hospital operations. It utilizes Servlets, JSP, JDBC, HTML, CSS, Bootstrap, and MySQL for various functionalities and data storage. The system is divided into three main modules:

1. **Admin Module**: Admins have full control over the system. They can add doctors and manage patient information.

2. **Doctor Module**: Doctors can log in once the admin has registered them. In this module, doctors can view exclusive patient information assigned to them, update patient status, and provide comments.

3. **User Module**: Regular users can register on the hospital website, book appointments, and check the status of their appointments and doctors' comments.

## Features

- **Admin Module**:
  - Add and manage doctors.
  - Manage patient information.

- **Doctor Module**:
  - Log in after admin registration.
  - View exclusive patient information.
  - Update patient status.
  - Provide comments on patients.

- **User Module**:
  - Register on the hospital website.
  - Book appointments.
  - Check appointment status.
  - View doctor comments.

## Technology Stack

- **Front-end**:
  - HTML, CSS, Bootstrap for the user interface.
  - JSP (JavaServer Pages) for dynamic views.

- **Back-end**:
  - Servlets for request mapping.
  - JDBC (Java Database Connectivity) for connecting to the MySQL database.
  
- **Database**:
  - MySQL for storing hospital data.

## Getting Started

1. **Database Setup**:
   - Create a MySQL database named `hospital_management`.
   - Import the SQL schema provided in the `database` folder.

2. **Web Application Setup**:
   - Deploy the web application on your servlet container (e.g., Tomcat).

3. **Configuration**:
   - Update the database connection details in the `db.properties` file to match your MySQL configuration.

4. **Run**:
   - Access the application via your web browser, e.g., `http://localhost:8080/index.

## Folder Structure

- `webapp`: Contains HTML, CSS, JSP files, and Bootstrap for the front-end.
- `src`: Contains Java Servlets and JDBC code.
- `database`: SQL schema for database setup.
- `WEB-INF`: Configuration files and JSP files.
