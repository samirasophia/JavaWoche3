package BastiBMultiThreading;

public class Transaction implements Runnable {
    private BankAccount account;
    private double amount;
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
