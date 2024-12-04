package Youssef_AlMukdad;

public class M03A6 {
    public static void main(String[] args) {
        SkipList<String> skipList = new SkipList<>();

        // Adding employees
        System.out.println("Adding employees: Alice, Bob, Charlie, Alice");
        skipList.add("Alice");
        skipList.add("Bob");
        skipList.add("Charlie");
        skipList.add("Alice");

        // Print the skiplist contents
        System.out.println("Printing the SkipList:");
        skipList.printList();

        // Display size of the skiplist
        System.out.println("Total unique employees: " + skipList.size());

        // Checking presence
        System.out.println("Checking presence:");
        System.out.println("Is 'Alice' in the list? " + skipList.contains("Alice"));
        System.out.println("Is 'David' in the list? " + skipList.contains("David"));

        // Finding an employee
        System.out.println("Finding 'Bob': " + (skipList.find("Bob") != null));

        // Removing an employee
        System.out.println("Removing 'Alice' from the list.");
        skipList.remove("Alice");

        // Print the skiplist contents after removal
        System.out.println("Printing the SkipList after removing 'Alice':");
        skipList.printList();

        // Display size after removal
        System.out.println("Total unique employees after removing 'Alice': " + skipList.size());

        // Checking presence after removal
        System.out.println("Is 'Alice' in the list? " + skipList.contains("Alice"));
        System.out.println("Is 'Bob' in the list? " + skipList.contains("Bob"));

        // Adding another employee
        System.out.println("Adding 'David'");
        skipList.add("David");

        // Print the skiplist contents after adding 'David'
        System.out.println("Printing the SkipList after adding 'David':");
        skipList.printList();

        // Removing another employee
        System.out.println("Removing 'Bob'");
        skipList.remove("Bob");

        // Final check of unique count and presence
        System.out.println("Final unique employees count: " + skipList.size());
        System.out.println("Final presence checks:");
        System.out.println("Is 'Charlie' in the list? " + skipList.contains("Charlie"));
        System.out.println("Is 'David' in the list? " + skipList.contains("David"));

        // Print the final skiplist contents
        System.out.println("Printing the final SkipList:");
        skipList.printList();
    }
}
