Employee Registration Simulation
This Java program simulates an employee registration system using a singly linked list. The program demonstrates the following functionalities:

Adding employees to a registration list.
Checking if specific employees are registered.
Removing employees from the list.
Counting the occurrences of a specific employee's name in the list.
Checking the total number of registered employees.
Files
SList.java: This file contains the implementation of a singly linked list (SList) to manage employee registrations. Each node in the list stores an employee's name. The class provides methods for adding and removing employees, checking for membership, counting occurrences of a name, and calculating the size of the list.
M03A5.java: This file contains the main method and demonstrates the usage of the SList class. It performs the following actions:
Creates an instance of SList.
Adds several employees (some with duplicate names).
Prints the list of registered employees.
Checks for the presence of specific employees.
Removes employees.
Counts the occurrences of a specific employee's name.
Calculates and prints the size of the list.
Usage
Ensure that both SList.java and M03A5.java are in the same directory.
Compile both files using a Java compiler (e.g., javac SList.java M03A5.java).
Run the M03A5 class (e.g., java M03A5).
The output will show the results of the various operations performed on the employee registration list.

Additional Notes
The program uses a custom singly linked list implementation (SList) instead of built-in Java collections to illustrate the concepts of linked list manipulation.
The program includes error handling for cases such as attempting to remove an employee from an empty list or searching for an employee who is not registered.
The comments in the code provide explanations of the logic and functionalities.

## Author

Youssef Al Mukdad
