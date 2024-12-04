package Youssef_AlMukdad;

import java.util.Random;

public class RandomBinarySearchTree {

    // Class representing a node in the Random Binary Search Tree [cite: 1, 2]
    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            // Pseudocode:
            // 1. Initialize the node with the given value. [cite: 2, 3]
            // 2. Set left and right children to null. [cite: 2, 3]
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
    private Random rand; // Random object for random operations [cite: 3, 4, 5]

    // Constructor for Random Binary Search Tree [cite: 3, 4, 5]
    public RandomBinarySearchTree() {
        // Pseudocode:
        // 1. Initialize the root as null (empty tree). [cite: 4, 5, 6, 7]
        // 2. Initialize the Random object for random operations. [cite: 4, 5, 6, 7]
        root = null;
        rand = new Random();
    }

    // Method to insert a value into the Random Binary Search Tree [cite: 5, 6, 7, 8]
    public void insert(int value) {
        // Pseudocode:
        // 1. Use randomness to decide where to insert the new value. [cite: 5, 6, 7, 8]
        // 2. If the tree is empty, the new value becomes the root. [cite: 5, 6, 7, 8]
        // 3. Recursively insert the value into a random subtree. [cite: 5, 6, 7, 8]
        if (root == null) {
            root = new Node(value);
        } else {
            insertRec(root, value);
        }
    }

    // Helper method for recursive random insertion [cite: 8, 9, 10, 11]
    private Node insertRec(Node node, int value) {
        // Pseudocode:
        // 1. If node is null, create a new node with the value and return it. [cite: 8, 9, 10, 11]
        // 2. Use a random choice to decide whether to insert into the left or right subtree. [cite: 8, 9, 10, 11]
        // 3. Recursively insert the value into the chosen subtree. [cite: 8, 9, 10, 11]
        if (node == null) {
            return new Node(value);
        }

        // Randomly choose left or right subtree [cite: 8, 9, 10, 11]
        if (rand.nextBoolean()) {
            node.left = insertRec(node.left, value);
        } else {
            node.right = insertRec(node.right, value);
        }

        return node; // Return the (potentially modified) node [cite: 8, 9, 10, 11]
    }

    // Method to search for a value in the Random Binary Search Tree [cite: 11, 12, 13]
    public boolean search(int value) {
        // Pseudocode:
        // 1. Perform a binary search to find the value in the tree. [cite: 11, 12, 13]
        // 2. Return true if the value is found, otherwise return false. [cite: 11, 12, 13]
        return searchRec(root, value);
    }

    // Helper method for recursive search [cite: 13, 14, 15, 16, 17]
    private boolean searchRec(Node node, int value) {
        // Pseudocode:
        // 1. If node is null, return false (value not found). [cite: 13, 14, 15, 16, 17]
        // 2. If value matches the node's value, return true. [cite: 13, 14, 15, 16, 17]
        // 3. If value is less, recursively search the left subtree. [cite: 13, 14, 15, 16, 17]
        // 4. If value is greater, recursively search the right subtree. [cite: 13, 14, 15, 16, 17]
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        if (value < node.value) {
            return searchRec(node.left, value);
        } else {
            return searchRec(node.right, value);
        }
    }

    // Method to delete a value from the Random Binary Search Tree [cite: 17, 18, 19]
    public void delete(int value) {
        // Pseudocode:
        // 1. Recursively find and delete the value from the tree. [cite: 17, 18, 19]
        // 2. Adjust the tree structure to maintain the BST properties. [cite: 17, 18, 19]
        root = deleteRec(root, value);
    }

    // Helper method for recursive deletion [cite: 19, 20, 21, 22]
    private Node deleteRec(Node node, int value) {
        // Pseudocode:
        // 1. Recursively find the node to delete. [cite: 19, 20, 21, 22]
        // 2. Handle cases where the node has no children, one child, or two children. [cite: 19, 20, 21, 22]
        // 3. If the node has two children, replace it with the in-order successor. [cite: 19, 20, 21, 22]
        if (node == null) {
            return node;
        }

        if (value < node.value) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value);
        } else {
            // Node with one or no child [cite: 19, 20, 21, 22]
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children [cite: 19, 20, 21, 22]
            node.value = minValue(node.right);
            node.right = deleteRec(node.right, node.value);
        }

        return node;
    }

    // Helper method to find the in-order successor (smallest in the right subtree) [cite: 19, 20, 21, 22]
    private int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    // Method to print the tree using in-order traversal [cite: 22, 23, 24]
    public void printTree() {
        // Pseudocode:
        // 1. Print the tree using in-order traversal. [cite: 22, 23, 24]
        // 2. Print "The tree is empty" if there are no nodes. [cite: 22, 23, 24]
        if (root == null) {
            System.out.println("The tree is empty");
        } else {
            printInOrder(root);
            System.out.println(); // Add a newline after printing the tree [cite: 22, 23, 24]
        }
    }

    // Helper method to perform in-order traversal [cite: 24, 25]
    private void printInOrder(Node node) {
        // Pseudocode:
        // 1. Recursively traverse the left subtree. [cite: 24, 25]
        // 2. Print the node's value. [cite: 24, 25]
        // 3. Recursively traverse the right subtree. [cite: 24, 25]
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }
}