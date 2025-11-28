final class CentralBankRules {
    public void showRules() {
        System.out.println("Central Bank Rules applied");
    }
}

class Bank {
    public final void bankPolicy() {
        System.out.println("Standard bank policy");
    }
}

class Account extends Bank {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class Banks {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 1000);
        sa.bankPolicy();
        System.out.println("Savings Account Number: " + sa.getAccountNumber());
        System.out.println("Balance: " + sa.getBalance());

        CurrentAccount ca = new CurrentAccount("CA54321", 2000);
        ca.bankPolicy();
        System.out.println("Current Account Number: " + ca.getAccountNumber());
        System.out.println("Balance: " + ca.getBalance());

        CentralBankRules rules = new CentralBankRules();
        rules.showRules();
    }
}