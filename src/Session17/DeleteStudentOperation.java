package Session17;

import java.util.List;
import java.util.Scanner;

public class DeleteStudentOperation implements MenuOperation {

    @Override
    public void execute(Scanner scanner, List<Student> students) {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}