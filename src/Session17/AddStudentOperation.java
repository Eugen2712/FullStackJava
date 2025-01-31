package Session17;

import java.util.List;
import java.util.Scanner;

public class AddStudentOperation implements MenuOperation {

    @Override
    public void execute(Scanner scanner, List<Student> students) {
        System.out.print("Enter student type (1 for Undergraduate, 2 for Graduate): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        Student student = null;
        if (type == 1) {
            student = new UndergradStudent("", "", 0, Major.ART, "");
        } else if (type == 2) {
            student = new GraduateStudent("", "", 0, Major.ART, "");
        } else {
            System.out.println("Invalid student type.");
            return;
        }

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        try {
            student.setFirstName(firstName);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid age: " + e.getMessage());
            return;
        }

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        try {
            student.setLastName(lastName);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid age: " + e.getMessage());
            return;
        }

        System.out.print("Enter major (ART, ECONOMICS, MATH): ");
        String majorStr = scanner.nextLine();

        try {
            Major major = Major.valueOf(majorStr.toUpperCase());
            student.setMajor(major);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Major: " + e.getMessage());
            return;
        }

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        try {
            student.setAge(age);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid age: " + e.getMessage());
            return;
        }
        scanner.nextLine();

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
            } catch (IllegalGpaException e) {
                System.out.println("Invalid GPA: " + e.getMessage());
                return;
            }
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }
}
