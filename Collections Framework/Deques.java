import java.util.Deque;
import java.util.ArrayDeque;

class Deques {
  public static void main(String[] args) {
    Deque<Integer> myDequeue = new ArrayDeque<>();

    myDequeue.offerFirst(12);
    myDequeue.offerFirst(31);
    myDequeue.offerLast(29);

    System.out.println("Initially: " + myDequeue);

    System.out.println("Peek first: " + myDequeue.peekFirst());
    System.out.println("Peek last: " + myDequeue.peekLast());

    myDequeue.pollFirst();
    System.out.println("After poll first: " + myDequeue);

  }
}
