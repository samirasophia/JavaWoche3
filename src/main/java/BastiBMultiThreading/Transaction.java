package BastiBMultiThreading;

public class Transaction implements Runnable {
    private BankAccount account;
    private double amount;

    public Transaction(BankAccount account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    private boolean isDeposit;

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
