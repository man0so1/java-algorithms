import asserts.strings.Assert;
import strings.DefangingAnIPAddress;

public class Runner {
    public static void main(String[] args) {
        Assert.print("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));
    }
}
