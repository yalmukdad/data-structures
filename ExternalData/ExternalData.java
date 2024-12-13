package Youssef_AlMukdad;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExternalData {

    // Method to read data from an external file (e.g., simulating external memory)
    public int[] readDataFromFile(String filePath) throws IOException {
        // 1. Open the file at the given filePath.
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // 3. Create an array to store the integers from the file.
        int[] data = new int[100000]; // Assuming a maximum of 100,000 integers
        int i = 0;

        // 4. Read the integers from the file one by one and store them in the array.
        while (scanner.hasNextInt()) {
            data[i++] = scanner.nextInt();
        }

        // 5. Close the file after reading the data.
        scanner.close();

        // 6. Return the array with the data.
        return data;
    }

    // Method to write data to an external file
    public void writeDataToFile(int[] data, String filePath) throws IOException {
        // 1. Open the file at the given filePath in write mode.
        PrintWriter writer = new PrintWriter(filePath);

        // 2. Write the data from the integer array to the file.
        for (int value : data) {
            writer.println(value);
        }

        // 3. Close the file after writing the data.
        writer.close();
    }

    // External Search Algorithm (search through an external file)
    public int externalSearch(String filePath, int target) throws IOException {
        // 1. Open the file and create a Scanner object to read the data.
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // 2. Initialize a variable to keep track of the index (position in the file).
        int index = 0;

        // 3. Start reading the data from the file in chunks or line by line.
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            // 4. For each number read, compare it with the target.
            if (value == target) {
                // 5. If the target is found, close the scanner and return its position (index).
                scanner.close();
                return index;
            }

            // 6. Increment the index to move to the next position in the file.
            index++;
        }

        // 7. If the target is not found after reading all the data, close the scanner and return -1.
        scanner.close();
        return -1;
    }
}
