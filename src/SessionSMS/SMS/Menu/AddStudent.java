package SessionSMS.SMS.Menu;

import SessionSMS.SMS.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddStudent {
    private StudentService studentService;
    private Scanner scanner;

    public AddStudent(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Enter student type (1 for Undergraduate, 2 for Graduate): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        Student student = null;
        if (type == 1) {
            student = new UndergradStudent(studentService.getStudents().size() + 1, "", "", 0, Major.ART, "");
        } else if (type == 2) {
            student = new GraduateStudent(studentService.getStudents().size() + 1, "", "", 0, Major.ART, "");
        } else {
            System.out.println("Invalid student type.");
            return;
        }

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        student.setFirstName(firstName);

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        student.setLastName(lastName);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        try {
            student.setAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age: " + e.getMessage());
            return;
        }
        scanner.nextLine();

        System.out.print("Enter major (ART, ECONOMICS, MATH): ");
        String majorStr = scanner.nextLine();
        try {
            Major major = Major.valueOf(majorStr.toUpperCase());
            student.setMajor(major);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid major: " + e.getMessage());
            return;
        }

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        try {
            student.setEmail(email);
        } catch (IllegalEmailException e) {
            System.out.println("Invalid email: " + e.getMessage());
            return;
        }

        if (student instanceof GraduateStudent) {
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            try {
                ((GraduateStudent) student).setGPA(gpa);
            } catch (IllegalGpaException | InputMismatchException e) {
                System.out.println("Invalid GPA: " + e.getMessage());
                return;
            }
        }
        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }
}