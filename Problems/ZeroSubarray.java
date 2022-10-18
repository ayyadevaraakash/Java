// Problem: https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

import java.util.HashMap;

public class ZeroSubarray {
  public static void main(String[] args) {
    int sum = 0;
    boolean flag = false;
    int[] nums = { 2, 4, 6, 7, -2, -1, 1 };

    HashMap<Integer, Integer> myMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      sum += nums[i];

      if (myMap.get(sum) == null)
        myMap.put(sum, 1);
      else
        myMap.put(sum, myMap.get(sum) + 1);

      if (myMap.get(sum) > 1 || sum == 0) {
        flag = true;
        break;
      }

    }

    if (flag)
      System.out.println("Zero Subarray exists");
    else
      System.out.println("Zero Subarray does not exist");

  }
}
