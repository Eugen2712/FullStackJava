package Session17;

import java.util.List;
import java.util.Scanner;

public class EditStudentOperation implements MenuOperation {

    @Override
    public void execute(Scanner scanner, List<Student> students) {
        System.out.print("Enter student ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student studentToEdit = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToEdit = student;
                break;
            }
        }

        if (studentToEdit == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter new first name (leave blank to keep current): ");
        String firstName = scanner.nextLine();
        if (!firstName.isEmpty()) {
            studentToEdit.setFirstName(firstName);
        }

        System.out.print("Enter new last name (leave blank to keep current): ");
        String lastName = scanner.nextLine();
        if (!lastName.isEmpty()) {
            studentToEdit.setLastName(lastName);
        }

        System.out.print("Enter new age (leave blank to keep current): ");
        String ageStr = scanner.nextLine();
        if (!ageStr.isEmpty()) {
            int age = Integer.parseInt(ageStr);
            studentToEdit.setAge(age);
        }

        System.out.print("Enter new major (leave blank to keep current): ");
        String majorStr = scanner.nextLine();
        if (!majorStr.isEmpty()) {
            Major major = Major.valueOf(majorStr.toUpperCase());
            studentToEdit.major = major;
        }

        System.out.print("Enter new email (leave blank to keep current): ");
        String email = scanner.nextLine();
        if (!lastName.isEmpty()) {
            try {
                studentToEdit.setEmail(email);
            } catch (IllegalEmailException e) {
                System.out.println("Invalid email: " + e.getMessage());
                return;
            }
        }

        if (studentToEdit instanceof GraduateStudent) {
            System.out.print("Enter new GPA (leave blank to keep current): ");
            String gpaStr = scanner.nextLine();
            if (!gpaStr.isEmpty()) {
                double gpa = Double.parseDouble(gpaStr);
                try {
                    ((GraduateStudent) studentToEdit).setGPA(gpa);
                } catch (IllegalGpaException e) {
                    System.out.println("Invalid GPA: " + e.getMessage());
                }
            }
        }

        System.out.println("Student details updated successfully.");
    }
}
