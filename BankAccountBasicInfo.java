class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class BankAccountBasicInfo {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("Rohit Sharma", 10000.0);

        
        System.out.println("Account Details:");
        account1.displayDetails();
    }
}
