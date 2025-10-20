class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    @Override
    public void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Interest=" + calculateInterest());
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        System.out.println("Overdraft Limit=" + overdraftLimit);
    }

    @Override
    public void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}


public class BankAccountTypes {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount(101, "Ramesh", 5000, 5);
        sa.displayBalance();

        
        CurrentAccount ca = new CurrentAccount(102, "Anita", 2000, 1000);
        ca.displayBalance();
    }
}