import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrintingDemo {
    public static void main(String[] args) {
//        List<Integer> ds = new ArrayList<>();
//        ds.add(12);
//        ds.add(56);
//        ds.add(98);
//        ds.add(44);

//        List<Integer> ds = List.of(12, 54, 89, 44, 23);
        List<Integer> ds = Arrays.asList(12, 54, 98, 34, 35);

        // style 1
//        int n = ds.size();
//        for (int i = 0; i < n; i++) {
//            System.out.print(ds.get(i) + " ");
//        }
//        System.out.println();

        // style 2
        // 12 56 98 44
        for (Integer x : ds) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
