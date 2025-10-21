package basic;

public class Test7 {
    public static void main(String[] args) {
        BankAccount2 sbi = new BankAccount2();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "thread1");
        Thread t2 = new Thread(task, "thread2");

        t1.start();
        t2.start();
    }
}
