package Session3;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        // age < 13 = child// age 13 to 19 = teenager// age 20 to 59 = adult// age 60 and above = senior
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
