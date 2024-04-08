package strings;

/**
 * Задача на leetcode - 1108. Defanging an IP Address
 * @see <a href="https://leetcode.com/problems/defanging-an-ip-address/description/">1108. Defanging an IP Address</a>
 */
public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
