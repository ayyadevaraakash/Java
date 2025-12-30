class VolatileTest {
    static volatile boolean flag = true;

    public static void main(String args[]) {
        Thread t1 = new Thread(()->{
            System.out.println("I am running");
            while(flag){}
            System.out.println("Stopped");
        });
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }
        flag = false;
    }
}


// Problem without volatile

// class VolatileTest {
//     static boolean flag = true;
//
//     public static void main(String args[]) {
//         Thread t1 = new Thread(()->{
//             System.out.println("I am running");
//             while(flag){}
//             System.out.println("Stopped");
//         });
//         t1.start();
//
//         try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
//             System.out.println("Exception Occurred");
//         }
//         flag = false;
//     }
// }
