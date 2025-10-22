class BankAccount {
    static String bankName = "CDAC Bank";

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public static void displayBankName() {
        System.out.println("Welcome to " + bankName);
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

public class BankNameDisplay {
    public static void main(String[] args) {
        
        BankAccount.displayBankName();

       
        BankAccount account1 = new BankAccount("Ravi", 15000);

        
        account1.displayDetails();
    }
}
