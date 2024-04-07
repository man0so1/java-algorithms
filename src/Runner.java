import asserts.strings.Assert;
import strings.Lower;

public class Runner {
    public static void main(String[] args) {
        boolean res = Assert.assertEquals("teststring",  Lower.toLowerCase("TesTsTRinG"));
        System.out.println(res);
    }
}
