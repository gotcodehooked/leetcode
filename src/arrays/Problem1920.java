package src.arrays;

public class Problem1920 {
    //https://leetcode.com/problems/build-array-from-permutation/


    public static void main(String[] args) {
        final int[] nums = {5, 0, 1, 2, 3, 4};
        final int[] ans = buildArray(nums);

    }

    public static int[] buildArray(final int[] nums) {
        // final int ans[] = new int[nums.length];
       final int value = -1;
        if (1 <= nums.length && nums.length <= 1000) {
            for (int i = 0; i < nums.length; i++) {
                if (0 <= nums[i] && nums[i] < nums.length) {


                }
            }
        }
        return nums;
    }

    public static int[] buildArray2(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            nums[i] = nums[i] + l * (nums[nums[i]] % l);
        }
        for (int i = 0; i < l; i++) {
            nums[i] = nums[i] / l;
        }
        return nums;
    }
}






