package Youssef_AlMukdad;

import java.util.Arrays;

public class FastTries {

    private int[] keys;
    private int[] values;
    private int size;

    public FastTries() {
        keys = new int[10];
        values = new int[10];
        size = 0;
    }

    public void insert(int key, int value) {
        if (size == keys.length) {
            resize();
        }

        int index = Arrays.binarySearch(keys, 0, size, key);

        if (index >= 0) {
            values[index] = value;
        } else {
            index = -index - 1;

            System.arraycopy(keys, index, keys, index + 1, size - index);
            System.arraycopy(values, index, values, index + 1, size - index);

            keys[index] = key;
            values[index] = value;

            size++;
        }
    }

    public int find(int key) {
        int index = Arrays.binarySearch(keys, 0, size, key);
        if (index >= 0) {
            return values[index];
        } else {
            return -1;
        }
    }

    public void delete(int key) {
        int index = Arrays.binarySearch(keys, 0, size, key);
        if (index >= 0) {
            System.arraycopy(keys, index + 1, keys, index, size - index - 1);
            System.arraycopy(values, index + 1, values, index, size - index - 1);
            size--;
        }
    }

    private void resize() {
        keys = Arrays.copyOf(keys, keys.length * 2);
        values = Arrays.copyOf(values, values.length * 2);
    }

    public void printTrie() {
        System.out.println("Keys: " + Arrays.toString(Arrays.copyOf(keys, size)));
        System.out.println("Values: " + Arrays.toString(Arrays.copyOf(values, size)));
    }

    public static void main(String[] args) {
        FastTries trie = new FastTries();

        // Insertion
        trie.insert(101, 50);
        trie.insert(202, 20);
        trie.insert(303, 30);
        trie.insert(404, 40);

        // Finding
        System.out.println("Product ID 101: Stock Quantity = " + trie.find(101));
        System.out.println("Product ID 202: Stock Quantity = " + trie.find(202));
        System.out.println("Product ID 999: Stock Quantity = " + trie.find(999));

        // Deletion
        trie.delete(202);
        System.out.println("Product ID 202: Stock Quantity = " + trie.find(202));

        // Insertion after deletion
        trie.insert(505, 60);

        // Verification
        System.out.println("Product ID 101: Stock Quantity = " + trie.find(101));
        System.out.println("Product ID 303: Stock Quantity = " + trie.find(303));
        System.out.println("Product ID 404: Stock Quantity = " + trie.find(404));
        System.out.println("Product ID 505: Stock Quantity = " + trie.find(505));
    }
}
