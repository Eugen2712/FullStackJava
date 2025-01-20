package Session10;

public class bankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }
    private void setBalance(double balance){
        this.balance = balance;
    }

    //deposit (amount)
    public void deposit(double amount){
        if (amount > 0) {
            setBalance(amount);
            System.out.println("Deposit" + amount);
        } else {
            System.out.println("Amount should be > 0");
        }
    }
    //withdraw
    public void withdraw(double amount){
        if (amount > 0 && amount <=balance) {
            setBalance(balance - amount);
            System.out.println("Withdraw" + amount + "new balance" + getBalance());
        } else {
            System.out.println("Not enough funds or amount inccorect");
        }
    }

//    public static void main(String[] args) {
//
//    }
}
