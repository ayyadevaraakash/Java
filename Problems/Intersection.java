import java.util.HashMap;

class Intersection {
    public static void main(String[] args) {
        int[] setA = { 9, 1, 6, 9, 3, 3 };
        int[] setB = { 12, 8, 2, 9, 3, 3, 3, 9, 9 };
        HashMap<Integer, Integer> occurrence = new HashMap<>();

        for (int i = 0; i < setA.length; i++)
            occurrence.put(setA[i], 1);

        for (int i = 0; i < setB.length; i++)
            if (occurrence.containsKey(setB[i]))
                occurrence.put(setB[i], occurrence.get(setB[i]) + 1);

        System.out.print("Intersection: ");
        for (int i : occurrence.keySet())
            if (occurrence.get(i) > 1)
                System.out.print(i + " ");
        System.out.println();
    }
}
