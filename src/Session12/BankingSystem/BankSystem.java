package Session12.BankingSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Welcome to the Banking System!");
        System.out.println("Choose an account: ");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        if (choice == 1) {
            System.out.print("Enter overdraft limit: ");
            double overdraftLimit = scanner.nextDouble();
            account = new CheckingAccount(accountNumber, accountHolderName, initialBalance, overdraftLimit);
        } else if (choice == 2) {
            System.out.print("Enter Interest Rate: ");
            double interestRate = scanner.nextDouble();
            account = new SavingsAccount(accountNumber, accountHolderName, initialBalance, interestRate);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Display Account Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    account.displayAccountData();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
