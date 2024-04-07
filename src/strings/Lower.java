package strings;

import java.util.Arrays;

public class Lower {
    public static String toLowerCase(String str) {
        if (str.isEmpty()) return "";

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i]) && Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
