class Account {
    protected int accountNo;
    protected int balance;

        public Account(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    
    void displayDetails() {
        System.out.println("Account → " + accountNo + ", Balance=" + balance);
    }
}


class SavingAccount extends Account {
    private int interestRate; // percentage

    public SavingAccount(int accountNo, int balance, int interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayDetails() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}


class CurrentAccount extends Account {
    private int overdraftLimit;

    public CurrentAccount(int accountNo, int balance, int overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void displayDetails() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        
        SavingAccount saving = new SavingAccount(101, 5000, 5);
        CurrentAccount current = new CurrentAccount(102, 10000, 2000);

        
        saving.displayDetails();
        current.displayDetails();
    }
}
