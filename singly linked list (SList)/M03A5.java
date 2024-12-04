package Youssef_AlMukdad;
//M02A3.java
//NAME: YourFirstName YourLastName


public class M03A5 {
 public static void main(String[] args) {
     // Step 1: Create an instance of SList to manage employee registrations
     SList employeeList = new SList();

     // Step 2: Add several employees to the registration list
     System.out.println("Adding employees to the registration list:");
     employeeList.add("John");
     employeeList.add("Jane");
     employeeList.add("Alice");
     employeeList.add("Bob");
     employeeList.add("Alice");  // Adding Alice twice to test counting occurrences

     // Step 3: Print the current list of registered employees
     System.out.println("\nCurrent list of registered employees:");
     employeeList.printList();

     // Step 4: Check if specific employees are registered
     System.out.println("\nChecking if certain employees are registered:");
     System.out.println("Is 'Alice' registered? " + employeeList.contains("Alice"));
     System.out.println("Is 'David' registered? " + employeeList.contains("David"));  // Not registered

     // Step 5: Remove an employee from the list and check the updated list
     System.out.println("\nRemoving 'John' from the list.");
     employeeList.remove("John");

     // Print the updated list after removing 'John'
     System.out.println("\nUpdated list of registered employees:");
     employeeList.printList();

     // Step 6: Count occurrences of a specific employee's name
     System.out.println("\nCounting occurrences of 'Alice' in the list:");
     int aliceCount = employeeList.countOccurrences("Alice");
     System.out.println("'Alice' appears " + aliceCount + " time(s) in the list.");

     // Step 7: Test the size method to check the total number of employees
     System.out.println("\nChecking the size of the employee list:");
     int size = employeeList.size();
     System.out.println("The list contains " + size + " employee(s).");

     // Step 8: Remove another employee and check the size again
     System.out.println("\nRemoving 'Jane' from the list.");
     employeeList.remove("Jane");

     System.out.println("\nUpdated list of registered employees:");
     employeeList.printList();

     System.out.println("\nChecking the size of the employee list after removal:");
     size = employeeList.size();
     System.out.println("The list contains " + size + " employee(s).");
 }
}
