import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
Syntax
class CustomComparator implements Comparator<Data Type> {
    @Override
    public int compare(Data Type e1, Data Type e2) {
        say e1 is first and e2 is second. If you are OK with this then return -1;
        if you want to change then return 1;

        basically -1 means don't change and 1 means change
    }
}
*/

class CustomComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        if (e1.getValue() < e2.getValue())
            return -1;
        if (e1.getValue() > e2.getValue())
            return 1;
        if (e1.getKey().compareTo(e2.getKey()) < 0)
            return 1;
        return -1;
    }
}

public class Comparators {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            freq.put(words[i], freq.getOrDefault(words[i], 0) + 1);
        }
        CustomComparator c = new CustomComparator();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(c);
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            pq.add(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new LinkedList<>();
        while (!pq.isEmpty()) {
            res.add(0, pq.poll().getKey());
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words1 = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
        System.out.println(topKFrequent(words1, 4));
        String[] words2 = { "i", "love", "leetcode", "i", "love", "coding" };
        System.out.println(topKFrequent(words2, 2));
    }
}