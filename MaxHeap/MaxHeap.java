package Youssef_AlMukdad;

import java.util.ArrayList;
import java.util.Collections;

class MaxHeap {
    private Project[] heap;
    private int size;

    // Inner class to store project details (name, priority, ID)
    class Project implements Comparable<Project> {
        String projectName;
        int priority;
        int projectId;

        Project(String projectName, int priority, int projectId) {
            this.projectName = projectName;
            this.priority = priority;
            this.projectId = projectId;
        }

        @Override
        public int compareTo(Project other) {
            return Integer.compare(other.priority, this.priority); // Higher priority comes first
        }

        @Override
        public String toString() {
            return projectName + " (Priority: " + priority + ", ID: " + projectId + ")";
        }
    }

    // Constructor: Initialize the heap with the specified capacity
    public MaxHeap(int capacity) {
        heap = new Project[capacity];
        size = 0;
    }

    // Method to insert a new project into the heap
    public void insert(String projectName, int priority, int projectId) {
        if (size == heap.length) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }
        heap[size] = new Project(projectName, priority, projectId);
        size++;
        heapifyUp(size - 1);
    }

    // Method to extract the highest-priority project
    public Project extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot extract.");
            return null;
        }
        Project maxProject = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return maxProject;
    }

    // Heapify up method to maintain max-heap property
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index].priority > heap[parentIndex].priority) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Heapify down method to maintain max-heap property
    private void heapifyDown(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild].priority > heap[largest].priority) {
            largest = leftChild;
        }

        if (rightChild < size && heap[rightChild].priority > heap[largest].priority) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    // Method to search for a project by name
    public Project search(String projectName) {
        for (int i = 0; i < size; i++) {
            if (heap[i].projectName.equals(projectName)) {
                return heap[i];
            }
        }
        return null;
    }

    // Method to count the total number of projects
    public int countProjects() {
        return size;
    }

    // Method to print the current list of projects in descending order of priority
    public void printProjects() {
        System.out.println("Projects in the system:");
        ArrayList<Project> sortedProjects = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            sortedProjects.add(heap[i]);
        }
        Collections.sort(sortedProjects); // Sorts in descending order due to compareTo implementation
        for (Project project : sortedProjects) {
            System.out.println(project);
        }
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        Project temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}