import java.util.LinkedList;
import java.util.Iterator;

class LinkedLists {
  public static void main(String[] args) {

    LinkedList<Integer> myLinkedList = new LinkedList<>();

    myLinkedList.add(12);
    myLinkedList.add(34);
    myLinkedList.add(56);
    myLinkedList.add(75);

    System.out.println("Initially: " + myLinkedList);

    // Adding element between 34 and 56

    myLinkedList.add(2, 77);

    System.out.println("Add between 34 and 56: " + myLinkedList);

    // Remove 3rd element

    myLinkedList.remove(3);
    System.out.println("After removing 3rd element: " + myLinkedList);

    // Refer Java Docs for all the methods

    System.out.println("Demonstrating Iterator");

    Iterator<Integer> iterate = myLinkedList.iterator();

    while (iterate.hasNext()) {
      System.out.println(iterate.next());
    }

  }
}
