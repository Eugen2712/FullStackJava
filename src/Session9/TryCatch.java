package Session9;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("Num1");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Num2");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int result = num1 / num2;
        System.out.println("Result"+ result);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        catch (InputMismatchException e)     {
            System.out.println("Invalid input");
            } finally {
            System.out.println("Finally block");
            scanner.close();
        }
    }
}
