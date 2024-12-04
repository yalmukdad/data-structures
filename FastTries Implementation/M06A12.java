package Youssef_AlMukdad;

public class M06A12 {
	public static void main(String[] args) {
		FastTries fastTries = new FastTries();
		// Predefined insertions for easier testing
		System.out.println("Inserting products with their stock quantities:");
		fastTries.insert(101, 50);
		System.out.println("Inserted Product ID 101 with Stock Quantity 50.");
		fastTries.insert(202, 20);
		System.out.println("Inserted Product ID 202 with Stock Quantity 20.");
		fastTries.insert(303, 30);
		System.out.println("Inserted Product ID 303 with Stock Quantity 30.");
		fastTries.insert(404, 40);
		System.out.println("Inserted Product ID 404 with Stock Quantity 40.");
		// Test the find method
		System.out.println("\nFinding products by their Product ID:");
		System.out.println("Product ID 101: Stock Quantity = " +
		fastTries.find(101)); // Expected: 50
		System.out.println("Product ID 202: Stock Quantity = " +
		fastTries.find(202)); // Expected: 20
		System.out.println("Product ID 999: Stock Quantity = " +
		fastTries.find(999)); // Expected: -1 (not found)
		// Test the delete method
		System.out.println("\nDeleting Product ID 202:");
		fastTries.delete(202);
		System.out.println("Product ID 202: Stock Quantity = " +
		fastTries.find(202)); // Expected: -1 (after deletion)
		// Insert another product after deletion to test sorted insertion
		System.out.println("\nInserting Product ID 505 with Stock Quantity 60 after deletion:");
		fastTries.insert(505, 60);
		System.out.println("Inserted Product ID 505 with Stock Quantity 60.");
		// Verify all product insertions and deletions
		System.out.println("\nVerifying all products after insertions and deletions:");
		System.out.println("Product ID 101: Stock Quantity = " +
		fastTries.find(101)); // Expected: 50
		System.out.println("Product ID 303: Stock Quantity = " +
		fastTries.find(303)); // Expected: 30
		System.out.println("Product ID 404: Stock Quantity = " +
		fastTries.find(404)); // Expected: 40
		System.out.println("Product ID 505: Stock Quantity = " +
		fastTries.find(505)); // Expected: 60
		}
}
