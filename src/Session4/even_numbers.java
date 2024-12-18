package Session4;

import java.util.Scanner;

public class even_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}
