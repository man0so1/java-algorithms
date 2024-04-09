import asserts.Assert;
import strings.DefangingAnIPAddress;
import strings.FinalValueOfVariableAfterPerformingOperations;
import strings.GoalParserInterpretation;
import strings.JewelsAndStones;

public class Runner {
    public static void main(String[] args) {
        // 1108. Defanging an IP Address
        Assert.print("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));

        // 2011. Final Value of Variable After Performing Operations
        Assert.print(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"--X","X++","X++"}));
        Assert.print(3, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"++X","++X","X++"}));
        Assert.print(0, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[] {"X++","++X","--X","X--"}));

        // 771. Jewels and Stones
        Assert.print(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.print(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));

        // 1678. Goal Parser Interpretation
        Assert.print("Goal", GoalParserInterpretation.interpret("G()(al)"));
        Assert.print("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
        Assert.print("alGalooG", GoalParserInterpretation.interpret("(al)G(al)()()G"));
    }
}
