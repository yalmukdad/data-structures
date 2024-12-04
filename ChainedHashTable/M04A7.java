package Youssef_AlMukdad;

public class M04A7 {// Main method to test the ChainedHashTable functionality
	public static void main(String[] args) {
		    System.out.println("==== TechCorp Chained Hash Table - Employee Records Management ====");

		    // Step 1: Create a ChainedHashTable with a capacity of 10
		    System.out.println("\nStep 1: Initializing a Chained Hash Table with capacity of 10...");
		    ChainedHashTable employees = new ChainedHashTable(10);

		    // Step 2: Add employees and their performance grades
		    System.out.println("\nStep 2: Adding employees to the system...");
		    employees.add("Alice", 90);
		    employees.add("Bob", 85);
		    employees.add("Charlie", 92);
		    System.out.println("Added: Alice (90), Bob (85), Charlie (92)");

		    // Step 3: Print the current list of employees
		    System.out.println("\nStep 3: Printing the current list of employees:");
		    employees.printList();

		    // Step 4: Search for employees
		    System.out.println("\nStep 4: Searching for specific employees...");
		    System.out.println("Searching for Alice's grade... Result: " + employees.search("Alice")); // Expected: 90
		    System.out.println("Searching for David's grade... Result: " + employees.search("David")); // Expected: null

		    // Step 5: Count the total number of employees
		    System.out.println("\nStep 5: Counting the total number of employees...");
		    int totalEmployees = employees.countEmployees();
		    System.out.println("Total employees in the system: " + totalEmployees); // Expected: 3

		    // Step 6: Remove an employee and count again
		    System.out.println("\nStep 6: Removing an employee from the system...");
		    System.out.println("Removing Bob...");
		    boolean removed = employees.remove("Bob");
		    System.out.println("Bob removed: " + removed);
		    
		    System.out.println("Updated list after removal:");
		    employees.printList();
		    
		    totalEmployees = employees.countEmployees();
		    System.out.println("Total employees after removing Bob: " + totalEmployees); // Expected: 2

		    // Step 7: Check presence of employees
		    System.out.println("\nStep 7: Checking presence of specific employees in the system...");
		    System.out.println("Is 'Charlie' in the list? " + employees.contains("Charlie")); // Expected: true
		    System.out.println("Is 'Alice' in the list? " + employees.contains("Alice")); // Expected: true
		    System.out.println("Is 'Bob' in the list? " + employees.contains("Bob")); // Expected: false

		    // Step 8: Add a new employee and print the updated list
		    System.out.println("\nStep 8: Adding a new employee, David (88), to the system...");
		    employees.add("David", 88);
		    employees.printList();

		    // Final count after all operations
		    totalEmployees = employees.countEmployees();
		    System.out.println("\nFinal total number of employees: " + totalEmployees); // Expected: 3

		    // Final presence checks
		    System.out.println("\nFinal presence checks:");
		    System.out.println("Is 'Charlie' in the list? " + employees.contains("Charlie")); // Expected: true
		    System.out.println("Is 'David' in the list? " + employees.contains("David")); // Expected: true
		    System.out.println("Is 'Alice' in the list? " + employees.contains("Alice")); // Expected: true

		    System.out.println("\n==== End of Test ====");
		}

}
