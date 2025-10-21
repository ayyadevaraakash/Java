package basic;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 t1 = new MyThread3();
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(10);
        System.out.println("Mungaru Male");
    }
}
