import asserts.Assert;
import strings.DefangingAnIPAddress;
import strings.FinalValueOfVariableAfterPerformingOperations;

public class Runner {
    public static void main(String[] args) {
        // 1108. Defanging an IP Address
        Assert.print("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));

        // 2011. Final Value of Variable After Performing Operations
        Assert.print(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"--X","X++","X++"}));
        Assert.print(3, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"++X","++X","X++"}));
        Assert.print(0, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"X++","++X","--X","X--"}));
    }
}
