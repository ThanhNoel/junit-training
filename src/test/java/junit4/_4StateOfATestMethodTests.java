package junit4;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _4StateOfATestMethodTests {
    // Ignored occurs when the test isn't able to run because it does not satisfy a condition
    @Ignore
    @Test
    public void testIgnored() {
//		Assumptions.assumeTrue(1 == 0);
        assertEquals(1, 1);
    }

    // "Error occurs when the test is enabled, has an unexpected exception (not AssertionError)
    @Test
    public void testError() {
        assertEquals(1, 1 / 0);
    }


    // Passed occurs when the test is enabled, has no errors "
    @Test
    public void testPassed() {
        assertEquals(1, 1);
    }

    // Failed occurs when the test is enabled and throw an AssertionError
    @Test
    public void testFailed() {
        assertEquals(1, 0);
    }
}
