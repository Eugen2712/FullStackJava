package Session7.SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int studentCount = 0;
        //Student student = new Student(0, "", "", 0);

        while(true){
            System.out.println("\n===============================Student ==========================================");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Student Data");
            System.out.println("4. Edit Student Data");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean idFound = false;
                    System.out.println("Enter your ID: ");
                    int studentid = scanner.nextInt();

                    try {
                        students.get(studentid);
                        idFound = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }
                    if (idFound) {
                        break;
                    }
                    System.out.println("Enter your first name: ");
                    String fistname = scanner.next();
                    System.out.println("Enter your last name: ");
                    String lastname = scanner.next();
                    System.out.println("Enter your major: ");
                    String major = scanner.next();
                    System.out.println("Enter your age: ");
                    int age = scanner.nextInt();

                    Student student = new Student(studentid,
                            fistname,
                            lastname,
                            major,
                            age);
                    //students[studentCount] = student;
                    students.add(student);

                    //studentCount++;
                    System.out.println("Student details entered successfully."+students.toString());
                    break;
                case 2:
                    System.out.println("\n===============================Student Details===================================");
                    System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-5s | \n","ID","First Name","Last Name","Major","Age");
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                        System.out.printf("| %-10d | %-20s | %-20s | %-10s | %-5d |\n",
                                s.studentid,
                                s.fistname,
                                s.lastname,
                                s.major,
                                s.age);
                        System.out.println("---------------------------------------------------------------------------------");
                    }

                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    students.remove(id);
                    System.out.println("Student deleted successfully.");
                    break;
                case 4:
                    System.out.println("Enter student id to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    boolean editFound = false;
                    for (Student s: students) {
                        if (s.studentid == editId) {
                            System.out.println("Enter your first name: ");
                            s.fistname = scanner.next();
                            System.out.println("Enter your last name: ");
                            s.lastname = scanner.next();
                            System.out.println("Enter your major: ");
                            s.major = scanner.next();
                            System.out.println("Enter your age: ");
                            s.age = scanner.nextInt();
                            scanner.nextLine();
                            editFound = true;
                            System.out.println("Student details edited successfully." + students.toString());
                            break;
                        }
                    }
                    if (!editFound) {
                        System.out.println("Student with ID: " + editId + "not found");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }
        }
    }
}
