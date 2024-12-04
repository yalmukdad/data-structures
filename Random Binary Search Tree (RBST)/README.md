# Random Binary Search Tree (RBST)

This project implements a Random Binary Search Tree (RBST) data structure in Java. An RBST is a variant of a Binary Search Tree (BST) that utilizes randomness during the insertion process to maintain an approximately balanced tree structure. This helps to prevent worst-case scenarios that can lead to degraded performance in regular BSTs.

## Key Features

* **Randomized Insertion:** The `insert()` method uses a random function to determine whether to insert a new node in the left or right subtree. This helps to prevent the tree from becoming skewed and maintains a balanced structure on average.
* **Standard BST Operations:** The RBST supports the following standard BST operations:
    * `insert(int value)`: Inserts a new node with the given value.
    * `search(int value)`: Searches for a node with the given value and returns `true` if found, `false` otherwise.
    * `delete(int value)`: Deletes the node with the given value.
    * `printTree()`: Prints the tree using in-order traversal.

## Usage

The main application of this RBST is demonstrated in the `M05A10.java` file. This file simulates an e-commerce product management system where product IDs are stored and managed using the RBST. The system demonstrates the following functionalities:

1. **Initialization:** Random product IDs are generated and inserted into the RBST.
2. **Search:** The user is prompted to search for a product ID.
3. **Insertion:** A new product ID (42) is inserted into the RBST.
4. **Deletion:** The user is prompted to delete a product ID.
5. **Traversal:** The tree is printed using in-order traversal at various stages.

To run the simulation, compile and run the `M05A10.java` file.

## Note

The `Random` object used in the `RandomBinarySearchTree` class is seeded with a specific value in the `M05A10` class to ensure consistent output for testing purposes. You can change the seed value to generate different outputs.

## Author

Youssef Al Mukdad
