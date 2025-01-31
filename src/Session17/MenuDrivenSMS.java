package Session17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A menu-driven student management system.
 */
public class MenuDrivenSMS {
    private static final String FILE_NAME = "students.csv";
    private static List<Student> students = new ArrayList<>();

    /**
     * The main method to run the student management system.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        students = Utility.loadStudentsFromFile(FILE_NAME);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("Students count: " + students.size());
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Edit student");
            System.out.println("4. Delete Student");
            System.out.println("0. Save and Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            MenuOperation operation = null;
            switch (choice) {
                case 1:
                    operation = new AddStudentOperation();
                    break;
                case 2:
                    operation = new ViewStudentsOperation();
                    break;
                case 3:
                    operation = new EditStudentOperation();
                    break;
                case 4:
                    operation = new DeleteStudentOperation();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    Utility.saveStudentsToFile(students, FILE_NAME);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (operation != null) {
                operation.execute(scanner, students);
            }
        }
    }
}