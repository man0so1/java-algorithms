package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * so terrible D:
 */
public class SplitStringsBySeparator {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            if (!res.isEmpty()) res.append(" ");
            char[] wcs = word.toCharArray();
            for (char wc : wcs) {
                if (wc == separator && res.isEmpty()) continue;
                else if (wc == separator && res.charAt(res.length() - 1) != ' ') res.append(" ");
                else if (wc == separator) continue;
                else res.append(wc);
            }

            res = new StringBuilder(res.toString().trim());
        }

        if (res.isEmpty()) return new ArrayList<>();
        return Arrays.asList(res.toString().split(" "));
    }
}
