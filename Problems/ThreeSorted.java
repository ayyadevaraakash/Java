import java.util.ArrayList;

public class ThreeSorted {
  public static void main(String[] args) {
    int[] arr1 = { 10, 30, 40, 60, 90 };
    int[] arr2 = { 5, 10, 20, 30, 40 };
    int[] arr3 = { 10, 20, 30, 40, 90 };

    int i = 0, j = 0, k = 0;
    ArrayList<Integer> myArrayList = new ArrayList<>();

    while (i < arr1.length && j < arr2.length && k < arr3.length) {

      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        if (myArrayList.isEmpty() || myArrayList.get(myArrayList.size() - 1) != arr1[i]) {
          myArrayList.add(arr1[i]);
          i++;
          j++;
          k++;
        }
      } else if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) {
        i++;
      } else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) {
        j++;
      } else {
        k++;
      }

    }

    System.out.println(myArrayList);

  }
}
