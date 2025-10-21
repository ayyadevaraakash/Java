package basic;

public class Test8 {
    public static void main(String[] args) {
//        Bank2 bank = new Bank2();
        Bank3 bank = new Bank3();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bank.outerLock();
            }
        };

        Thread t1 = new Thread(task, "thread1");
        Thread t2 = new Thread(task, "thread2");

        t1.start();
        t2.start();
    }
}
