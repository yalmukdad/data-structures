package Youssef_AlMukdad;

public class M05A9 {
public static void main(String[] args) {
// Create a new Binary Search Tree to manage product IDs
BinarySearchTree bst = new BinarySearchTree();
System.out.println("=== E-Commerce Product ID Management System ===");
// Insert product IDs into the system
System.out.println("\nInserting Product IDs:");
int[] productIDs = {50, 30, 70, 20, 40, 60, 80, 10, 35, 75};
for (int id : productIDs) {
bst.insert(id);
System.out.println("Inserted Product ID: " + id);
}
// Print the tree structure (in-order traversal)
System.out.println("\nProduct ID Tree (In-Order Traversal):");
bst.printTree();
// Search for specific product IDs
System.out.println("\nSearching for Product IDs:");
int[] searchIDs = {40, 90, 60, 15};
for (int id : searchIDs) {
if (bst.search(id)) {
System.out.println("Product ID " + id + " found in the system.");
} else {
System.out.println("Product ID " + id + " NOT found in the system.");
}
}
// Delete specific product IDs
System.out.println("\nDeleting Product IDs:");
int[] deleteIDs = {20, 30, 50};
for (int id : deleteIDs) {
System.out.println("Deleting Product ID: " + id);
bst.delete(id);
System.out.println("Product ID " + id + " deleted.");
System.out.println("Updated Product ID Tree (In-Order Traversal):");
bst.printTree(); // Print the tree after each deletion
}
System.out.println("\nFinal Product ID Tree (In-Order Traversal):");
bst.printTree();
System.out.println("\n=== End of Product ID Management System ===");
}
}