package strings;

import java.util.Arrays;

/**
 * Задача на leetcode - 1816. Truncate Sentence
 *
 * @see <a href="https://leetcode.com/problems/truncate-sentence/description/">1816. Truncate Sentence</a>
 */
public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            res.append(split[i]).append(" ");
        }

        return res.toString().trim();
    }
}
