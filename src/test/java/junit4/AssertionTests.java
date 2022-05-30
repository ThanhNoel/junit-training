package junit4;


import junit5.NumberUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class AssertionTests {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAssertEqualsSuccess() {
        assertEquals(1, 2);
        assertEquals(4, NumberUtils.multiply(2, 2));

    }


    @Test
    public void testAssertEquals() {
        assertEquals(new String("Abc"), new String("Abc")); // compare use equals
    }


    @Test
    public void testAssertSame() {
        assertSame(new String("Abc"), new String("Abc")); // compare use ==
    }

    @Test
    public void testAssertSame2() {
        assertSame("Abc", "Abc"); // compare use ==
    }


    @Test(expected = ArithmeticException.class)
    public void testAssertDoesThrowException() {
        NumberUtils.divide(10, 0);
    }


    @Test/*(expected = ArithmeticException.class)*/
    public void testAssertDoesThrowExceptionWithMessage() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");
        NumberUtils.divide(10, 0);
    }

    @Test
    public void testAssertDoesThrow() {
        assertThrows(ArithmeticException.class, () -> NumberUtils.divide(10, 0));
    }


    @Test(expected = Test.None.class)
    public void testAssertDoesNotThrowException() {
        double five = NumberUtils.divide(10, 2);
        assertEquals(5, five, 0);
    }
}