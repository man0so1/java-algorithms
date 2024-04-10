package strings;

import java.util.*;

public class CheckIfTheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        char[] chars = sentence.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char character : chars) {
            characterSet.add(character);
        }

        return characterSet.toArray().length == 26;
    }

    public static boolean solutionWithHashMap(String sentence) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            mp.put(sentence.charAt(i), mp.getOrDefault(sentence.charAt(i), 0) + 1);
        }

        return mp.size() == 26;
    }
}
