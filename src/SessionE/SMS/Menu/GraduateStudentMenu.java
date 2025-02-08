package SessionE.SMS.Menu;

import SessionE.SMS.GraduateStudent;
import SessionE.SMS.GraduateStudentProcessor;
import SessionE.SMS.StudentService;

import java.util.Scanner;
public class GraduateStudentMenu {
    private StudentService studentService;
    private Scanner scanner;
    private GraduateStudentProcessor graduateStudentProcessor;

    public GraduateStudentMenu(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = scanner;
        this.graduateStudentProcessor = new GraduateStudentProcessor(studentService);
    }

    public void execute() {
        System.out.printf("Enter student ID to graduate: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        try {
            GraduateStudent graduateStudent = graduateStudentProcessor.graduateStudent(id, gpa);
            System.out.println("Student graduated successfully: " + graduateStudent);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
