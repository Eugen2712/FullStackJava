package Session14.SMS;

import Session12.BankingSystem.CheckingAccount;
import Session12.BankingSystem.SavingsAccount;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.awt.geom.GeneralPath;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    private List<Session11.SMS.Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Session11.SMS.Student student) {
        students.add(student);
    }

    public void saveToJson(String filename) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(students, writer);
            System.out.println("Students saved to JSON.");
        } catch (IOException e) {
            System.out.println("Error saving students to JSON: " + e.getMessage());
        }
    }

    public void loadFromJson(String filename) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filename)) {
            Type studentListType = new TypeToken<ArrayList<Session11.SMS.Student>>() {}.getType();
            students = gson.fromJson(reader, studentListType);
            System.out.println("Students loaded from JSON.");
        } catch (IOException e) {
            System.out.println("Error loading students from JSON: " + e.getMessage());
        }
    }

    public List<Session11.SMS.Student> getStudents() {
        return students;
    }


    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        Student student = null;
        while (true) {
            System.out.println("\n=============================== Student ===================================================");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Student Data");
            System.out.println("4. Edit Student Data");
            System.out.println("5. Save to JSON");
            System.out.println("6. Load from JSON");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Choose an operation: ");
                    System.out.println("1. Graduate Students");
                    System.out.println("2. Undergraduate Students");

                    int oper = scanner.nextInt();
                    scanner.nextLine();
//                    if (oper == 1) {
//                        student = new GraduateStudent("", "", "", 0, 0);
//                      // GraduateStudent student = null;
//                    } else if (oper == 2) {
//                        UndergraduateStudent student = null;
//                    } else {
//                        System.out.println("Invalid choice");
//                        return;
//                    }
                    System.out.println("Enter your first name: ");
                   // student.setFistname(scanner.next());
                    String fistname = scanner.nextLine();
                    System.out.println("Enter your last name: ");
                    String lastname = scanner.nextLine();
                    System.out.println("Enter your major: ");
                    String major = scanner.nextLine();
                    System.out.println("Enter your age: ");
                    Integer age = scanner.nextInt();
                    scanner.nextLine();

                    if (oper == 1) {
                        System.out.print("Enter GPA: ");
                        double GPA = scanner.nextDouble();
                        scanner.nextLine();
                        student = new GraduateStudent(fistname, lastname, major, age, GPA);
                        students.add(student);
                    } else if (oper == 2) {
                        student = new UndergraduateStudent(fistname, lastname, major, age);
                        students.add(student);
                    } else {
                        System.out.println("Invalid choice");
                        return;
                      }
                    student.editDetails();
                    break;
                case 2:
                    System.out.println("\n===============================Student Details===========================================");
                    System.out.printf("| %-20s | %-20s | %-10s | %-5s | %11s | %-5s \n", "First Name", "Last Name", "Major", "Age", "Total Count", "GPA");
                    for (Student s : students) {
                    s.displayInfo();
                }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    students.remove(id);
                    System.out.println("Student deleted successfully.");
                    break;
                case 4:
                    System.out.println("Enter student id to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    boolean editFound = false;
                    // for (Student s: students) {
                    for (int i = 0; i < students.size(); i++) {
                        if (editId >= 0 && editId == i) {
                            Student s = students.get(i);
                            System.out.println("Enter your first name: ");
                            s.setFistname(scanner.next());
                            System.out.println("Enter your last name: ");
                            s.setLastname(scanner.next());
                            System.out.println("Enter your major: ");
                            try {
                                s.setMajor(scanner.next());
                            } catch (Exception e) {
                                System.out.println("Invalid major!");
                                break;
                            }
                            System.out.println("Enter your age: ");
                            try {
                                s.setAge(scanner.nextInt());
                                scanner.nextLine();
                                editFound = true;
                            } catch (IllegalArgumentException e) {
                                System.out.println("Invalid data!");
                                break;
                            }
                            if (s instanceof GraduateStudent == true) {
                                System.out.print("Enter GPA: ");
                                ((GraduateStudent) s).setGPA(scanner.nextDouble());
                                scanner.nextLine();
                            }

                            student.editDetails();
                            break;
                        }
                    }
                    if (!editFound) {
                        System.out.println("Student with ID: " + editId + "not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter filename to save: ");
                    String saveFilename = scanner.nextLine();
                    studentManagement.saveToJson(saveFilename);
                    break;
                case 6:
                    System.out.print("Enter filename to load: ");
                    String loadFilename = scanner.nextLine();
                    studentManagement.loadFromJson(loadFilename);
                    break;
                case 7:
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

