import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(65);
        pq.add(12);
        pq.add(2);
        pq.add(101);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
