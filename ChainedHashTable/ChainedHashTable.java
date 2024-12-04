package Youssef_AlMukdad;

//NAME: YourFirstName YourLastName

import java.util.LinkedList;

//Class to manage employee performance records using a Chained Hash Table
class ChainedHashTable {
 private LinkedList<Entry>[] table; // Array of LinkedLists for chaining
 private int size; // Number of entries in the hash table

 // Inner class to store employee entries (name and performance grade)
 class Entry {
     String employeeName;
     int performanceGrade;

     Entry(String employeeName, int performanceGrade) {
         this.employeeName = employeeName;
         this.performanceGrade = performanceGrade;
     }
 }

 // Constructor: Initialize the hash table with the specified capacity
 @SuppressWarnings("unchecked")
 public ChainedHashTable(int capacity) {
     table = new LinkedList[capacity];
     size = 0;
     for (int i = 0; i < capacity; i++) {
         table[i] = new LinkedList<>();
     }
 }

 // Hash function to compute the index based on the employee name
 private int hash(String employeeName) {
     return Math.abs(employeeName.hashCode()) % table.length;
 }

 // Method to add or update an employee's performance grade
 public void add(String employeeName, int performanceGrade) {
     int index = hash(employeeName);
     for (Entry entry : table[index]) {
         if (entry.employeeName.equals(employeeName)) {
             entry.performanceGrade = performanceGrade; // Update if exists
             return;
         }
     }
     table[index].add(new Entry(employeeName, performanceGrade)); // Add new employee
     size++;
 }

 // Method to search for an employee's performance grade
 public Integer search(String employeeName) {
     int index = hash(employeeName);
     for (Entry entry : table[index]) {
         if (entry.employeeName.equals(employeeName)) {
             return entry.performanceGrade;
         }
     }
     return null; // Employee not found
 }

 // Method to remove an employee record
 public boolean remove(String employeeName) {
     int index = hash(employeeName);
     var iterator = table[index].iterator();
     while (iterator.hasNext()) {
         Entry entry = iterator.next();
         if (entry.employeeName.equals(employeeName)) {
             iterator.remove();
             size--;
             return true;
         }
     }
     return false; // Employee not found
 }

 // Method to count the total number of employees in the hash table
 public int countEmployees() {
     // Pseudocode:
     // SET totalCount to 0

     // FOR each bucket in the table:
         // ADD the size of the current bucket to totalCount

     // RETURN totalCount
     int totalCount = 0;
     for (LinkedList<Entry> bucket : table) {
         totalCount += bucket.size();
     }
     return totalCount;
 }
 
 // Method to check if a specific employee exists in the hash table
 public boolean contains(String employeeName) {
     // Pseudocode:
     // CALL search(employeeName)
     // IF result is not null:
         // RETURN true  // Employee exists
     // ELSE:
         // RETURN false  // Employee does not exist
     return search(employeeName) != null;
 }

 // Method to print the current list of employees in the hash table
 public void printList() {
     // Pseudocode:
     // PRINT "ChainedHashTable contents:"

     // FOR each bucket in the table:
         // FOR each entry in the bucket:
             // PRINT entry.employeeName
     // PRINT a new line
     System.out.println("ChainedHashTable contents:");
     for (LinkedList<Entry> bucket : table) {
         for (Entry entry : bucket) {
             System.out.print(entry.employeeName + " ");
         }
     }
     System.out.println();
 }
}