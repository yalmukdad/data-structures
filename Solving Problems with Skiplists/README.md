# Employee Registration Simulation with Skip List

This Java program simulates an employee registration system using a probabilistic data structure known as a Skip List. Skip lists provide a way to efficiently search, insert, and remove elements in a sorted manner, with performance comparable to balanced trees.

## Table of Contents

- [Features](#features)
- [Files](#files)
- [Usage](#usage)
- [Data Structures](#data-structures)
- [Example Operations](#example-operations)
- [Algorithm Complexity](#algorithm-complexity) 
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Features

- **Add employees:** Register new employees to the system.
- **Check registration status:** Verify if an employee is already registered.
- **Remove employees:** Unregister employees from the system.
- **Find employees:** Locate an employee in the list.
- **List size:** Get the total number of registered employees.

## Files

- **`SkipList.java`:** Contains the implementation of the `SkipList` class. This class provides methods for:
    - Adding employees (`add`)
    - Removing employees (`remove`)
    - Checking for membership (`contains`)
    - Finding an employee (`find`)
    - Calculating the size of the list (`size`)
    - Printing the list (`printList`)
- **`M03A6.java`:** Contains the `main` method and demonstrates the usage of the `SkipList` class.

## Usage

1. **Clone the repository:** `git clone <repository_url>`
2. **Compile:** `javac SkipList.java M03A6.java`
3. **Run:** `java M03A6`

## Data Structures

- **Skip List:** A probabilistic data structure that builds on the concept of a sorted linked list. It uses multiple levels of links to allow for efficient searching, insertion, and deletion of elements.  This provides an alternative to traditional balanced trees with a simpler implementation and probabilistic performance guarantees.

## Example Operations

The `M03A6.java` file demonstrates the following operations on the `SkipList`:

- Adding employees (including duplicates)
- Printing the skip list contents
- Checking the size of the skip list
- Checking the presence of specific employees
- Finding a specific employee
- Removing employees
- Adding and removing additional employees
- Final check of unique employee count and presence
- Printing the final skip list contents

## Algorithm Complexity

| Operation | Average Time Complexity |
|---|---|
| Search | O(log n) |
| Insertion | O(log n) |
| Deletion | O(log n) |
| Space Complexity | O(n log n) (expected) |

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## Author

Youssef Al Mukdad
