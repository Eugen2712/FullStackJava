package Sessian5;

import java.util.Scanner;

public class SearchforNr {
    public static void main(String[] args) {
        int[] numbers = {24 , 54 , 67 , 55 , 32 , 33 , 47 , 39};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search for: ");
        int searchFor = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchFor) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found!");
        }
    }
}
