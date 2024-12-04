package Youssef_AlMukdad;

// Class Node: Represents each element in the linked list
class Node {
    String employeeName;  // Variable to store the employee's name
    Node next;  // Reference to the next node in the list

    // Constructor to initialize a new node
    Node(String employeeName) {
        this.employeeName = employeeName;
        this.next = null;
    }
}

// Class SList: Manages the singly linked list of employees
public class SList {
    private Node head;  // Variable to store the head of the list

    // Constructor to initialize an empty list
    public SList() {
        this.head = null;
    }

    // Method: Adds a new employee to the end of the list
    public void add(String employeeName) {
        Node newNode = new Node(employeeName);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method: Removes an employee by name
    public boolean remove(String employeeName) {
        if (head == null) { 
            return false; // List is empty
        }

        if (head.employeeName.equals(employeeName)) {
            head = head.next;
            return true;
        }

        Node current = head;
        Node previous = null; 
        while (current != null && !current.employeeName.equals(employeeName)) {
            previous = current;
            current = current.next;
        }

        if (current == null) { 
            return false; // Employee not found
        }

        previous.next = current.next; 
        return true;
    }

    // Method: Checks if an employee is in the list
    public boolean contains(String employeeName) {
        Node current = head;
        while (current != null) {
            if (current.employeeName.equals(employeeName)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method: Counts how many times an employee's name appears in the list
    public int countOccurrences(String employeeName) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.employeeName.equals(employeeName)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Prints all employees in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.employeeName + " ");
            current = current.next;
        }
        System.out.println(); 
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++; 
            current = current.next; 
        }
        return count;
    }
}