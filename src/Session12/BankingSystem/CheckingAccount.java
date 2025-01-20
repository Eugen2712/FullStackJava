package Session12.BankingSystem;

public class CheckingAccount extends BankAccount implements Transaction{

    private double overdraftlimit;
    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftlimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void withdraw(double amount) throws InvalidWithdrawException {
        if (amount > 0 && (getBalance() + overdraftlimit - amount >= 0 )){
                super.withdraw(amount);
        } else {
            throw new InvalidWithdrawException("Invalid withdrawal amount or overdraft limit exceeded");
            //    System.out.println("Invalid withdrawal amount or overdraft limit exceeded");
        }
    }

    @Override
    public void displayAccountData() {
        System.out.println("Checking Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + GetAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftlimit);
    }
}
