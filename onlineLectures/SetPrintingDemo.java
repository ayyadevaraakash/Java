import java.util.HashSet;
import java.util.Set;

public class SetPrintingDemo {
    public static void main(String[] args) {
//        Set<Integer> ds = new HashSet<>();
//        ds.add(45);
//        ds.add(78);
//        ds.add(45);
//        ds.add(12);
//        ds.add(23);

        Set<Integer> ds = Set.of(34, 54, 87, 99, 101);

        for (Integer x : ds) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
