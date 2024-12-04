package Youssef_AlMukdad;

import Youssef_AlMukdad.StudentNode;

class StudentNode {
    String name;
    StudentNode next;  // Reference to the next student

    // Constructor to create a new student node
    StudentNode(String name) {
        this.name = name;
        this.next = null;
    }
}

public class StudentManager {
    protected StudentNode head;  // Start of the student list

    // Constructor to initialize the list
    public StudentManager() {
        this.head = null;  // The list is initially empty
    }

    // Method to print all students (already implemented)
    public void printStudents() {
        StudentNode current = head;  // Start at the head
        while (current != null) {
            System.out.println(current.name);  // Print the student's name
            current = current.next;  // Move to the next student
        }
    }

    // Method to add a student to the list
    // 1. Create a new student node with the given name.
    // 2. If the list is empty (head is null), make this new node the head of the list.
    // 3. If the list is not empty, find the last student in the list and add the new student there.
    public void addStudent(String name) {
        // Step 1: Create a new node for the student
        StudentNode newNode = new StudentNode(name);

        // Step 2: If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Step 3: Traverse the list to find the last node
            StudentNode current = head;
            while (current.next != null) {
                current = current.next;  // Move to the next student
            }
            // Add the new node at the end of the list
            current.next = newNode;
        }
    }

    // Method to remove a student from the list
    // 1. Check if the list is empty. If yes, return false.
    // 2. If the student to be removed is the first student (head), update the head to point to the next student and return true.
    // 3. Traverse the list to find the student. If found, remove it by updating the previous student's next pointer.
    // 4. If the student is not found, return false.
    public boolean removeStudent(String name) {
        // Step 1: Check if the list is empty
        if (head == null) {
            return false;
        }

        // Step 2: If the student to remove is at the head
        if (head.name.equals(name)) {
            head = head.next;  // Move the head to the next student
            return true;
        }

        // Step 3: Traverse the list to find the student
        StudentNode current = head;
        StudentNode previous = null;
        while (current != null && !current.name.equals(name)) {
            previous = current;
            current = current.next;
        }

        // If student is found
        if (current != null) {
            previous.next = current.next;  // Remove the student by updating the next pointer
            return true;
        }

        // If the student is not found, return false
        return false;
    }

    // 1. Start at the first student (head).
    // 2. Traverse the list, checking each student's name.
    // 3. If a match is found, return true.
    // 4. If the end of the list is reached without finding the student, return false.
    public boolean isStudentRegistered(String name) {
        StudentNode current = head;  // Start at the head
        while (current != null) {
            if (current.name.equals(name)) {
                return true;  // Student found
            }
            current = current.next;  // Move to the next student
        }
        return false;  // Student not found
    }



    // 1. Start at the first student (head).
    // 2. Initialize a counter.
    // 3. Traverse the list, and each time you find the student with the given name, increment the counter.
    // 4. After traversing the list, return the count.
    public int countOccurrences(String name) {
        StudentNode current = head;  // Start at the head
        int count = 0;  // Initialize a counter

        while (current != null) {
            if (current.name.equals(name)) {
                count++; // Increment the count if the name matches
            }
            current = current.next;  // Move to the next student
        }

        return count;  // Return the final count
    }
}
