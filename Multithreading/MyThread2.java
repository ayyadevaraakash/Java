package basic;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Shinra Tensei " + Thread.currentThread().getName());
        }
    }
}
