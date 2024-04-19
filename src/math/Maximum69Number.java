package math;

public class Maximum69Number {
    public static int maximum69Number (int num) {
        char[] cn = String.valueOf(num).toCharArray();
        for (int i = 0; i < cn.length; i++) {
            if (cn[i] == '6') { cn[i] = '9'; break; }
        }
        return Integer.parseInt(new String(cn));
    }
}
