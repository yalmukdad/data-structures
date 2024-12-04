package Youssef_AlMukdad;

public class ArrayClass {
    private int[] numbers;

    // Constructor to initialize the array within the class
    public ArrayClass() {
        // Initialize the array with default values
        this.numbers = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    }

    // Pseudocode:
    // Method to display the array
    // 1. Loop through the array from index 0 to numbers.length - 1
    // 2. Print each element in the array
    public void displayArray() {
        System.out.println("The numbers in the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Pseudocode:
    // Method to calculate the sum of the array
    // 1. Initialize a sum variable to 0
    // 2. Loop through the array and add each element to the sum variable
    // 3. Return the sum
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // Pseudocode:
    // Method to calculate the average of the array
    // 1. Use the total sum of the array (you can reuse the calculateSum method)
    // 2. Divide the sum by the number of elements in the array (numbers.length)
    // 3. Return the calculated average
    public double calculateAverage() {
        if (numbers.length == 0) {
            return 0.0; // To avoid division by zero
        }
        int sum = calculateSum(); 
        return (double) sum / numbers.length;
    }

    // Pseudocode:
    // Method to find the maximum value in the array
    // 1. Assume the first element is the maximum
    // 2. Loop through the array starting from the second element
    // 3. Compare each element to the current maximum and update if the element is larger
    // 4. Return the maximum value
    public int findMax() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Pseudocode:
    // Method to find the minimum value in the array
    // 1. Assume the first element is the minimum
    // 2. Loop through the array starting from the second element
    // 3. Compare each element to the current minimum and update if the element is smaller
    // 4. Return the minimum value
    public int findMin() {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE; // Handle empty array case
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Pseudocode:
    // Method to reverse the array
    // 1. Loop through the array from the last index to the first index
    // 2. Print each element in reverse order
    public void reverseArray() {
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Pseudocode:
    // Method to remove an element at a specified index
    // 1. Loop through the array starting at the index to remove
    // 2. Shift each subsequent element one position to the left
    // 3. Set the last element of the array to a default value (e.g., 0)
    public void removeElement(int index) {
        if (index >= 0 && index < numbers.length) {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            // Optional: Set the last element to 0 to indicate "removed"
            numbers[numbers.length - 1] = 0;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // Pseudocode:
    // Method to display the array after removing an element
    // 1. Loop through the array from index 0 to numbers.length - 2 to ignore the last element
    // 2. Print each element
    public void displayArrayAfterRemoval() {
        System.out.println("Array after removal:");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
