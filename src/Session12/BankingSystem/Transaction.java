package Session12.BankingSystem;

public interface Transaction {
    void deposit(double amount) throws InalidDepositException;
    void withdraw(double amount) throws InvalidWithdrawException;

}
