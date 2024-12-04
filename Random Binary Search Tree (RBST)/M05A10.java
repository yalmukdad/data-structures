package Youssef_AlMukdad;

import java.util.Random;
import java.util.Scanner;
public class M05A10 {
public static void main(String[] args) {
RandomBinarySearchTree productTree = new RandomBinarySearchTree();
Random random = new Random();
Scanner scanner = new Scanner(System.in); // Initialize scanner for user input
// Simulating the management of product IDs
System.out.println("Welcome to the E-commerce Product Management System");
System.out.println("We are using a Random Binary Search Tree (RBST) to organize product IDs.");
System.out.println("Initializing random product IDs into the system...");
// Inserting random product IDs into the tree
for (int i = 0; i < 10; i++) {
int productID = random.nextInt(100) + 1; // Generate random product IDs between 1 and 100
productTree.insert(productID);
System.out.println("Inserted product ID: " + productID);
}
// Print the tree structure after insertions
System.out.println("\nThe current product ID tree (in-order traversal):");
productTree.printTree();
System.out.println("\n");
// Search for a random product ID
System.out.println("Let's search for a product in the system.");
System.out.print("Enter a product ID to search for: ");
int searchID = scanner.nextInt();
if (productTree.search(searchID)) {
System.out.println("Product ID " + searchID + " is in the system.");
} else {
System.out.println("Product ID " + searchID + " was not found.");
}
// Insert a specific product ID
System.out.println("\nNow let's add a specific product ID (e.g., 42) to the system.");
int specificProductID = 42;
productTree.insert(specificProductID);
System.out.println("Inserted product ID: " + specificProductID);
// Print the updated tree
System.out.println("\nUpdated product ID tree after inserting 42:");
productTree.printTree();
System.out.println("\n");
// Prompt for a product ID to delete and search before attempting deletion
System.out.print("Enter a product ID to delete from the system: ");
int deleteID = scanner.nextInt();
// Search for the product ID before deleting
if (productTree.search(deleteID)) {
System.out.println("Product ID " + deleteID + " found. Proceeding to deletion...");
productTree.delete(deleteID);
System.out.println("Deleted product ID: " + deleteID);
} else {
System.out.println("Product ID " + deleteID + " was not found in the system. Deletion aborted.");
}
// Print the tree after deletion (if it occurred)
System.out.println("\nProduct ID tree after deletion (if any):");
productTree.printTree();
System.out.println("\n");
// Close the scanner to prevent resource leak
scanner.close();
// Closing message
System.out.println("\nThank you for using the E-commerce Product Management System.");
}
}
