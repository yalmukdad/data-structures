package Youssef_AlMukdad;

public class BinarySearchTree {

    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;  // Initialize the node with the given value. [cite: 31, 32, 33, 34]
            left = right = null; // Set left and right children to null. [cite: 31, 32, 33, 34]
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null; // Initialize the root as null (empty tree). [cite: 31, 32, 33, 34]
    }

    public void insert(int value) {
        root = insertRec(root, value); // Recursively insert the value into the tree. [cite: 31, 32, 33, 34]
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            node = new Node(value); // If the node is null, create a new node with the value. [cite: 31, 32, 33, 34]
        } else if (value < node.value) {
            node.left = insertRec(node.left, value); // If the value is less than the current node's value, recurse left. [cite: 31, 32, 33, 34]
        } else if (value > node.value) {
            node.right = insertRec(node.right, value); // If the value is greater than the current node's value, recurse right. [cite: 31, 32, 33, 34]
        }
        return node; // Return the node. [cite: 31, 32, 33, 34]
    }

    public boolean search(int value) {
        return searchRec(root, value); // Recursively search for the value in the tree. [cite: 31, 32, 33, 34]
    }

    private boolean searchRec(Node node, int value) {
        if (node == null) {
            return false; // If the node is null, return false (not found). [cite: 31, 32, 33, 34]
        } else if (node.value == value) {
            return true; // If the value matches the current node's value, return true. [cite: 31, 32, 33, 34]
        } else if (value < node.value) {
            return searchRec(node.left, value); // If the value is less, recurse into the left subtree. [cite: 31, 32, 33, 34]
        } else {
            return searchRec(node.right, value); // If the value is greater, recurse into the right subtree. [cite: 31, 32, 33, 34]
        }
    }

    public void delete(int value) {
        root = deleteRec(root, value); // Recursively find and delete the value from the tree. [cite: 31, 32, 33, 34]
    }

    private Node deleteRec(Node node, int value) {
        if (node == null) {
            return node; // If the node is null, return null (not found). [cite: 31, 32, 33, 34]
        }

        if (value < node.value) {
            node.left = deleteRec(node.left, value); // Value is less, recurse left. [cite: 31, 32, 33, 34]
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value); // Value is greater, recurse right. [cite: 31, 32, 33, 34]
        } else {
            // Node with one or no child. [cite: 31, 32, 33, 34]
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children. [cite: 31, 32, 33, 34]
            node.value = minValue(node.right); // Find the in-order successor. [cite: 31, 32, 33, 34]
            node.right = deleteRec(node.right, node.value); // Delete the in-order successor. [cite: 31, 32, 33, 34]
        }

        return node;
    }

    // Helper method to find the in-order successor (smallest in the right subtree). [cite: 31, 32, 33, 34]
    private int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("The tree is empty"); // Print "The tree is empty" if there are no nodes. [cite: 31, 32, 33, 34]
        } else {
            printInOrder(root); // Print the tree using an in-order traversal. [cite: 31, 32, 33, 34]
        }
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left); // Recursively traverse the left subtree. [cite: 31, 32, 33, 34]
            System.out.print(node.value + " "); // Print the node's value. [cite: 31, 32, 33, 34]
            printInOrder(node.right); // Recursively traverse the right subtree. [cite: 31, 32, 33, 34]
        }
    }
}