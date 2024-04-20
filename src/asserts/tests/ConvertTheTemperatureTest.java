package asserts.tests;

import asserts.Assertable;
import math.ConvertTheTemperature;
import org.junit.Assert;
import org.junit.Test;

public class ConvertTheTemperatureTest implements Assertable {
    @Override @Test
    public void solution() {
        Assert.assertArrayEquals(
                new double[] {309.65000,97.70000},
                ConvertTheTemperature.convertTemperature(36.50),
                0);
    }
}
