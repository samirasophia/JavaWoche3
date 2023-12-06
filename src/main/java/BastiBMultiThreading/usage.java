package BastiBMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class usage {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        BankAccount bankAccount = new BankAccount("Bastien", 0, new ReentrantLock());

        Thread thread1 = new Thread(new Transaction(bankAccount, 200, true));
        thread1.start();
        Thread thread2 = new Thread(new Transaction(bankAccount, 100, false));
        thread2.start();
        Thread thread3 = new Thread(new Transaction(bankAccount, 2000, false));
        thread3.start();


    }

}

