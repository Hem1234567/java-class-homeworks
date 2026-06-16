abstract class Account {
    protected double balance;
    protected String accountType;

    Account(double balance, String accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    // Concrete method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Abstract method
    abstract void withdraw(double amount);

    // Concrete method
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void showAccountType() {
        System.out.println("Account Type: " + accountType);
    }
}
