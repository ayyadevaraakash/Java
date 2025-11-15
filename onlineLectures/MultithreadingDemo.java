// TaskOne is playing video
class TaskOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Video is playing from thread " + Thread.currentThread().getName());
        }
    }
}

// TaskTwo is playing audio
class TaskTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Audio is playing from thread " + Thread.currentThread().getName());
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();

        t1.setName("labor 1");
        t2.setName("labor 2");

        // Just a request to CPU
//        t1.setPriority(10);
//        t2.setPriority(1);

        // START
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Movie Finished " + Thread.currentThread().getName());
    }
}
