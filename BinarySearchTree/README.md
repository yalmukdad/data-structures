# Binary Search Tree (BST)

This project implements a Binary Search Tree (BST) data structure in Java. A BST is a tree-based data structure that allows for efficient searching, insertion, and deletion of nodes while maintaining a specific order. In a BST, the left subtree of a node contains only nodes with keys lesser than the node's key, and the right subtree contains only nodes with keys greater than the node's key.

## Key Features

* **Standard BST Operations:** The BST supports the following standard operations:
    * `insert(int value)`: Inserts a new node with the given value.
    * `search(int value)`: Searches for a node with the given value and returns `true` if found, `false` otherwise.
    * `delete(int value)`: Deletes the node with the given value.
    * `printTree()`: Prints the tree using in-order traversal (which outputs the values in ascending order).

## Usage

The main application of this BST is demonstrated in the `M05A9.java` file. This file simulates an e-commerce product management system where product IDs are stored and managed using the BST. The system demonstrates the following functionalities:

1. **Initialization:** Product IDs are inserted into the BST.
2. **Search:** The system searches for specific product IDs and reports whether they are found.
3. **Deletion:** The system deletes specific product IDs from the BST.
4. **Traversal:** The tree is printed using in-order traversal at various stages.

To run the simulation, compile and run the `M05A9.java` file.

## Author

Youssef Al Mukdad
