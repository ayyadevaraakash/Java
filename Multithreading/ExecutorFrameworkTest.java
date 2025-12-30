import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorFrameworkTest {
  static long getFactorial(int n) {
    if (n<=1){
      return 1;
    } else {
      return n * getFactorial(n-1);
    }
  }

  public static void main(String args[]) throws Exception {
    ExecutorService es = Executors.newFixedThreadPool(10);
    long start = System.currentTimeMillis();
    for (int i=0;i<20;i++){
      int val=i;
      es.submit(()->{
        long result = getFactorial(val);
        System.out.println(result);
      });
    }
    es.shutdown();
    es.awaitTermination(10, TimeUnit.SECONDS);
    System.out.println("TIME: " + (System.currentTimeMillis()-start));
  }

  // public static void main(String args[]) throws Exception {
  //   int n=9;
  //   Thread[] threads = new Thread[n];
  //   long start = System.currentTimeMillis();
  //   for (int i=0;i<9;i++){
  //     int val=i;
  //     threads[i]=new Thread(()->{
  //       long result = getFactorial(val);
  //       System.out.println(result);
  //     });
  //   };
  //   for (int i=0;i<9;i++){
  //     threads[i].run();
  //   }
  //   for (int i=0;i<9;i++){
  //     threads[i].join();
  //   }
  //   System.out.println(System.currentTimeMillis()-start);
  // }
}
