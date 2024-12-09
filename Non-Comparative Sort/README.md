# Non-Comparative Sorting Algorithms in Java

This repository contains a Java implementation of two non-comparative sorting algorithms: Counting Sort and Radix Sort. The project demonstrates the usage and performance comparison of these algorithms for sorting product price data.

## Project Overview

This assignment explores non-comparative sorting techniques, which are particularly efficient for sorting integer data within a known range. The implemented algorithms include:

* **Counting Sort:** Sorts by counting the occurrences of each element and placing them in their correct sorted positions.
* **Radix Sort:** Sorts digit by digit, starting from the least significant digit, using Counting Sort as a subroutine.

## Files Included

* `NonComparativeSort.java`: Contains the Java implementation of the `NonComparativeSort` class with `countingSort` and `radixSort` methods.
* `M07A14.java`: A test file that generates random product price data and measures the execution time of both sorting algorithms.
* `ICS123-M07A14.docx`: The original assignment instructions (provided by you).
* `README.md`: This file.

## How to Run

1. **Ensure you have Java Development Kit (JDK) installed.**
2. **Compile the Java files:**

   ```bash
   javac NonComparativeSort.java M07A14.java
 
3. **Run the test file:

Results and Analysis
The M07A14.java file generates random product prices and measures the execution time for both sorting algorithms. The output will display the original and sorted arrays, along with the time taken by each algorithm.

In general, Radix Sort is expected to perform better than Counting Sort, especially for larger datasets and when the range of possible values is significantly larger than the number of elements to be sorted.

Assignment Completion
This project completes the following tasks from the assignment instructions:

Implementation of Counting Sort and Radix Sort algorithms.
Measurement of execution time for both algorithms.
Comparison of the results to determine the more efficient algorithm for sorting product prices.

## Author 

Youssef Al Mukdad
