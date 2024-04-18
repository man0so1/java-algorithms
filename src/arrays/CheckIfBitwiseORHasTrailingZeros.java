package arrays;

public class CheckIfBitwiseORHasTrailingZeros {
    public static boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) count++;
        }
        return count >= 2;
    }
}
