package Session6;
import java.util.ArrayList;
import java.util.Scanner;

public class studentManagementList {

        static class Student {
            String fistname;
            String lastname;
            int age;

            Student(String fName, String lName, int age) {
                this.fistname = fName;
                this.lastname = lName;
                this.age = age;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("========Student=======");
                System.out.println("1. Enter Student Details");
                System.out.println("2. Display Student Details");
                System.out.println("3. Delete Student Data");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your first name: ");
                        String fistname = scanner.next();
                        System.out.println("Enter your last name: ");
                        String lastname = scanner.next();
                        System.out.println("Enter your age: ");
                        int age = scanner.nextInt();

                        Student student = new Student(fistname, lastname, age);
                        students.add(student);
                        System.out.println("Student details entered successfully.");
                        break;
                    case 2:
                        for (int i = 0; i < students.size(); i++) {
                            Student s = students.get(i);
                            System.out.println("\n=========Student Details========");
                            System.out.println("Index: " + i);
                            System.out.println("First Name: " + s.fistname);
                            System.out.println("Last Name: " + s.lastname);
                            System.out.println("Age: " + s.age);
                        }
                        break;
                    case 3:
                        System.out.println("Enter student index to delete: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < students.size()) {
                            students.remove(index);
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Invalid index.");
                        }
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

