package Youssef_AlMukdad;


public class SkipList<T extends Comparable<T>> {

    private class Node {
        T value;
        Node[] next;

        @SuppressWarnings("unchecked")
        Node(T value, int levels) {
            this.value = value;
            // Creating a generic array for next pointers
            this.next = (Node[]) new SkipList<?>.Node[levels];
        }
    }

    private static final double PROBABILITY = 0.5;
    private Node head;
    private int maxLevel;

    public SkipList() {
        // Initialize head with one level
        head = new Node(null, 1);
        maxLevel = 1;
    }

    public void add(T value) {
        // Pseudocode:
        // 1. Initialize update array to store the last node at each level before the insertion point.
        // 2. Start from the highest level and move forward until the correct insertion point is found.
        // 3. If the new node’s level is higher than maxLevel, adjust head and update array.
        // 4. Insert the new node by updating the next pointers in the affected levels.
        Node[] update =  (Node[]) new SkipList<?>.Node[maxLevel];
        Node current = head;
        for (int i = maxLevel - 1; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value.compareTo(value) < 0) {
                current = current.next[i];
            }
            update[i] = current;
        }

        int level = randomLevel();
        if (level > maxLevel) {
            ensureHeadLevel(level);
            Node[] newUpdate =  (Node[]) new SkipList<?>.Node[level];
            System.arraycopy(update, 0, newUpdate, 0, maxLevel);
            for (int i = maxLevel; i < level; i++) {
                newUpdate[i] = head;
            }
            update = newUpdate;
            maxLevel = level;
        }

        Node newNode = new Node(value, level);
        for (int i = 0; i < level; i++) {
            newNode.next[i] = update[i].next[i];
            update[i].next[i] = newNode;
        }

        System.out.println("After adding " + value + ": head.next[0] = " + (head.next[0] != null ? head.next[0].value : "null"));
    }

    public boolean remove(T value) {
        // Pseudocode:
        // 1. Initialize update array to store the last node at each level before the node to be removed.
        // 2. Traverse the skiplist to find the node to remove.
        // 3. If the node is found, update pointers to bypass the node.
        // 4. Adjust maxLevel if necessary by reducing it when upper levels become empty.
        Node[] update =  (Node[]) new SkipList<?>.Node[maxLevel];
        Node current = head;
        for (int i = maxLevel - 1; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value.compareTo(value) < 0) {
                current = current.next[i];
            }
            update[i] = current;
        }

        current = current.next[0];
        if (current != null && current.value.compareTo(value) == 0) {
            for (int i = 0; i < maxLevel; i++) {
                if (update[i].next[i] != current) break;
                update[i].next[i] = current.next[i];
            }

            while (maxLevel > 1 && head.next[maxLevel - 1] == null) {
                maxLevel--;
            }

            System.out.println("After removing " + value + ": head.next[0] = " + (head.next[0] != null ? head.next[0].value : "null"));
            return true;
        }

        System.out.println("Value " + value + " not found for removal.");
        return false;
    }

    public T find(T value) {
        // Pseudocode:
        // 1. Start from the highest level and move forward.
        // 2. Drop down to the next lower level if moving forward isn’t possible.
        // 3. Repeat until the bottom level is reached.
        // 4. Check if the current node is the one being searched for.
        Node current = head;

        for (int i = maxLevel - 1; i >= 0; i--) {
            while (current.next[i] != null && current.next[i].value.compareTo(value) < 0) {
                current = current.next[i];
            }
        }

        current = current.next[0];
        if (current != null && current.value.compareTo(value) == 0) {
            return current.value;
        }
        return null;
    }

    public int size() {
        // Pseudocode:
        // 1. Start from the first node at the bottom level.
        // 2. Traverse the list and count each node.
        // 3. Return the total count.

        Node current = head.next[0];
        int count = 0;
        while (current != null) {
            count++;
            current = current.next[0];
        }

        return count;
    }

    public boolean contains(T value) {
        // Pseudocode:
        // 1. Use the find method to check if the value exists.
        return find(value) != null;
    }

    public void printList() {
        // Pseudocode:
        // 1. Start from the first node at the bottom level.
        // 2. Traverse and print the value of each node.
        Node current = head.next[0];
        System.out.print("SkipList contents:");
        while (current != null) {
            System.out.print(" " + current.value);
            current = current.next[0];
        }
        System.out.println();
    }

    private int randomLevel() {
        // Pseudocode:
        // 1. Start with level 1.
        // 2. Increment the level while the random condition is met.
        // 3. Return the generated level.

        int level = 1;
        while (Math.random() < PROBABILITY) {
            level++;
        }
        return level;
    }

    private void ensureHeadLevel(int level) {
        // Pseudocode:
        // 1. If the new level is greater than the head’s current levels, create a new head node.
        // 2. Copy existing level pointers to the new head.
        // 3. Update the head to the new node.
        if (level > head.next.length) {
            Node newHead = new Node(null, level);
            System.arraycopy(head.next, 0, newHead.next, 0, head.next.length);
            head = newHead;
        }
    }
}