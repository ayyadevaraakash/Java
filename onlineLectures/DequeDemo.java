import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> ds = new ArrayDeque<>();
        ds.addFirst(45);
        ds.addFirst(54);
        ds.addLast(98);

//        System.out.println(ds);

        for (Integer x : ds) {
            System.out.println(x);
        }
    }
}
