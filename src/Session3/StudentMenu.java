package Session3;

import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentid = 0;
        String fistname = "";
        String lastname = "";
        int age = 0;

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
                    System.out.println("Enter your ID: ");
                    studentid = scanner.nextInt();
                    System.out.println("Enter your first name: ");
                    fistname = scanner.next();
                    System.out.println("Enter your last name: ");
                    lastname = scanner.next();
                    System.out.println("Enter your age: ");
                    age = scanner.nextInt();

                    System.out.println("Student details entered successfully.");
                    break;
                case 2:
                    System.out.println("\n =========Student Details========");
                    System.out.println("ID: " + studentid);
                    System.out.println("First Name: " + fistname);
                    System.out.println("Last Name: " + lastname);
                    System.out.println("Age: " + age);
                    break;
                case 3:
                    studentid = 0;
                    fistname = "";
                    lastname = null;
                    age = 0;
                    System.out.println("Student data reset successfully.");
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
