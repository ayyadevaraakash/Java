// Problem: https://leetcode.com/problems/majority-element/

public class MooreVoting {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 3, 3 };
    int majorityElement = arr[0], count = 0;

    for (int i : arr) {
      if (count == 0)
        majorityElement = i;
      if (i == majorityElement)
        count++;
      else
        count--;
    }

    System.out.println("Majority Element: " + majorityElement);
  }
}

// Logic

/*
 * Solved using Moore's Voting Algorithm
 */