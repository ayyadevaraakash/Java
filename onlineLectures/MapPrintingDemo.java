import java.util.HashMap;
import java.util.Map;

public class MapPrintingDemo {
    public static void main(String[] args) {
        Map<Integer, String> ds = new HashMap<>();
        ds.put(1, "Ramesh");
        ds.put(2, "Radha");
        ds.put(3, "Devika");
        ds.put(4, "Bharath");
        ds.put(5, "Akash");

        // style 1
//        for (Map.Entry<Integer, String> x : ds.entrySet()) {
//            System.out.println(x.getKey() + " " + x.getValue());
//        }

        // style 2
//        for (Integer key : ds.keySet()) {
//            System.out.println(key + " " + ds.get(key));
//        }

        // style 3
        for (String names : ds.values()) {
            System.out.println(names);
        }
    }
}
