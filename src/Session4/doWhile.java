package Session4;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }   while (number < 0);

        System.out.println("Number is positive");
    }
}
