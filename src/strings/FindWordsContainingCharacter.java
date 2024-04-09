package strings;

import java.util.*;

/**
 * Задача на leetcode - 2942. Find Words Containing Character
 *
 * @see <a href="https://leetcode.com/problems/find-words-containing-character/description/">2942. Find Words Containing Character</a>
 */
public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        int index = 0;
        for (String str : words) {
            if(str.indexOf(x) != -1) list.add(index);
            index++;
        }

        return list;
    }
}
