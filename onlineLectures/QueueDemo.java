import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(45);
        q.add(87);
        q.add(56);
        q.add(17);

//        System.out.println(q.peek());
//
//        int cameOut = q.poll();
//        System.out.println("Polled element is " + cameOut);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
    }
}
