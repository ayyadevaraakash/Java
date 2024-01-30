import java.util.Arrays;

public class HeapSort {
    static void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

    static void heapify(int[] nums, int len, int start) {
        int leftChild = 2 * start + 1;
        int rightChild = 2 * start + 2;
        int larger = start;

        if (leftChild < len && nums[leftChild] > nums[larger]) {
            larger = leftChild;
        }

        if (rightChild < len && nums[rightChild] > nums[larger]) {
            larger = rightChild;
        }

        if (larger == start)
            return;
        swap(nums, start, larger);
        heapify(nums, len, larger);
    }

    public static void main(String[] args) {
        int[] nums = { 10, 2, 5, 31, 13, 51 };
        int len = nums.length;

        // Build Heap
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(nums, len, i);
        }

        // Sort
        for (int i = len - 1; i > 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }

        System.out.println(Arrays.toString(nums));
    }
}
