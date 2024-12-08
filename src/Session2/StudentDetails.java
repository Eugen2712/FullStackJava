package Session2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Student identification
        //student first name
        //student last name
        //student age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("\n =========Student Details========");
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        scanner.close();

    }
}
