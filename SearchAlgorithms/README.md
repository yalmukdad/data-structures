# Search Algorithms Efficiency Analysis

This project compares the performance of different search algorithms (Linear, Binary, and Recursive Binary Search) on sorted and unsorted data. It also analyzes the impact of sorting on search efficiency.

## Project Structure

* **SearchAlgorithms.java:** Contains the implementation of the search algorithms (Linear Search, Binary Search, and Recursive Binary Search).
* **M08A15.java:**  (You'll need to provide this) The main driver class that generates data, performs searches, measures execution times, and outputs the results.
* **ICS123-M08A15.docx:** (You'll need to provide this) The assignment document with instructions and questions.
* **README.md:**  This file, providing a description of the project.

## Algorithms Implemented

* **Linear Search:**  Iterates through the array sequentially to find the target value.
* **Binary Search:**  Efficiently searches a sorted array by repeatedly dividing the search interval in half.
* **Recursive Binary Search:**  Implements binary search using recursion.

## How to Run

1. **Compile the Java files:**
   ```bash
   javac SearchAlgorithms.java M08A15.java 
Run the main program:
Bash

java M08A15
Output
The program will output:

Original product prices (unsorted).
Search results and execution times for each search algorithm on unsorted and sorted data.
Sorting time for the chosen sorting algorithm.
Analysis
The output allows you to compare the performance of the search algorithms and understand how sorting impacts search efficiency. You can analyze the results to answer the questions in the ICS123-M08A15.docx assignment document.

Key Findings
Binary Search Efficiency: Binary search significantly outperforms linear search on sorted data, especially for large datasets.
Sorting Impact: Sorting data is crucial for enabling efficient search algorithms like binary search.
Recursion Overhead: Recursive binary search might be slightly slower than the iterative version due to function call overhead.
Contributing
This project is for educational purposes. Feel free to experiment with different datasets, sorting algorithms, and search implementations to further explore search efficiency.

## Author

Youssef Al Mukdad
