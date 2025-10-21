package basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount2 {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to acquire lock");
        try {
            if (lock.tryLock()) {
                if (balance >= amount) {
                    try {
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdraw successful");
                        System.out.println("Now balance: " + balance);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println("Unable to get lock");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
