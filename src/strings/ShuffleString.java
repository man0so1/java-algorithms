package strings;

import java.util.Arrays;

/**
 * Задача на leetcode - 1528. Shuffle String
 *
 * @see <a href="https://leetcode.com/problems/shuffle-string/description/">1528. Shuffle String</a>
 */
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        char[] str = s.toCharArray();
        for (int i = 0; i < indices.length; i++)
            res[indices[i]] = str[i];
        return new String(res);
    }
}
