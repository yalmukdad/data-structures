package Youssef_AlMukdad;

import java.util.Arrays;
import java.util.Random;
public class M08A15 {
public static void main(String[] args) {
SearchAlgorithms searchAlgorithms = new SearchAlgorithms(); // Contains search algorithms
Random random = new Random();
// Generate random product price data (array of integers representing product prices)
int[] productPrices = new int[100]; // Increase the size for larger datasets
System.out.println("Original Product Prices:");
for (int i = 0; i < productPrices.length; i++) {
productPrices[i] = random.nextInt(1000); // Random prices between 0 and 999
System.out.print(productPrices[i] + " ");
}
System.out.println("\n");
// 1. Perform Linear Search on Unsorted Data
System.out.println("\nSearch for Product ID 500 using Linear Search (Unsorted):");
long searchStartTime = System.nanoTime();
int linearSearchResult = searchAlgorithms.linearSearch(productPrices, 500);
long searchEndTime = System.nanoTime();
System.out.println("Linear Search Time (Unsorted): " + (searchEndTime -
searchStartTime) + " ns");
if (linearSearchResult != -1) {
System.out.println("Product found at index: " + linearSearchResult);
} else {
System.out.println("Product not found.");
}
// 2. Sort the data (Student to insert sorting code here)
int[] sortedProductPrices = Arrays.copyOf(productPrices,
productPrices.length);
// STUDENT: Insert sorting algorithm here (e.g., Bubble Sort, Selection Sort, etc.)
// Measure sorting time
System.out.println("\nSorting the array...");
long sortStartTime = System.nanoTime();
/**********************************************************************************
********
// Insert Sorting Algorithm Call Here (e.g.,
compSorter.bubbleSort(sortedProductPrices);)
***********************************************************************************
*******/
long sortEndTime = System.nanoTime();
System.out.println("Sorting Time: " + (sortEndTime - sortStartTime) + "ns");
// 3. Perform Linear Search on Sorted Data
System.out.println("\nSearch for Product ID 500 using Linear Search(Sorted):");
searchStartTime = System.nanoTime();
linearSearchResult = searchAlgorithms.linearSearch(sortedProductPrices,
500);
searchEndTime = System.nanoTime();
System.out.println("Linear Search Time (Sorted): " + (searchEndTime -
searchStartTime) + " ns");
if (linearSearchResult != -1) {
System.out.println("Product found at index: " + linearSearchResult);
} else {
System.out.println("Product not found.");
}
// 4. Perform Binary Search on Sorted Data
System.out.println("Search for Product ID 500 using Binary Search:");
searchStartTime = System.nanoTime();
int binarySearchResult = searchAlgorithms.binarySearch(sortedProductPrices,
500);
searchEndTime = System.nanoTime();
System.out.println("Binary Search Time: " + (searchEndTime -
searchStartTime) + " ns");
if (binarySearchResult != -1) {
System.out.println("Product found at index: " + binarySearchResult);
} else {
System.out.println("Product not found.");
}
// 5. Perform Recursive Binary Search on Sorted Data
System.out.println("Search for Product ID 500 using Recursive Binary Search:");
searchStartTime = System.nanoTime();
int recursiveBinarySearchResult =
searchAlgorithms.binarySearchRecursive(sortedProductPrices, 500, 0,
sortedProductPrices.length - 1);
searchEndTime = System.nanoTime();
System.out.println("Recursive Binary Search Time: " + (searchEndTime -
searchStartTime) + " ns");
if (recursiveBinarySearchResult != -1) {
System.out.println("Product found at index: " +
recursiveBinarySearchResult);
} else {
System.out.println("Product not found.");
}
}
// Helper method to print an array of integers
public static void printArray(int[] arr) {
for (int price : arr) {
System.out.print(price + " ");
}
System.out.println();
}
}
