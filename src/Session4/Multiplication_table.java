package Session4;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
