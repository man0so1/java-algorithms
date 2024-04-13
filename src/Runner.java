import arrays.NumberOfLaserBeamsInBank;
import arrays.TimeNeededToBuyTickets;
import asserts.Assert;
import strings.*;


public class Runner {
    public static void main(String[] args) {
        // 1108. Defanging an IP Address
        System.out.println("--- 1108. Defanging an IP Address ---");
        Assert.print("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));

        // 2011. Final Value of Variable After Performing Operations
        System.out.println("--- 2011. Final Value of Variable After Performing Operations ---");
        Assert.print(1, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assert.print(3, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        Assert.print(0, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));

        // 771. Jewels and Stones
        System.out.println("--- 771. Jewels and Stones ---");
        Assert.print(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.print(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));

        // 1678. Goal Parser Interpretation
        System.out.println("--- 1678. Goal Parser Interpretation ---");
        Assert.print("Goal", GoalParserInterpretation.interpret("G()(al)"));
        Assert.print("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
        Assert.print("alGalooG", GoalParserInterpretation.interpret("(al)G(al)()()G"));

        // 2073. Time Needed to Buy Tickets
        System.out.println("--- 2073. Time Needed to Buy Tickets ---");
        Assert.print(6, TimeNeededToBuyTickets.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
        Assert.print(8, TimeNeededToBuyTickets.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
        Assert.print(4, TimeNeededToBuyTickets.timeRequiredToBuy(new int[]{1, 2, 3}, 1));

        // 1221. Split a String in Balanced Strings
        System.out.println("--- 1221. Split a String in Balanced Strings ---");
        Assert.print(4, SplitStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
        Assert.print(2, SplitStringInBalancedStrings.balancedStringSplit("RLRRRLLRLL"));
        Assert.print(1, SplitStringInBalancedStrings.balancedStringSplit("LLLLRRRR"));

        // 2114. Maximum Number of Words Found in Sentences
        System.out.println("--- 2114. Maximum Number of Words Found in Sentences ---");
        Assert.print(6, MaximumNumberOfWordsFoundInSentences.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        Assert.print(3, MaximumNumberOfWordsFoundInSentences.mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));

        // 1816. Truncate Sentence
        System.out.println("--- 1816. Truncate Sentence ---");
        Assert.print("Hello how are you", TruncateSentence.truncateSentence("Hello how are you Contestant", 4));
        Assert.print("What is the solution", TruncateSentence.truncateSentence("What is the solution to this problem", 4));

        // 1528. Shuffle String
        System.out.println("--- 1528. Shuffle String ---");
        Assert.print("leetcode", ShuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));

        // 2108. Find First Palindromic String in the Array
        System.out.println("--- 2108. Find First Palindromic String in the Array ---");
        Assert.print("ada", FindFirstPalindromicStringInTheArray.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));

        // 1614. Maximum Nesting Depth of the Parentheses
        System.out.println("--- 1614. Maximum Nesting Depth of the Parentheses ---");
        Assert.print(3, MaximumNestingDepthOfTheParentheses.maxDepth("(1+(2*3)+((8)/4))+1"));

        // 709. To Lower Case
        System.out.println("--- 709. To Lower Case ---");
        Assert.print("hello", ToLowerCase.toLowerCase("Hello"));

        // 2810. Faulty Keyboard
        System.out.println("--- 2810. Faulty Keyboard ---");
        Assert.print("rtsng", FaultyKeyboard.finalString("string"));

        // 557. Reverse Words in a String III
        System.out.println("--- 557. Reverse Words in a String III ---");
        Assert.print("s'teL ekat edoCteeL tsetnoc", ReverseWordsinStringIII.reverseWords("Let's take LeetCode contest"));

        // 2000. Reverse Prefix of Word
        System.out.println("--- 2000. Reverse Prefix of Word ---");
        Assert.print("dcbaefd", ReversePrefixOfWord.reversePrefix("abcdefd", 'd'));

        // 2125. Number of Laser Beams in a Bank
        System.out.println("--- 2125. Number of Laser Beams in a Bank ---");
        Assert.print(8, NumberOfLaserBeamsInBank.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));

        // 1812. Determine Color of a Chessboard Square
        System.out.println("--- 1812. Determine Color of a Chessboard Square ---");
        System.out.println(DetermineColorOfChessboardSquare.squareIsWhite("a1"));

        // 2129. Capitalize the Title
        System.out.println("--- 2129. Capitalize the Title ---");
        Assert.print("Capitalize The Title", CapitalizeTheTitle.capitalizeTitle("capiTalIze tHe TitLe"));
        Assert.print("First Letter of Each Word", CapitalizeTheTitle.capitalizeTitle("First leTTeR of EACH Word"));
    }
}
