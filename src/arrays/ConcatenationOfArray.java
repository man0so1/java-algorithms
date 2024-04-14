package arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] nnums = new int[nums.length * 2];
        System.arraycopy(nums,0, nnums, 0, nums.length);
        System.arraycopy(nums, 0, nnums, nums.length, nums.length);
        return nnums;
    }
}
