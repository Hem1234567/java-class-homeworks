public class Main {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(5000);
        acc1.showAccountType();
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.checkBalance();

        System.out.println();

        Account acc2 = new CurrentAccount(5000);
        acc2.showAccountType();
        acc2.withdraw(3500);   // Allowed
        acc2.withdraw(1000);   // Not allowed
        acc2.checkBalance();
    }
}
