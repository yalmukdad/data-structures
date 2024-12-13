package Youssef_AlMukdad;

import java.io.*;
import java.util.TreeMap;

public class CSVIndexManager {

    private static final String CSV_FILE_PATH = "Products.csv";
    private static final String INDEX_FILE_PATH = "Products.idx";

    private TreeMap<String, Long> indexMap;

    public void generateIndex() {
        long startTime = System.currentTimeMillis(); // Start time for metrics

        try (RandomAccessFile csvFile = new RandomAccessFile(CSV_FILE_PATH, "r")) {
            indexMap = new TreeMap<>();
            String line;
            long byteOffset = 0;

            while ((line = csvFile.readLine()) != null) {
                String primaryKey = line.split(",")[0];
                indexMap.put(primaryKey, byteOffset);
                byteOffset = csvFile.getFilePointer();
            }

            try (ObjectOutputStream indexFile = new ObjectOutputStream(new FileOutputStream(INDEX_FILE_PATH))) {
                indexFile.writeObject(indexMap);
            } catch (IOException e) {
                System.err.println("Error saving index: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis(); // End time for metrics
        System.out.println("Index generated and saved successfully in " + (endTime - startTime) + " ms.");
    }

    public void loadIndex() {
        long startTime = System.currentTimeMillis(); // Start time for metrics

        try (ObjectInputStream indexFile = new ObjectInputStream(new FileInputStream(INDEX_FILE_PATH))) {
            indexMap = (TreeMap<String, Long>) indexFile.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading index: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis(); // End time for metrics
        System.out.println("Index loaded successfully in " + (endTime - startTime) + " ms.");
    }

    public void performLinearSearch(String key) {
        long startTime = System.currentTimeMillis(); // Start time for metrics
        System.out.println("\nPerforming Linear Search...");

        int iterations = 0;
        boolean found = false;

        try (RandomAccessFile csvFile = new RandomAccessFile(CSV_FILE_PATH, "r")) {
            String line;

            while ((line = csvFile.readLine()) != null) {
                iterations++;
                if (line.split(",")[0].equals(key)) {
                    System.out.println("Record found: " + line);
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Record not found.");
        }

        long endTime = System.currentTimeMillis(); // End time for metrics
        System.out.println("Linear Search Iterations: " + iterations);
        System.out.println("Linear Search Time: " + (endTime - startTime) + " ms.");
    }

    public void performMapSearch(String key) {
        long startTime = System.currentTimeMillis(); // Start time for metrics
        System.out.println("\nPerforming Map-Based Search...");

        if (indexMap == null) {
            System.out.println("Index not loaded. Please load the index first.");
            return;
        }

        int iterations = 1;

        if (indexMap.containsKey(key)) {
            try (RandomAccessFile csvFile = new RandomAccessFile(CSV_FILE_PATH, "r")) {
                csvFile.seek(indexMap.get(key));
                String record = csvFile.readLine();
                System.out.println("Record found: " + record);
            } catch (IOException e) {
                System.err.println("Error accessing CSV file: " + e.getMessage());
            }
        } else {
            System.out.println("Record not found.");
        }

        long endTime = System.currentTimeMillis(); // End time for metrics
        System.out.println("Map-Based Search Iterations: " + iterations);
        System.out.println("Map-Based Search Time: " + (endTime - startTime) + " ms.");
    }

    public static void main(String[] args) {
        CSVIndexManager indexManager = new CSVIndexManager();

        // Generate and save the index
        indexManager.generateIndex();

        // Load the index from the file
        indexManager.loadIndex();

        // Perform searches
        indexManager.performLinearSearch("10004"); // Search for an existing product ID
        indexManager.performMapSearch("10004"); // Search for the same product ID using the index

        indexManager.performLinearSearch("10000"); // Search for a non-existing product ID
        indexManager.performMapSearch("10000"); // Search for the same non-existing product ID using the index
    }
}