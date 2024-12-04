package Youssef_AlMukdad;

public class M04A8 {
    public static void main(String[] args) {
        System.out.println("==== TechCorp Max-Heap - Project Management ====");
        
        // Step 1: Create a MaxHeap with a capacity of 10
        System.out.println("\nStep 1: Initializing the Max-Heap with a capacity of 10...");
        MaxHeap projectHeap = new MaxHeap(10);

        // Step 2: Insert projects into the heap
        System.out.println("\nStep 2: Inserting projects into the system...");
        projectHeap.insert("Project Alpha", 90, 101);
        projectHeap.insert("Project Beta", 85, 102);
        projectHeap.insert("Project Gamma", 92, 103);
        projectHeap.insert("Project Delta", 80, 104);
        projectHeap.insert("Project Epsilon", 87, 105);
        
        // Confirm the projects were added successfully
        System.out.println("\nProjects added successfully!");
        projectHeap.printProjects();

        // Step 3: Print all projects
        System.out.println("\nStep 3: Displaying current projects in the system (sorted by priority):");
        projectHeap.printProjects();

        // Step 4: Extract the highest-priority project
        System.out.println("\nStep 4: Extracting the highest-priority project...");
        MaxHeap.Project maxProject = projectHeap.extractMax();
        if (maxProject != null) {
            System.out.println("Extracted Project: " + maxProject.projectName + " with priority " + maxProject.priority);
        } else {
            System.out.println("No project found to extract.");
        }

        // Display the projects after extraction
        System.out.println("\nRemaining projects after extracting the highest-priority project:");
        projectHeap.printProjects();

        // Step 5: Count the total number of projects in the system
        System.out.println("\nStep 5: Counting the total number of projects...");
        int totalProjects = projectHeap.countProjects();
        System.out.println("Total projects currently in the system: " + totalProjects);

        // Step 6: Search for specific projects
        System.out.println("\nStep 6: Searching for specific projects...");

        // Case 1: Search for an existing project
        String searchName = "Project Beta";
        System.out.println("Searching for '" + searchName + "'...");
        MaxHeap.Project searchResult = projectHeap.search(searchName);
        if (searchResult != null) {
            System.out.println("Found Project: " + searchResult.projectName + " with priority " + searchResult.priority);
        } else {
            System.out.println("Project '" + searchName + "' not found.");
        }

        // Case 2: Search for a non-existent project
        searchName = "Project Omega";
        System.out.println("\nSearching for non-existent project '" + searchName + "'...");
        searchResult = projectHeap.search(searchName);
        if (searchResult != null) {
            System.out.println("Found Project: " + searchResult.projectName + " with priority " + searchResult.priority);
        } else {
            System.out.println("Project '" + searchName + "' not found.");
        }

        // Step 7: Extract projects until the heap is empty
        System.out.println("\nStep 7: Extracting all remaining projects to empty the heap:");
        while (projectHeap.countProjects() > 0) {
            maxProject = projectHeap.extractMax();
            System.out.println("Extracted: " + maxProject.projectName + " with priority " + maxProject.priority);
        }

        // Confirm the heap is empty
        System.out.println("\nFinal count of projects: " + projectHeap.countProjects());
        if (projectHeap.countProjects() == 0) {
            System.out.println("All projects have been extracted. The heap is now empty.");
        } else {
            System.out.println("There are still projects left in the heap.");
        }

        // Attempting to extract from an empty heap
        System.out.println("\nStep 8: Attempting to extract from an empty heap...");
        maxProject = projectHeap.extractMax();
        if (maxProject == null) {
            System.out.println("No projects left to extract. The heap is empty.");
        }

        System.out.println("\n==== End of Test ====");
    }
}
