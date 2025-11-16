import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> ds = Arrays.asList(11, 54, 11, 12, 11, 2, 7, 19, 47);

//        List<Integer> ans = ds.stream().distinct().sorted().toList();

//        List<Integer> ans = ds.stream().filter(x -> x%2==0).toList();

//        List<Integer> ans = ds.stream().map(x -> x + 100).toList();

//        int ans = ds.stream().filter(x -> x % 2 == 0).reduce(1, (a, b) -> a * b);

//        long cnt = ds.stream().filter(x -> x%2==0).count();

//        int cnt = ds.stream().filter(x -> x%2 != 0).mapToInt(x -> x).max().getAsInt();

        Object[] ans = ds.stream().filter(x -> x%2!=0).toArray();

        System.out.println(Arrays.toString(ans));
    }
}
