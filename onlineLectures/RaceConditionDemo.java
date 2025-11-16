import java.util.Vector;

class Thread1 extends Thread {
    StringBuffer s;

    Thread1(StringBuffer s) {
        this.s=s;
    }

    @Override
    public void run() {
        for (int i=0;i<5000;i++){
            s.append("a");
        }
    }
}

class Thread2 extends Thread {
    StringBuffer s;

    Thread2(StringBuffer s) {
        this.s=s;
    }

    @Override
    public void run() {
        for (int i=0;i<5000;i++){
            s.append("b");
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        Thread1 t1 = new Thread1(sb);
        Thread2 t2 = new Thread2(sb);

        t1.start();
        t2.start();

        // make "main" thread wait for both of them to complete

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}


//import java.util.Vector;
//
//class Thread1 extends Thread {
//    Vector<Integer> nums;
//
//    Thread1(Vector<Integer> ds) {
//        this.nums = ds;
//    }
//
//    @Override
//    public void run() {
//        for (int i=0;i<10_000;i++){
//            nums.add(1);
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    Vector<Integer> nums;
//
//    Thread2(Vector<Integer> ds) {
//        this.nums = ds;
//    }
//
//    @Override
//    public void run() {
//        for (int i=0;i<10_000;i++){
//            nums.add(2);
//        }
//    }
//}
//
//public class RaceConditionDemo {
//    public static void main(String[] args) throws InterruptedException {
//        Vector<Integer> ds = new Vector<>();
//
//        Thread1 t1 = new Thread1(ds);
//        Thread2 t2 = new Thread2(ds);
//
//        t1.start();
//        t2.start();
//
//        // make "main" thread wait for both of them to complete
//
//        t1.join();
//        t2.join();
//
//        System.out.println(ds.size());
//    }
//}
