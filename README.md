# Airport CRUD GUI

## Overview

Airport CRUD GUI is a Java-based database application developed using object-oriented programming. The application provides a graphical user interface for managing airport passenger and check-in location information.

The application allows users to perform CRUD operations:

* **Create** new records
* **Read** and view existing records
* **Update** existing records
* **Delete** records

The system manages two main types of data: **Check-In Locations** and **Passengers**.

## Features

### Check-In Location Management

Users can:

* Add new check-in locations
* Select and view existing locations
* Update check-in location information
* Delete check-in locations
* View all check-in locations in a table

### Passenger Management

Users can:

* Add new passengers
* Select and view existing passengers
* Update passenger information
* Delete passengers
* View all passengers in a table

### Data Validation

The application includes validation and error handling to prevent invalid database operations. It checks for:

* Empty required fields
* Duplicate primary keys
* Invalid foreign keys
* Foreign key restrictions when attempting to delete a check-in location that is currently associated with a passenger

Error messages are displayed through GUI dialog boxes to provide feedback to the user.

## Technologies Used

* **Java**
* **Java Swing**
* **Object-Oriented Programming (OOP)**
* **SQL**
* **Flyway**
* **NetBeans**
* **JDBC / Database Connectivity**

## Database Structure

The application works with two database tables:

### CheckInLocation

Contains information about airport check-in locations, including the location ID and station name.

### Passenger

Contains passenger information, including:

* Passenger ID
* First Name
* Last Name
* Check-In Location

The Passenger table is connected to the CheckInLocation table through the check-in location ID.

## How to Use

1. Open the project in **NetBeans**.
2. Ensure the database and required dependencies are configured.
3. Run the application through `Main.java`.
4. Select either the **Check-In Location** or **Passenger** tab.
5. Enter the required information into the text fields.
6. Use the **Save**, **Update**, or **Delete** buttons to manage records.
7. Select a row in the table to automatically populate the corresponding fields.
8. The table refreshes after CRUD operations so the user can see the updated database information.

## Error Handling

The application uses message dialogs to display database errors directly through the GUI. For example, attempting to create a record with an existing ID results in a primary key violation message. Similarly, attempting to use a non-existing check-in location for a passenger results in a foreign key violation.

## Project Purpose

The purpose of this project was to develop a simple, user-friendly airport information system that demonstrates object-oriented programming, graphical user interface development, database management, and CRUD functionality.
