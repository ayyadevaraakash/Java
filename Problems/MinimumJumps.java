// Problem Statement: https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

public class MinimumJumps {

  static int countJumps(int[] arr, int length) {
    int jumps = 0, storedLadder = 0, currentLadder = 0;
    for (int i = 0; i < length - 1; i++) {

      // storing ladder, checking if we already have a good ladder stored.
      if (i + arr[i] > storedLadder)
        storedLadder = i + arr[i];

      // checking if we have reached the end of current ladder. If yes, move to the
      // stored one.
      if (i == currentLadder) {
        jumps++;
        currentLadder = storedLadder;
      }

      // if we have reached the end of the current ladder and the current element is
      // 0, means we can't move forward.
      if (arr[i] == 0 && i == currentLadder) {
        return -1;
      }
    }
    return jumps;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 3, 2, 6, 7 };
    int length = arr.length;
    int jumps = countJumps(arr, length);
    if (jumps == -1)
      System.out.println("Can't jump and complete the array");
    else
      System.out.println("Need " + jumps + " jumps to reach the end");
  }
}
