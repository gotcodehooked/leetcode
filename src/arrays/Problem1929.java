package src.arrays;

public class Problem1929 {
    //https://leetcode.com/problems/concatenation-of-array/description/
    public static void main(final String[] args) {
        final int[] nums = new int[]{1, 2, 1};
    }

    public static int[] getConcatenation(final int[] nums) {
        final int lenght = nums.length;
        final int[] ans = new int[lenght * 2];
        if (1 <= lenght && lenght < 1000) {
            for (int i = 0; i < nums.length; i++) {
                if (1 <= nums[i] && nums[i] <= 1000) {
                    ans[i] = nums[i];
                    ans[i + lenght] = nums[i];
                }
            }
        }
        return ans;
    }
}
