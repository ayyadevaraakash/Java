package basic;

public class Counter {
    private int count = 0;

//    public synchronized void increase() {
//        this.count++;
//    }

    public void increase() {
        synchronized (this) {
            this.count++;
        }
    }

    public int getCount() {
        return this.count;
    }
}
