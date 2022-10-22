import java.util.Arrays;

class MedianOfSorted {
  public static void main(String[] args) {
    int[] arr1 = { 12, 15, 18, 19, 25 };
    int[] arr2 = { 11, 17, 19, 34, 45 };
    int[] myArray = new int[arr1.length + arr2.length];
    int counter = 0;
    int median;

    for (int i = 0; i < arr1.length; i++, counter++)
      myArray[counter] = arr1[i];

    for (int i = 0; i < arr2.length; i++, counter++)
      myArray[counter] = arr2[i];

    Arrays.sort(myArray);

    if (myArray.length % 2 == 0)
      median = (myArray[myArray.length / 2] + myArray[myArray.length / 2 - 1]) / 2;
    else
      median = myArray[myArray.length / 2];

    System.out.println(Arrays.toString(myArray));
    System.out.println("Median is: " + median);

  }
}
