// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 4, 2, 5, 6 };
        int lengthOfNums = nums.length;
        int n = lengthOfNums - 1;
        int sumOfN = 0, sumOfInput = 0;

        for (int i = 0; i < lengthOfNums; i++)
            sumOfInput += nums[i];

        for (int i = 1; i <= n; i++)
            sumOfN += i;

        System.out.println("Duplicate number is " + (sumOfInput - sumOfN));
    }
}
