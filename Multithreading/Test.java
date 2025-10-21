package basic;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        t1.join();

        System.out.println("Name of thread: " + Thread.currentThread().getName());

        System.out.println("Hello World");
    }
}
