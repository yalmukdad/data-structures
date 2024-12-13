package Youssef_AlMukdad;

public class SearchAlgorithms {

    // Linear Search Implementation
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    // Binary Search Implementation (requires a sorted array)
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent potential overflow

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            } else if (target < arr[mid]) {
                high = mid - 1; // Adjust high pointer
            } else {
                low = mid + 1; // Adjust low pointer
            }
        }

        return -1; // Target not found
    }

    // Helper method to perform binary search recursively
    public int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: target not found
        }

        int mid = low + (high - low) / 2; // Prevent potential overflow

        if (arr[mid] == target) {
            return mid; // Target found at index mid
        } else if (target < arr[mid]) {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search left half
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search right half
        }
    }
}
