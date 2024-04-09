package strings;

import java.util.Arrays;

/**
 * Задача на leetcode - 1678. Goal Parser Interpretation
 *
 * @see <a href="https://leetcode.com/problems/goal-parser-interpretation/description/">1678. Goal Parser Interpretation</a>
 */
public class GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder res = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') res.append("G");
            else if (chars[i] == '(' && chars[i+1] == ')'){
                res.append("o");
                i += 1;
            } else if(chars[i] == '(' && chars[i+1] == 'a') {
                res.append("al");
                i += 3;
            }
        }

        return res.toString();
    }
}
