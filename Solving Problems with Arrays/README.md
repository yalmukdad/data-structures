# Array Operations

This Java program demonstrates various operations on an integer array using a separate `ArrayClass` to encapsulate the array and its associated methods. This approach promotes better organization and code reusability.

## Table of Contents

- [Features](#features)
- [Files](#files)
- [Usage](#usage)
- [Example Operations](#example-operations)
- [Benefits of Encapsulation](#benefits-of-encapsulation)
- [Contributing](#contributing)
- [Author](#author)

## Features

- **Display array:** Prints the contents of the array to the console.
- **Calculate sum and average:** Computes the sum and average of the array elements.
- **Find max and min:** Determines the maximum and minimum values in the array.
- **Reverse array:** Reverses the order of elements in the array in-place.
- **Remove element:** Removes an element at a specified index, shifting the remaining elements to fill the gap.

## Files

- **`ArrayClass.java`:**  Contains the implementation of the `ArrayClass`, which includes:
    - A private integer array (`arr`) to store the numbers.
    - A constructor to initialize the array with default values.
    - Public methods to perform the array operations listed above.
- **`M02A4.java`:** Contains the `main` method that demonstrates the usage of the `ArrayClass` and its methods.

## Usage

1. **Clone the repository:** `git clone <repository_url>`
2. **Compile:** `javac ArrayClass.java M02A4.java`
3. **Run:** `java M02A4`

## Example Operations

The `M02A4.java` file demonstrates the following operations:

- Creating an instance of `ArrayClass`.
- Displaying the initial array.
- Calculating and printing the sum and average.
- Finding and printing the maximum and minimum values.
- Reversing the array.
- Removing an element at a specified index.
- Displaying the array after the removal operation.

## Benefits of Encapsulation

This program demonstrates the concept of encapsulation in object-oriented programming:

- **Data Hiding:** The array (`arr`) is declared as `private` in `ArrayClass`, preventing direct access from outside the class. This protects the data and ensures that it can only be modified through the provided methods.
- **Modularity:** Encapsulating the array and its operations within the `ArrayClass` makes the code more modular and easier to maintain. Changes to the array structure or operations can be made within the class without affecting other parts of the program.
- **Code Reusability:** The `ArrayClass` can be reused in other programs that require similar array operations.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[Choose a license and include it here. Example: MIT License]

## Author

Youssef Al Mukdad
