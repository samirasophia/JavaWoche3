package BastiBMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class usage {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        BankAccount bankAccount = new BankAccount("John Doe", 1000.0, new ReentrantLock());

        Thread thread1 = new Thread(new Transaction());
        thread1.start();
        Thread thread2 = new Thread(new Transaction());
        thread2.start();
        Thread thread3 = new Thread(new Transaction());
        thread3.start();


    }

}

