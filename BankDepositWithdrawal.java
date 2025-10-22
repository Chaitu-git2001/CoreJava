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

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

public class BankDepositWithdrawal {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohit", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);

        acc1.deposit(5000);
        acc1.withdraw(3000);

        acc2.deposit(2000);
        acc2.withdraw(25000); // should show insufficient balance

        System.out.println("\nUpdated Account Details:");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
