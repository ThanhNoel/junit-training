package junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4StateOfATestMethodTests {

    @DisplayName("Ignored occurs when the test isn't able to run because it does not satisfy a condition")
    @Disabled
    @Test
    public void testIgnored() {
//		Assumptions.assumeTrue(1 == 0);
        assertEquals(1, 1);
    }

    @DisplayName("Error occurs when the test is enabled, has an unexpected exception (not AssertionError)")
    @Test
    public void testError() {
        assertEquals(1, 1 / 0);
    }


    @DisplayName("Passed occurs when the test is enabled, has no errors")
    @Test
    public void testPassed() {
        assertEquals(1, 1);
    }

    @DisplayName("Failed occurs when the test is enabled and throw an AssertionError")
    @Test
    public void testFailed() {
        assertEquals(1, 0);
    }
}
