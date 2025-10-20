import java.util.Scanner;

class BankAccount {
    private final int accountId;  // final variable → cannot be reassigned

    // Constructor to initialize accountId
    public BankAccount(int accountId) {
        this.accountId = accountId;
    }

    // Getter
    public int getAccountId() {
        return accountId;
    }
}

public class BankAccountSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int id = sc.nextInt();   // Account ID: 101

        // Create bank account object
        BankAccount account = new BankAccount(id);

        // Output
        System.out.println("Account ID = " + account.getAccountId() + " (cannot be changed)");

        // ❌ The below line would cause a compile-time error if uncommented:
        // account.accountId = 202; // Not allowed because it's final
    }
}
