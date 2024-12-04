**MaxHeap**

```markdown
# MaxHeap - Project Management

## Overview

This project implements a Max-Heap (`MaxHeap`) data structure to efficiently manage prioritized project records for TechCorp's Integrated Data Management System (IDMS). The Max-Heap ensures that the highest-priority project is always at the root, enabling quick access and removal of the maximum value.

## Scenario

You are a software engineer at TechCorp, working on their IDMS. The IDMS handles data for multiple divisions, including retail, education, and healthcare. To optimize project management, your team has decided to use a Max-Heap to prioritize high-impact projects.

## Objectives

* Implement a Max-Heap to maintain prioritized project records.
* Support operations such as:
    * Adding new projects
    * Extracting the highest-priority project
    * Searching for specific projects
    * Counting the total number of projects
    * Printing the current list of projects
* Ensure the `MaxHeap` class is efficient and robust, as it will be used by other components in the system.

## Usage

The `MaxHeap` class can be used as follows:

```java
// Create a MaxHeap with a capacity of 10
MaxHeap heap = new MaxHeap(10);

// Insert projects
heap.insert("Project Alpha", 90, 101);
heap.insert("Project Beta", 85, 102);

// Extract the highest-priority project
MaxHeap.Project maxProject = heap.extractMax();

// Search for a project
MaxHeap.Project project = heap.search("Project Alpha");

// Count projects
int count = heap.countProjects();

// Print projects
heap.printProjects();

## Author

Youssef Al Mukdad
