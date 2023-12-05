package BastiBMultiThreading;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String user;
    private double paras;
    private final Lock lock;
    private List<Transaction> transactions;

    public BankAccount(String user, double paras, Lock lock) {
        this.user = user;
        this.paras = paras;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            paras += amount;
            System.out.println("New Balance: " + paras);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            paras -= amount;
            System.out.println("New Balance: " + paras);
        } finally {
            lock.unlock();
        }
    }
}
