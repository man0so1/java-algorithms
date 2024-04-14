package strings;

import java.util.*;

public class RemoveLetterToEqualizeFrequency {
    public static List<Character> removeElement(char[] array, int index) {
        List<Character> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i != index) res.add(array[i]);
        }
        return res;
    }

    public static boolean equalFrequency(String word) {
        char[] wcs = word.toCharArray();
        for (int i = 0; i < wcs.length; i++) {
            HashMap<Character, Integer> counter = new HashMap<>();
            for (Character character : removeElement(wcs, i)) {
                counter.put(character, counter.getOrDefault(character, 0) + 1);
            }

            if (counter.values().size() == 1) return true;

            Integer prev = 0;
            boolean fm = true;
            boolean res = false;
            for (Integer value : counter.values()) {
                if (fm) { prev = value; fm =false; continue; }
                res = Objects.equals(value, prev);
                if (!res) break;
                prev = value;
            }

            if (res) return true;
        }

        return false;
    }
}
