package basic;

public class Test4 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
