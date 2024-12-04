package Youssef_AlMukdad;

import java.util.Scanner;
import java.util.LinkedList;
public class M06A11 {
public static void main(String[] args) {
Graph productGraph = new Graph();
// Simulating a product network (Product ID connections)
System.out.println("Setting up product relationships in the e-commerce platform...");
// Adding edges between products (representing related products)
productGraph.addEdge(1, 2); // Product 1 (Laptop) related to Product 2 (Laptop Bag)
productGraph.addEdge(1, 3); // Product 1 (Laptop) related to Product 3 (Mouse)
productGraph.addEdge(2, 4); // Product 2 (Laptop Bag) related to Product 4(Power Bank)
productGraph.addEdge(2, 5); // Product 2 (Laptop Bag) related to Product 5(External Hard Drive)
productGraph.addEdge(3, 6); // Product 3 (Mouse) related to Product 6(Keyboard)
productGraph.addEdge(3, 7); // Product 3 (Mouse) related to Product 7(Monitor)
productGraph.addEdge(4, 8); // Product 4 (Power Bank) related to Product 8(USB Charger)
productGraph.addEdge(5, 9); // Product 5 (External Hard Drive) related toProduct 9 (SSD)
productGraph.addEdge(6, 10); // Product 6 (Keyboard) related to Product 10(Gaming Chair)
// Displaying the product list for the user
System.out.println("\nList of Products and their Corresponding IDs:");
System.out.println("1 - Laptop");
System.out.println("2 - Laptop Bag");
System.out.println("3 - Mouse");
System.out.println("4 - Power Bank");
System.out.println("5 - External Hard Drive");
System.out.println("6 - Keyboard");
System.out.println("7 - Monitor");
System.out.println("8 - USB Charger");
System.out.println("9 - SSD");
System.out.println("10 - Gaming Chair");
// Print the product network (Adjacency list representation)
System.out.println("\nProduct Graph (Product ID Connections):");
productGraph.printGraph();
System.out.println();
// User Interaction and Traversal
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the E-commerce Product Recommendation System!");
System.out.println("You can explore related products using either BFS or DFS.");
// Prompt user to choose traversal method
System.out.print("\nEnter a product ID to start traversing the product network: ");
int startProductID = scanner.nextInt();
// Check if the entered product ID is part of the graph
if (!productGraph.hasNode(startProductID)) {
System.out.println("Product " + startProductID + " does not exist in the product network.");
System.out.println("Returning the inputted product as a standalone node:");
System.out.println("BFS Traversal starting from " + startProductID + ":" + startProductID);
} else {
System.out.println("\nChoose the traversal method:");
System.out.println("1. BFS (Explore products level by level)");
System.out.println("2. DFS (Explore products deeply, one path at a time)");
int choice = scanner.nextInt();
LinkedList<Integer> traversalResult = new LinkedList<>();
if (choice == 1) {
// Perform BFS starting from the selected product
System.out.println("\n--- BFS Traversal Starting from Product " +
startProductID + " ---");
traversalResult = productGraph.bfs(startProductID);
System.out.println("--- End of BFS Traversal ---");
} else if (choice == 2) {
// Perform DFS starting from the selected product
System.out.println("\n--- DFS Traversal Starting from Product " +
startProductID + " ---");
traversalResult = productGraph.dfs(startProductID);
System.out.println("--- End of DFS Traversal ---");
} else {
System.out.println("Invalid choice! Please choose either 1 or 2.");
return;}
// Print only the first 3 recommendations
System.out.println("\n--- Top 3 Product Recommendations ---");
for (int i = 0; i < Math.min(3, traversalResult.size()); i++) {
System.out.print(traversalResult.get(i) + " ");
}
System.out.println("\n--- End of Recommendations ---");
}
// Closing message
System.out.println("\nThank you for using the E-commerce Product Recommendation System!");
scanner.close();
}
}