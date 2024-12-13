package Youssef_AlMukdad;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
public class M08A16 {
public static void main(String[] args) {
ExternalData externalData = new ExternalData();
String inputFilePath = "src/inputData.txt"; // Input file path in the src folder
String outputFilePath = "src/sortedData.txt"; // Output file path in the src folder
int dataSize = 1000; // Number of random integers to generate if file doesn't exist
int targetValue = 500; // Value to search for in both unsorted and sorted data
try {
File inputFile = new File(inputFilePath);
long startTime, endTime;
// Step 1: Check if the input file exists in the src folder
if (!inputFile.exists()) {
System.out.println("Input file not found in src folder. Generating random data...");
// Generate random data
int[] randomData = generateRandomData(dataSize);
// Write random data to src/inputData.txt
externalData.writeDataToFile(randomData, inputFilePath);
System.out.println("Random data written to: " + inputFilePath);
}
// Step 2: Measure the time to read data from the file
System.out.println("Reading data from file...");
startTime = System.nanoTime();
int[] data = externalData.readDataFromFile(inputFilePath);
endTime = System.nanoTime();
System.out.println("Time taken to read data: " + (endTime - startTime)
+ " ns");
// Step 3: Measure the time for external search on the unsorted list
System.out.println("Searching for Product ID " + targetValue + " in external memory (Unsorted):");
startTime = System.nanoTime();
int result = externalData.externalSearch(inputFilePath, targetValue);
endTime = System.nanoTime();
System.out.println("Time taken for search (Unsorted): " + (endTime -
startTime) + " ns");
if (result != -1) {
System.out.println("Product found at index: " + result);
} else {
System.out.println("Product not found.");
}
// Step 4: Measure the time to sort the data
System.out.println("Sorting the data...");
startTime = System.nanoTime();
Arrays.sort(data); // Use Java's built-in sorting (you can replace with other sorting algorithms if needed)
endTime = System.nanoTime();
System.out.println("Time taken to sort data: " + (endTime - startTime)
+ " ns");
// Step 5: Measure the time to write sorted data to the file
System.out.println("Writing sorted data to file...");
startTime = System.nanoTime();
externalData.writeDataToFile(data, outputFilePath);
endTime = System.nanoTime();
System.out.println("Time taken to write sorted data: " + (endTime -
startTime) + " ns");
System.out.println("Data successfully written to: " + outputFilePath);
// Step 6: Measure the time to read the sorted data back from the file
System.out.println("Loading sorted data from file...");
startTime = System.nanoTime();
endTime = System.nanoTime();
System.out.println("Time taken to load sorted data: " + (endTime -
startTime) + " ns");
// Step 7: Measure the time for external search on the sorted list
System.out.println("Searching for Product ID " + targetValue + " in external memory (Sorted):");
startTime = System.nanoTime();
result = externalData.externalSearch(outputFilePath, targetValue);
endTime = System.nanoTime();
System.out.println("Time taken for search (Sorted): " + (endTime -
startTime) + " ns");
if (result != -1) {
System.out.println("Product found at index: " + result);
} else {
System.out.println("Product not found.");
}
} catch (IOException e) {
System.err.println("An error occurred during file I/O: " +
e.getMessage());
}
}
// Helper method to generate random data
private static int[] generateRandomData(int size) {
Random random = new Random();
int[] randomData = new int[size];
for (int i = 0; i < size; i++) {
randomData[i] = random.nextInt(1000) + 1; // Random integers between 1 and 1000
}
return randomData;
}
}