package basic;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        try {
            if (balance >= amount) {
                Thread.sleep(2000);
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdraw successful");
                System.out.println("Now balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient balance");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
