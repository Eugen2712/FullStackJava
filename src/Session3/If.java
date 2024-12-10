package Session3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else if (score >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("GradeF");
        }
        scanner.close();
    }
}
