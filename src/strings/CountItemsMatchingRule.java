package strings;

import java.util.List;
import java.util.Objects;

/**
 * Задача на leetcode - 1773. Count Items Matching a Rule
 *
 * @see <a href="https://leetcode.com/problems/count-items-matching-a-rule/description/">1773. Count Items Matching a Rule</a>
 */
public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int foundedIndex = 0;
        int count = 0;
        if (Objects.equals(ruleKey, "type")) foundedIndex = 0;
        else if (Objects.equals(ruleKey, "color")) foundedIndex = 1;
        else if (Objects.equals(ruleKey, "name")) foundedIndex = 2;

        for (List<String> list : items) {
            if(Objects.equals(list.get(foundedIndex), ruleValue)) count++;
        }

        return count;
    }
}
