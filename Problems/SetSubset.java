import java.util.HashMap;

public class SetSubset {
    public static void main(String[] args) {
        int[] setA = { 2, 3, 11, 6, 7, 8 };
        int[] setB = { 4, 7, 8 };
        boolean flag = true;

        HashMap<Integer, Integer> occurrence = new HashMap<>();

        for (int i = 0; i < setA.length; i++)
            occurrence.put(setA[i], 1);

        for (int i = 0; i < setB.length; i++) {
            if (!occurrence.containsKey(setB[i])) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Set B is a subset of Set A");
        else
            System.out.println("Set B is not a subset of Set A");

    }
}
