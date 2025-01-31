package Session17;

import java.util.List;
import java.util.Scanner;

public class ViewStudentsOperation implements MenuOperation {

    @Override
    public void execute(Scanner scanner, List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("View students by:");
        System.out.println("1. Name");
        System.out.println("2. Major");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                students.sort(new StudentNameComparator());
                break;
            case 2:
                students.sort(new StudentMajorComparator());
                break;
            default:
                System.out.println("Invalid choice. Displaying unsorted list.");
        }

        // Print table header
        System.out.format("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+-------------------------+%n");
        System.out.format("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Type", "ID", "First Name", "Last Name", "Age", "Major", "Email", "GPA");
        System.out.format("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+-------------------------+%n");

        // Print each student
        for (Student student : students) {
            student.print();
        }
    }
}