package strings;

/**
 * Задача на leetcode - 2114. Maximum Number of Words Found in Sentences
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/">2114. Maximum Number of Words Found in Sentences</a>
 */
public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String words : sentences) {
            String[] split = words.split(" ");
            if (max < split.length) max = split.length;
        }

        return max;
    }
}
