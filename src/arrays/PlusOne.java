package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { digits[i] += 1; return digits; }
            if (digits[i] == 9) digits[i] = 0;
        }
        int[] res = Arrays.copyOf(digits, digits.length + 1);
        res[0] = 1;

        return res;
    }
}
