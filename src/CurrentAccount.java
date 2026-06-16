class CurrentAccount extends Account {

    private static final double MIN_BALANCE = 2000;

    CurrentAccount(double balance) {
        super(balance, "Current Account");
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance of 2000 must be maintained");
        }
    }
}
