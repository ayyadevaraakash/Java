import java.lang.Thread;

class A extends Thread {
  public void run() {
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }
}

class MultithreadingDemo {
  public static void main(String[] args) {
    A object = new A();
    object.start();
  }
}
