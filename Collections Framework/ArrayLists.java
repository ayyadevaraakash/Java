import java.util.ArrayList;

class ArrayLists {
  public static void main(String[] args) {

    ArrayList<Integer> myArray = new ArrayList<>();

    // Adding elements
    myArray.add(3);
    myArray.add(5);

    // Adds at desired location and shift others
    myArray.add(1, 31);

    // Access elements
    int output = myArray.get(2);
    System.out.println("Accessing 2nd element: " + output);

    // Modify elements
    myArray.set(0, 33);

    // Remove elements
    myArray.remove(1);

    System.out.println(myArray);

  }
}
