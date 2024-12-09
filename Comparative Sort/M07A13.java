package Youssef_AlMukdad;

import java.util.Arrays;
import java.util.Random;
public class M07A13 {
public static void main(String[] args) {
ComparativeSort sorter = new ComparativeSort();
Random random = new Random();
// Generate random product price data (array of integers representing product prices)
int[] productPrices = new int[20];
System.out.println("Original Product Prices:");
for (int i = 0; i < productPrices.length; i++) {
productPrices[i] = random.nextInt(1000); // Random prices between 0 and 999
System.out.print(productPrices[i] + " ");
}
System.out.println("\n");
// Test Bubble Sort
int[] pricesForBubbleSort = Arrays.copyOf(productPrices,
productPrices.length);
long startTime = System.nanoTime();
sorter.bubbleSort(pricesForBubbleSort);
long endTime = System.nanoTime();
System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ns");
System.out.println("Prices after Bubble Sort:");
printArray(pricesForBubbleSort);
// Test Selection Sort
int[] pricesForSelectionSort = Arrays.copyOf(productPrices,
productPrices.length);
startTime = System.nanoTime();
sorter.selectionSort(pricesForSelectionSort);
endTime = System.nanoTime();
System.out.println("Selection Sort Time: " + (endTime - startTime) + "ns");
System.out.println("Prices after Selection Sort:");
printArray(pricesForSelectionSort);
// Test Merge Sort
int[] pricesForMergeSort = Arrays.copyOf(productPrices,
productPrices.length);
startTime = System.nanoTime();
sorter.mergeSort(pricesForMergeSort);
endTime = System.nanoTime();
System.out.println("Merge Sort Time: " + (endTime - startTime) + " ns");
System.out.println("Prices after Merge Sort:");
printArray(pricesForMergeSort);
}
// Helper method to print an array of integers
public static void printArray(int[] arr) {
for (int price : arr) {
System.out.print(price + " ");
}
System.out.println("\n");
}
}