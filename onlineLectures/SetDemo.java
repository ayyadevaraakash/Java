import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> instaAccounts = new LinkedHashSet<>();
        instaAccounts.add(45);
        instaAccounts.add(78);
        instaAccounts.add(12);
        instaAccounts.add(5);
        instaAccounts.add(101);

        System.out.println(instaAccounts);
    }
}
