class BankAccountTest {
    
    private double balance;
    public BankAccountTest() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance! Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

        public double getBalance() {
        return balance;
    }

   
    public static void main(String[] args) {
        BankAccountTest  account = new BankAccountTest();

        
        account.deposit(5000);
        account.withdraw(2000);

        
        System.out.println("Updated Balance = " + account.getBalance());
    }
}
