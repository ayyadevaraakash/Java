import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> ds = new Stack<>();
        ds.push(45);
        ds.push(12);
        ds.push(98);
        ds.push(24);

//        System.out.println(ds.peek());

//        int cameOut = ds.pop();
//        System.out.println("Element that came out is " + cameOut);
//
//        System.out.println(ds);

        // while ds is not empty, do something
        while(ds.size() != 0) {
            System.out.println(ds.peek());
            ds.pop();
        }
    }
}
