package Youssef_AlMukdad;

public class M02A4 {
public static void main(String[] args) {
// Create an instance of ArrayClass (the array is initialized internally)
ArrayClass arrayOps = new ArrayClass();
// Task 1: Display the array
arrayOps.displayArray();
// Task 2: Calculate sum and average
int sum = arrayOps.calculateSum();
double average = arrayOps.calculateAverage(); // This needs to be implemented by the student
System.out.println("Sum: " + sum);
System.out.println("Average: " + average);
// Task 3: Find max and min
int max = arrayOps.findMax();
int min = arrayOps.findMin(); // This needs to be implemented by the student
System.out.println("Maximum value: " + max);
System.out.println("Minimum value: " + min);
// Task 4: Reverse the array
arrayOps.reverseArray();
// Task 5: Remove an element at index 3
arrayOps.removeElement(3);
arrayOps.displayArrayAfterRemoval();
}
}

