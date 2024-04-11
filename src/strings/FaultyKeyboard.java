package strings;

/**
 * Задача на leetcode - 2810. Faulty Keyboard
 *
 * @see <a href="https://leetcode.com/problems/faulty-keyboard/">2810. Faulty Keyboard</a>
 */
public class FaultyKeyboard {
    public static String finalString(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i') res.reverse();
            else res.append(chars[i]);
        }
        return res.toString();
    }
}
