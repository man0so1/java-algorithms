package strings;

import java.util.Arrays;

public class CapitalizeTheTitle {
    public static String capitalizeTitle(String title) {
        String[] split = title.toLowerCase().split(" ");
        StringBuilder res = new StringBuilder();

        for (String s : split) {
            if (s.length() <= 2) {  res.append(s).append(" "); continue; }
            char t = s.charAt(0);
            res.append(Character.toUpperCase(t)).append(s.substring(1)).append(" ");
        }

        return res.toString().trim();
    }
}
