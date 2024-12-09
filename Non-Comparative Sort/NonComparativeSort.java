package Youssef_AlMukdad;

public class NonComparativeSort {

    // Method to perform Counting Sort
    public void countingSort(int[] arr) {
        int max = findMax(arr); // Find the maximum value in the array
        int[] count = new int[max + 1]; // Create a count array

        // Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Calculate cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[arr.length]; // Create a result array

        // Build the sorted result array
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    // Method to perform Radix Sort
    public void radixSort(int[] arr) {
        int max = findMax(arr); // Find the maximum value

        // Perform counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortForRadix(arr, exp);
        }
    }

    // Helper method to get the maximum value in the array
    private int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Helper method to perform Counting Sort based on a specific digit
    private void countingSortForRadix(int[] arr, int exp) {
        int[] count = new int[10]; // Count array of size 10 (for digits 0-9)
        int[] result = new int[arr.length];

        // Count occurrences of each digit at the current place value
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        // Calculate cumulative counts
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted result array based on the current digit
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }
}