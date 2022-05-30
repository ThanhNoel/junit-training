package junit4.api.testcase;

import junit5.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * introduced from junit 4
 */
public class TestCaseJunit4StyleTests {

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
