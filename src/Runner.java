import arrays.*;
import asserts.Assert;
import math.HarshadNumber;
import math.Maximum69Number;
import strings.*;

import java.util.ArrayList;
import java.util.Arrays;

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

        // 3042. Count Prefix and Suffix Pairs I
        System.out.println("--- 3042. Count Prefix and Suffix Pairs I ---");
        Assert.print(4, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
        Assert.print(2, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"}));
        Assert.print(0, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(new String[]{"abab", "ab"}));

        // 1512. Number of Good Pairs
        System.out.println("--- 1512. Number of Good Pairs ---");
        Assert.print(4, NumberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));

        // 1672. Richest Customer Wealth
        System.out.println("--- 1672. Richest Customer Wealth ---");
        Assert.print(6, RichestCustomerWealth.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));

        // 2798. Number of Employees Who Met the Target
        System.out.println("--- 2798. Number of Employees Who Met the Target ---");
        Assert.print(3, NumberEmployeesWhoMetTheTarget.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));

        // 11. Container With Most Water
        System.out.println("--- 11. Container With Most Water ---");
        Assert.print(49, ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.print(1, ContainerWithMostWater.maxArea(new int[]{1, 2}));
        Assert.print(4, ContainerWithMostWater.maxArea(new int[]{1, 2, 4, 3}));

        // 26. Remove Duplicates from Sorted Array
        System.out.println("--- 26. Remove Duplicates from Sorted Array ---");
        Assert.print(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));

        // 2824. Count Pairs Whose Sum is Less than Target
        System.out.println("--- 2824. Count Pairs Whose Sum is Less than Target ---");
        Assert.print(3, CountPairsWhoseSumLessThanTarget.countPairs(new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1)), 2));

        // 3099. Harshad Number
        System.out.println("--- 3099. Harshad Number ---");
        Assert.print(9, HarshadNumber.sumOfTheDigitsOfHarshadNumber(18));
        Assert.print(-1, HarshadNumber.sumOfTheDigitsOfHarshadNumber(23));

        // 1323. Maximum 69 Number
        System.out.println("--- 1323. Maximum 69 Number ---");
        Assert.print(9969, Maximum69Number.maximum69Number(9669));

        // 1351. Count Negative Numbers in a Sorted Matrix
        System.out.println("--- 1351. Count Negative Numbers in a Sorted Matrix ---");
        Assert.print(8,
                CountNegativeNumbersInSortedMatrix.countNegatives(
                        new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}
                )
        );

        // TODO написать настройку работы github actions для тестирований новых решений
    }
}
