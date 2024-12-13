package Youssef_AlMukdad;

import java.util.Scanner;
public class M08FP {
public static void main(String[] args) {
CSVIndexManager csvIndex = new CSVIndexManager();
Scanner scanner = new Scanner(System.in);
int choice;
while (true) {
System.out.println("\nMenu:");
System.out.println("1. Generate Index");
System.out.println("2. Load Index");
System.out.println("3. Search by Primary Key");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine(); // Consume newline
switch (choice) {
case 1:
long startTime = System.nanoTime();
csvIndex.generateIndex();
long endTime = System.nanoTime();
System.out.println("Index Generation Time: " + (endTime -
startTime)/1000000000.0 + " seconds");
break;
case 2:
startTime = System.nanoTime();
csvIndex.loadIndex();
endTime = System.nanoTime();
System.out.println("Index Loading Time: " + (endTime -
startTime)/1000000000.0 + " seconds");
break;
case 3:
System.out.print("Enter primary key to search: ");
String keyToSearch = scanner.nextLine();
// Measure time for linear search
startTime = System.nanoTime();
csvIndex.performLinearSearch(keyToSearch);
endTime = System.nanoTime();
System.out.println("Linear Search Time: " + (endTime -
startTime)/1000000000.0 + " seconds");
// Measure time for map-based search
startTime = System.nanoTime();
csvIndex.performMapSearch(keyToSearch);
endTime = System.nanoTime();
System.out.println("Map-Based Search Time: " + (endTime -
startTime)/1000000000.0 + " seconds");
break;
case 4:
System.out.println("Exiting...");
scanner.close();
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}