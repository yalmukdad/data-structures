# External Data Management and Search

This project demonstrates efficient data management techniques by simulating external memory access using files. It implements methods to read, write, search, and sort data stored in external files.

## Project Description

This project simulates working with large datasets that are typically too large to fit into memory. It focuses on efficiently managing this data by performing the following operations:

1. **Load data:** Reads data from an external file named `inputData.txt` located in the `src` folder. If the file doesn't exist, it generates random data and saves it to the file.
2. **Search data:** Searches for a specific value (e.g., a product ID) within the external file. Implements both unsorted and sorted search algorithms.
3. **Sort data:** Sorts the data read from the external file.
4. **Write data:** Writes the sorted data back to an external file named `sortedData.txt` in the `src` folder.

## Files Included

* **`ExternalData.java`:** Contains the implementation of the data management and search operations.
* **`inputData.txt`:** Stores the input data (either provided or randomly generated).
* **`sortedData.txt`:** Stores the sorted data output.
* **`M08A15_SearchAlgorithms.txt`:** (Optional) If provided, contains pseudocode for the search algorithms.
* **`M08A15.java`:** (Optional) If provided, contains a test file to run the search and sorting algorithms.
* **`README.md`:** This file, providing a description of the project.

## How to Run

1. **Compile:** Compile the `ExternalData.java` file.
2. **Run:** Execute the compiled code. If `inputData.txt` is not found, the program will generate random data and save it to this file.
3. **Observe Output:** The program will output the time taken for each operation (reading, searching, sorting, writing) and the results of the searches.

## Implementation Details

* **`ExternalData.java`:**
    * Implements methods for reading data from a file (`readDataFromFile`), writing data to a file (`writeDataToFile`), and searching for a target value in the file (`externalSearch`).
    * The `externalSearch` method should implement both a linear search (for unsorted data) and a more efficient search algorithm (e.g., binary search) for sorted data.
    * Includes error handling for file operations.

## Additional Notes

* The project assumes that the input file (`inputData.txt`) contains one integer per line.
* The search target value can be modified within the code.
* The program measures and outputs the time taken for each operation to analyze efficiency.

This README file provides a comprehensive overview of the project, its functionality, and how to run it. It also highlights the key implementation details and any assumptions made.

## Author 

Youssef Al Mukdad
