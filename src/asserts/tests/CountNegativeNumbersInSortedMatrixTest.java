package asserts.tests;

import arrays.CountNegativeNumbersInSortedMatrix;
import asserts.Assertable;
import org.junit.Assert;
import org.junit.Test;

public class CountNegativeNumbersInSortedMatrixTest implements Assertable {
    @Override @Test
    public void solution() {
        Assert.assertEquals(8, CountNegativeNumbersInSortedMatrix.countNegatives(
                new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}
        ));
    }
}
