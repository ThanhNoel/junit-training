package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTests {

    @Test
    @DisplayName("Assert Equals Success")
    public void testAssertEqualsSuccess() {
        assertEquals(1, 2);
        assertEquals(4, NumberUtils.multiply(2, 2));

    }


    @Test
    @DisplayName("Assert equals fail with message")
    public void testAssertEqualsFailWithMessage() {
        assertEquals(2, NumberUtils.multiply(2, 2), "Two values are not equals");
    }


    @Test
    @DisplayName("Test assert exception")
    public void testAssertDoesThrowException() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> NumberUtils.divide(10, 0)
        );
        assertEquals("/ by zero", ex.getMessage());
    }

    @Test
    @DisplayName("Test assert does not throw exception")
    public void testAssertDoesNotThrowException() {
        Double five = assertDoesNotThrow(
                () -> NumberUtils.divide(10, 2), "Message when fail"
        );
        assertEquals(5, five);
    }


    @Test
    @DisplayName("Test grouped assertion")
    public void testGroupedAssertion() {
        assertAll(
                () -> assertEquals(2, NumberUtils.divide(4, 2)),
                () -> assertThrows(ArithmeticException.class, () -> NumberUtils.divide(2, 0)),
                () -> assertDoesNotThrow(() -> NumberUtils.divide(2, 1))
        );
    }

    @Test
    @DisplayName("Return all failure assertions instead of the first one")
    public void testGroupedAssertionMultipleFailure() {
        assertAll("grouped",
                () -> assertEquals(1, NumberUtils.divide(4, 2), "Not equals"),
                () -> assertDoesNotThrow(() -> NumberUtils.divide(2, 0), "Divide by zero"),
                () -> assertDoesNotThrow(() -> NumberUtils.divide(2, 1))
        );
    }


}
