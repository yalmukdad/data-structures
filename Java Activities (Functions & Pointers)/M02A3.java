package Youssef_AlMukdad;


public class M02A3 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Add students to the list
        manager.addStudent("Alice");
        manager.addStudent("Bob");
        manager.addStudent("Alice");

        // Print the list of students
        System.out.println("List of registered students:");
        manager.printStudents();  // Should print Alice, Bob, Alice

        // Test if a student is registered
        System.out.println("Is Alice registered? " + manager.isStudentRegistered("Alice"));  // true
        System.out.println("Is David registered? " + manager.isStudentRegistered("David"));  // false

        // Remove a student
        manager.removeStudent("Bob");
        System.out.println("After removing Bob:");
        manager.printStudents();  // Should print Alice, Alice

        // Count occurrences of a student
        System.out.println("Occurrences of Alice: " + manager.countOccurrences("Alice"));  // 2
    }
}
