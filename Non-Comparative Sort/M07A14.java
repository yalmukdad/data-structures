package Youssef_AlMukdad;

import java.util.Arrays;
import java.util.Random;
public class M07A14 {
	
public static void main(String[] args) {
NonComparativeSort sorter = new NonComparativeSort();
Random random = new Random();
// Generate random product price data (array of integers representing product prices)
int[] productPrices = new int[20];
System.out.println("Original Product Prices:");
for (int i = 0; i < productPrices.length; i++) {
productPrices[i] = random.nextInt(1000); // Random prices between 0 and 999
System.out.print(productPrices[i] + " ");
}
System.out.println("\n");
// Test Counting Sort
int[] pricesForCountingSort = Arrays.copyOf(productPrices,
productPrices.length);
long startTime = System.nanoTime();
sorter.countingSort(pricesForCountingSort);
long endTime = System.nanoTime();
System.out.println("Counting Sort Time: " + (endTime - startTime) + " ns");
System.out.println("Prices after Counting Sort:");
printArray(pricesForCountingSort);
// Test Radix Sort
int[] pricesForRadixSort = Arrays.copyOf(productPrices,
productPrices.length);
startTime = System.nanoTime();
sorter.radixSort(pricesForRadixSort);
endTime = System.nanoTime();
System.out.println("Radix Sort Time: " + (endTime - startTime) + " ns");
System.out.println("Prices after Radix Sort:");
printArray(pricesForRadixSort);
}
// Helper method to print an array of integers
public static void printArray(int[] arr) {
for (int price : arr) {
System.out.print(price + " ");
}
System.out.println("\n");
}
}

