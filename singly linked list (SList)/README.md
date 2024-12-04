# Employee Registration Simulation

This Java program simulates an employee registration system using a singly linked list. The program demonstrates basic functionalities for managing employee data within a custom-built linked list.

## Table of Contents

- [Features](#features)
- [Files](#files)
- [Usage](#usage)
- [Data Structures](#data-structures)
- [Additional Notes](#additional-notes)
- [Author](#author)

## Features

- **Add employees:** Register new employees to the system.
- **Check registration status:** Verify if an employee is already registered.
- **Remove employees:**  Unregister employees from the system.
- **Count occurrences:** Determine how many times an employee's name appears in the list (useful for identifying potential duplicates).
- **List size:**  Get the total number of registered employees.

## Files

- **`SList.java`:** Contains the implementation of a singly linked list (`SList`) to manage employee registrations. Each node in the list stores an employee's name. The class provides methods for:
    - Adding employees
    - Removing employees
    - Checking for membership
    - Counting occurrences of a name
    - Calculating the size of the list
- **`M03A5.java`:** Contains the `main` method and demonstrates the usage of the `SList` class.

## Usage

1. **Clone the repository:** `git clone <repository_url>`
2. **Compile:** `javac SList.java M03A5.java`
3. **Run:** `java M03A5`

## Data Structures

- **Singly Linked List:**  A custom `SList` class is used to manage employee registrations. This provides a basic example of linked list manipulation in Java.

## Additional Notes

- The program uses a custom singly linked list implementation (`SList`) instead of built-in Java collections to illustrate the concepts of linked list manipulation.
- The program includes basic error handling.
- The comments in the code provide explanations of the logic and functionalities.

## Author

Youssef Al Mukdad
