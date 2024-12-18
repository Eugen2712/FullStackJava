package Session6;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement {
    static class  Student {
        int studentid;
        String fistname;
        String lastname;
        int age;

        Student(int id, String fName, String lName, int age){
            this.studentid = id;
            this.fistname = fName;
            this.lastname = lName;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Student[] students = new Student[5];
        ArrayList<Student> students = new ArrayList<Student>();
        int studentCount = 0;
        //Student student = new Student(0, "", "", 0);

        while(true){
            System.out.println("========Student=======");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Reset Student Data");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean idFound = false;
                    System.out.println("Enter your ID: ");
                    int studentid = scanner.nextInt();

//                    for (int i = 0; i < studentCount; i++) {
//                        if (students[i].studentid == studentid) {
//                            System.out.println("Student with this ID already exists.");
//                            idFound = true;
//                            break;
//                        }
//                    }

                    try {
                        students.get(studentid);
                        idFound = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }
//                    if (students.get(studentid) != null) {
//                        System.out.println("Student with this ID already exists.");
//                        idFound = true;
//                    }
                    if (idFound) {
                        break;
                    }
                    System.out.println("Enter your first name: ");
                    String fistname = scanner.next();
                    System.out.println("Enter your last name: ");
                    String lastname = scanner.next();
                    System.out.println("Enter your age: ");
                    int age = scanner.nextInt();

                    Student student = new Student(studentid,
                            fistname,
                            lastname,
                            age);
                    //students[studentCount] = student;
                    students.add(student);

                    //studentCount++;
                    System.out.println("Student details entered successfully.");
                    break;
                case 2:
                    for (int i = 0; i < students.size(); i++) {
                        Student s = students.get(i);
                            System.out.println("\n =========Student Details========");
                            System.out.println("ID: " + s.studentid);
                            System.out.println("First Name: " + s.fistname);
                            System.out.println("Last Name: " + s.lastname);
                            System.out.println("Age: " + s.age);

                    }
//                    if (studentCount == 0) {
//                        System.out.println("No student data found.");
//                    }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean found = false;
//                    for (int i = 0; i < studentCount; i++) {
//                        if (students[i].studentid == id) {
//                            found = true;
//                            for (int j = i; j < studentCount - 1; j++) {
//                                students[j] = students[j + 1];
//                            }
//                            students[studentCount - 1] = null;
//                            studentCount--;
//                            System.out.println("Student deleted successfully.");
//                            break;
//                        }
//                    }
                    students.remove(id);
                    System.out.println("Student deleted successfully.");
//                    if (!found) {
//                        System.out.println("Student ID not found.");
//                    }
                    break;
                case 4:
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
