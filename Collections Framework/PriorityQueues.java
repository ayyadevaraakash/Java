import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

        PriorityQueue<Integer> myQueue = new PriorityQueue<>();

        myQueue.offer(54);
        myQueue.offer(2);
        myQueue.offer(12);
        myQueue.offer(25);

        System.out.println("Initially: " + myQueue);

        System.out.println("Peek applied: " + myQueue.peek());

        // Priority will be given. Default is ascending order.
        myQueue.poll();
        System.out.println("After removing: " + myQueue);

    }
}
