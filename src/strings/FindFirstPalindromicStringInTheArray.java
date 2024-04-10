package strings;

import java.util.Arrays;
import java.util.Objects;

/**
 * Задача на leetcode - 2108. Find First Palindromic String in the Array
 *
 * @see <a href="https://leetcode.com/problems/shuffle-string/description/">2108. Find First Palindromic String in the Array</a>
 */
public class FindFirstPalindromicStringInTheArray {
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (word.contentEquals(new StringBuilder(word).reverse())) return word;
        }
        return "";
    }
}
