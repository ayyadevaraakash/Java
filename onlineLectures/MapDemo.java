import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(3, "Devika");
        students.put(1, "Ramesh");
        students.put(4, "Akash");
        students.put(2, "Radha");

        System.out.println(students);

//        for (Map.Entry<Integer, String> x : students.entrySet()) {
//            System.out.println(x.getKey() + " " + x.getValue());
//        }
    }
}
