import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ds = new Hashtable<>();
        ds.put(1, "Ramesh");
        ds.put(2, "Radha");
        ds.put(3, "Akash");

        for (Map.Entry<Integer, String> x : ds.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
