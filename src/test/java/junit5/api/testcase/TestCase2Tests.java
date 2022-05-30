package junit5.api.testcase;

import junit5.NumberUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * introduced from junit 4
 */
public class TestCase2Tests {

    @Test
    public void testAddTwoNumber() {
        int a = 2;
        int b = 1;
        assertEquals(3, NumberUtils.add(a, b));
    }

    @Test
    public void testSubtractTwoNumber() {
        int a = 2;
        int b = 1;
        assertEquals(1, NumberUtils.subtract(a, b));
    }
}
