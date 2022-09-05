// Implementation of Queue interface using LinkedList class

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.offer(10);
        myQueue.offer(12);
        myQueue.offer(14);

        System.out.println("Initially: " + myQueue);

        System.out.println("Head element: " + myQueue.element());

        // FIFO strategy

        myQueue.poll();

        System.out.println("After deque operation: " + myQueue);

    }
}
