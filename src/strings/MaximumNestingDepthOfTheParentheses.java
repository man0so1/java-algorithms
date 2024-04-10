package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача на leetcode - 1614. Maximum Nesting Depth of the Parentheses
 *
 * @see <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/">1614. Maximum Nesting Depth of the Parentheses</a>
 */
public class MaximumNestingDepthOfTheParentheses {
    public static int maxDepth(String s) {
        int depth = 0; int maxDepth = 0;
        char[] c = s.toCharArray();
        for (Character el : c) {
            if (el == '(') { depth += 1; if (maxDepth < depth) maxDepth = depth; }
            else if (el == ')') depth -= 1;
        }

        return maxDepth;
    }
}
