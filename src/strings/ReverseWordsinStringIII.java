package strings;

public class ReverseWordsinStringIII {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.split(" ");
        for (String sl : split) {
             res.append(new StringBuilder(sl).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}
