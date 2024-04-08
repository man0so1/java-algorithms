package strings;

/**
 * Задача на leetcode - 2011. Final Value of Variable After Performing Operations
 *
 * @see <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/">2011. Final Value of Variable After Performing Operations</a>
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("++")) x++;
            else if (operation.contains("--")) x--;
        }
        return x;
    }
}
