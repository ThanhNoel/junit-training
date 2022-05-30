package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DependencyInjectionTests {

    @Test
    @DisplayName("You can get test method information at runtime")
    public void testMultiply(TestInfo info) {
        System.out.println("Test Information " + info);
        int four = NumberUtils.multiply(2, 2);
        assertEquals(4, four);
    }

    @ParameterizedTest(name = "Test {0}")
    @ValueSource(ints = {-2, 0, 2, 4, 6, 8, 10})
    @DisplayName("Use TestReporter to push addition data to report")
    public void testEvenNumber(int number, TestReporter testReporter) {
        boolean isEvenNumber = NumberUtils.isEven(number);
        assertTrue(isEvenNumber);
        testReporter.publishEntry("Value " + number);
    }
}
