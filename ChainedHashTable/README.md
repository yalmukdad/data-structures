# ChainedHashTable - Employee Records Management

## Overview

This project implements a chained hash table (`ChainedHashTable`) to efficiently manage employee performance records for TechCorp's Integrated Data Management System (IDMS). The hash table enables efficient insertion, deletion, and search operations, ensuring that employee records are always maintained and can be accessed quickly. It also includes methods to count the number of employees stored and check if specific employees exist within the hash table.

## Scenario

You are a software engineer at TechCorp, working on their IDMS. The IDMS handles data for multiple divisions, including retail, education, and healthcare. To optimize data operations, your team has decided to use a hash table with chaining to efficiently manage sets of employee performance records.

## Objectives

* Implement a chained hash table to maintain employee performance records.
* Support operations such as adding, removing, searching, counting, and printing employee records.
* Ensure the `ChainedHashTable` class is efficient and robust, as it will be used by other components in the system.

## Usage

The `ChainedHashTable` class can be used as follows:

```java
// Create a ChainedHashTable with a capacity of 10
ChainedHashTable table = new ChainedHashTable(10);

// Add employees
table.add("Alice", 90);
table.add("Bob", 85);

// Search for an employee
Integer grade = table.search("Alice"); // Returns 90

// Remove an employee
boolean removed = table.remove("Bob"); // Returns true

// Count employees
int count = table.countEmployees(); // Returns 1

// Check if an employee exists
boolean exists = table.contains("Alice"); // Returns true

## Author

Youssef Al Mukdad
