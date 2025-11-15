// TaskOne is to play video
class Task1 implements Runnable {
    @Override
    public void run(){
        for (int i=0;i<10000;i++){
            System.out.println("Video is playing");
        }
    }
}

// TaskTwo is to play audio
class Task2 implements Runnable {
    @Override
    public void run(){
        for (int i=0;i<10000;i++){
            System.out.println("Audio is playing");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Thread t1 = new Thread(obj);
        t1.start();

        Task2 obj2 = new Task2();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
