package strings;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        StringBuilder strToSwap = new StringBuilder();
        char[] wcs = word.toCharArray();
        boolean firstMeet = false;
        for (char wc : wcs) {
            if (wc == ch && !firstMeet) { strToSwap.append(wc); strToSwap.reverse(); firstMeet = true; }
            else strToSwap.append(wc);
        }
        return strToSwap.toString();
    }
}
