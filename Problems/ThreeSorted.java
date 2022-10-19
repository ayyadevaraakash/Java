import java.util.ArrayList;

public class ThreeSorted {
  public static void main(String[] args) {
    int[] arr1 = { 10, 30, 40, 60, 90 };
    int[] arr2 = { 5, 20, 25, 30, 40 };
    int[] arr3 = { 10, 20, 30, 40, 90 };

    int i = 0, j = 0, k = 0;
    ArrayList<Integer> myList = new ArrayList<>();

    while (i < arr1.length && j < arr2.length && k < arr3.length) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        myList.add(arr1[i]);
        i++;
        j++;
        k++;
      } else if (arr1[i] < arr2[j])
        i++;
      else if (arr2[j] < arr3[k])
        j++;
      else
        k++;

      // to tackle repetition
      while (arr1[i] == arr1[i - 1])
        i++;
      while (arr2[j] == arr2[j - 1])
        j++;
      while (arr3[k] == arr3[k - 1])
        k++;

    }

    System.out.println(myList);

  }
}
