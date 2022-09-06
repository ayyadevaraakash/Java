import java.util.HashMap;
import java.util.Map;

public class HashMaps {
  public static void main(String[] args) {

    Map<Integer, String> myMap = new HashMap<>();

    myMap.put(1, "Java");
    myMap.put(2, "C++");
    myMap.put(3, "C");

    System.out.println(myMap.entrySet());

    System.out.println("Get value with key as 2: " + myMap.get(2));

    myMap.remove(2);

    System.out.println(myMap);

  }
}
