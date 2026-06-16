class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance, "Savings Account");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
