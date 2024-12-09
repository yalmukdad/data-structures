package Youssef_AlMukdad;

public class ComparativeSort {

    // Method to perform Bubble Sort
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Selection Sort
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Method to perform Merge Sort
    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int[arr.length - mid];

            // Populate leftHalf and rightHalf arrays
            for (int i = 0; i < mid; i++) {
                leftHalf[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                rightHalf[i - mid] = arr[i];
            }

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(arr, leftHalf, rightHalf);
        }
    }

    // Method to merge two sorted arrays (used in Merge Sort)
    private void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k++] = leftHalf[i++];
            } else {
                arr[k++] = rightHalf[j++];
            }
        }
        while (i < leftHalf.length) {
            arr[k++] = leftHalf[i++];
        }
        while (j < rightHalf.length) {
            arr[k++] = rightHalf[j++];
        }
    }

    // Helper method to swap two elements in an array (used in Bubble Sort and
    // Selection Sort)
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}