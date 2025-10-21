package basic;

public class Test6 {
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread4 t1 = new MyThread4(c);
        MyThread4 t2 = new MyThread4(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final count: " + c.getCount());
    }
}
