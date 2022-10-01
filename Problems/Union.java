import java.util.HashMap;

class Union {
    public static void main(String[] args) {
        int[] setA = { 2, 2, 9, 10, 12 };
        int[] setB = { 3, 4, 4, 4, 4, 12, 22 };
        HashMap<Integer, Integer> occurrence = new HashMap<>();

        for (int i = 0; i < setA.length; i++)
            occurrence.put(setA[i], 1);
        for (int i = 0; i < setB.length; i++)
            occurrence.put(setB[i], 1);

        System.out.print("Union: ");
        for (int i : occurrence.keySet())
            System.out.print(i + " ");
        System.out.println();
    }
}
