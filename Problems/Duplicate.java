// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 4, 2, 4, 6 };
        int lengthOfNums = nums.length;
        int val = nums[0];
        for (int i = 1; i < lengthOfNums; i++)
            val ^= nums[i];
        for (int i = 1; i < lengthOfNums; i++)
            val ^= i;
        System.out.println("Repeated number is " + val);
    }
}

// EXOR with self results in zero
