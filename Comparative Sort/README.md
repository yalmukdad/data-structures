# Comparative Sort

This Java project implements and compares the performance of three sorting algorithms: Bubble Sort, Selection Sort, and Merge Sort.

## Overview

This project was created to fulfill an assignment for ICS 123. The goal is to analyze the efficiency of different sorting algorithms by measuring their execution time on a dataset of product prices.

## Implemented Algorithms

* **Bubble Sort:** A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
* **Selection Sort:** An in-place comparison sorting algorithm that divides the input list into two parts: a sorted sublist and an unsorted sublist. It repeatedly selects the minimum element from the unsorted sublist and swaps it with the element at the beginning of the unsorted sublist.
* **Merge Sort:** A divide-and-conquer algorithm that recursively divides the input list into two halves, sorts them, and then merges the sorted halves back together.

## How to Run

1. **Make sure you have Java installed on your system.**
2. **Clone this repository to your local machine.**
3. **Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ).**
4. **Run the `M07A13.java` file.** This file will generate random product prices, sort them using each of the three algorithms, and display the execution time for each.

## Results

The output will show the original product prices, the sorted prices after applying each algorithm, and the execution time for each algorithm in nanoseconds. You can then analyze the results to determine which algorithm is most efficient for the given dataset.

## Analysis

Typically, Merge Sort is expected to be the most efficient for larger datasets due to its O(n log n) time complexity. However, for smaller datasets, Selection Sort or even Bubble Sort might outperform Merge Sort due to the lower overhead of these simpler algorithms. The actual performance may vary depending on the hardware, software, and specific dataset being used.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## Author

Youssef Al Mukdad
