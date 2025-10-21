package basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank2 {

    private final Lock lock = new ReentrantLock();

    public void outerLock() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Come to outer lock");
            innerLock();
        } finally {
            lock.unlock();
        }
    }

    public void innerLock() {
        System.out.println(Thread.currentThread().getName() + " wants to run innerLock");
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Come to inner lock");
        } finally {
            lock.unlock();
        }
    }
}
