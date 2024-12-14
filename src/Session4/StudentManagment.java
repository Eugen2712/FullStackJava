package Session4;

import java.util.Scanner;
import java.util.HashSet;

class StudentManagment {

    static class Student {
        int studentId;
        String firstName;
        String lastName;
        int studentAge;

        Student(int id, String fName, String lName, int age) {
            this.studentId = id;
            this.firstName = fName;
            this.lastName = lName;
            this.studentAge = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> studentIds = new HashSet<>();
        Student[] students = new Student[5];
        int studentCount = 0;

        //Student student = new Student(0, "", "", 0);

        while (true) {
            System.out.println("==== Student Menu ====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student");
            System.out.println("4. Exit");
            System.out.println("5. Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentCount >= 5) {
                        System.out.println("Maximum number of students reached.");
                        break;
                    }
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    String firstName = null;
                    while (studentIds.contains(studentId)) {
                        System.out.println("Student ID already exists. Please enter a unique student ID: ");
                        studentId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter first name: ");
                        firstName = scanner.nextLine();
                    }
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();

                    Student student = new Student(studentId, firstName, lastName, studentAge);
                    students[studentCount] = student;
                    studentIds.add(studentId);
                    studentCount++;
                    System.out.println("Information saved successfully.");
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("No student data found.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            Student s = students[i];
                            System.out.println("===== Student Details =====");
                            System.out.println("Student ID: " + s.studentId);
                            System.out.println("First Name: " + s.firstName);
                            System.out.println("Last Name: " + s.lastName);
                            System.out.println("Student Age: " + s.studentAge);
                            System.out.println("===== End of Student Details =====");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].studentId == id) {
                            found = true;
                            for (int j = i; j < studentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[studentCount - 1] = null;
                            studentCount--;
                            System.out.println("Student deleted successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}