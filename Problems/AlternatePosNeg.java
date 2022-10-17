import java.util.Arrays;

class AlternatePosNeg {
    public static void main(String[] args) {
        int[] nums = { 6, 7, -4, 1, -9, -2, -3, 11 };
        int[] auxiliary = new int[nums.length];
        int positive = 0, negative = 1;

        for (int i = 0; i < nums.length; i++)
            auxiliary[i] = nums[i];

        for (int i = 0; i < nums.length; i++) {
            if (auxiliary[i] > 0) {
                nums[positive] = auxiliary[i];
                positive += 2;
            } else {
                nums[negative] = auxiliary[i];
                negative += 2;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
