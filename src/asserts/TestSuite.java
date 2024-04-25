package asserts;

import asserts.tests.ConvertTheTemperatureTest;
import asserts.tests.CountNegativeNumbersInSortedMatrixTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConvertTheTemperatureTest.class,
        CountNegativeNumbersInSortedMatrixTest.class
})
public class TestSuite {
}
