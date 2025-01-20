package Session11.SMS;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
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
            Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
            students = gson.fromJson(reader, studentListType);
            System.out.println("Students loaded from JSON.");
        } catch (IOException e) {
            System.out.println("Error loading students from JSON: " + e.getMessage());
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=============================== Student =========================================");
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
                   // Student student = new Student();
                    Student student = null;
                    System.out.println("Enter your first name: ");
                    student.setFistname(scanner.next());
                    System.out.println("Enter your last name: ");
                    student.setLastname(scanner.next());
                    System.out.println("Enter your major: ");
                    try {
                        student.setMajor(scanner.next());
                    } catch (Exception e) {
                        System.out.println("Invalid major!");
                        break;
                    }
                    System.out.println("Enter your age: ");
                    try {
                        student.setAge(scanner.nextInt());
                    } catch (Exception e) {
                        System.out.println("Invalid age!");
                        break;
                    }
                    scanner.nextLine();

                    studentManagement.addStudent(student);
                    System.out.println("Student details entered successfully." + studentManagement.getStudents().toString());
                    break;
                case 2:
                    System.out.println("\n===============================Student Details===================================");
                    System.out.printf("| %-20s | %-20s | %-10s | %-5s | %11s \n", "First Name", "Last Name", "Major", "Age", "Total Count");
                    for (Student s : studentManagement.getStudents()) {
                        System.out.printf("| %-20s | %-20s | %-10s | %-5d | %-2d\n",
                                s.getFistname(),
                                s.getLastname(),
                                s.getMajor(),
                                s.getAge(),
                                s.getIdGenerator(),
                                Student.idGenerator);
                        System.out.println("---------------------------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    if (id >= 0 && id < studentManagement.getStudents().size()) {
                        studentManagement.getStudents().remove(id);
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Invalid ID. Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter student id to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    if (editId >= 0 && editId < studentManagement.getStudents().size()) {
                        Student s = studentManagement.getStudents().get(editId);
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
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid data!");
                            break;
                        }
                        System.out.println("Student details edited successfully." + studentManagement.getStudents().toString());
                    } else {
                        System.out.println("Student with ID: " + editId + " not found");
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
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }
        }

        scanner.close();
    }
}
