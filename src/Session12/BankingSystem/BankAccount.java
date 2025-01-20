package Session12.BankingSystem;

abstract class BankAccount {
    private String accountNumber;
    private String AccountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String GetAccountHolderName() {
        return AccountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if ( amount > 0 ) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) throws InvalidWithdrawException {
        if ( amount > 0 ) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public abstract void displayAccountData();
}

