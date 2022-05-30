package junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionTests {

    @Test
    @DisplayName("This method will be skipped")
    @Disabled("This test method will be skipped")
    public void testWillBeSkipped() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("This method will be skipped for Window OS")
    @DisabledOnOs({OS.WINDOWS})
    public void testWillBeSkippedForMACOs() {
        assertEquals(1,1);
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    @DisplayName("This method will be run for MAC, WINDOW")
    public void testWillBeRunForWindowOrMacOs() {
        assertEquals(1,1);
    }


    @RepeatedTest(2)
    @EnabledIf("random")
    public void testWillBeRunIfSatisfyGivenCondition() {
        assertEquals(1,1);
    }

    public static boolean random() {
        return Math.random() >= 0.5;
    }

    @Test
    @EnabledOnJre(JRE.JAVA_9)
    @DisplayName("This method will be run on java 9 ")
    public void testWillBeRunOnJre9() {
    	System.out.println("This test runs only on Jav 9");
        assertEquals(2, 2);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_9)
    @DisplayName("This method will be run on java 8 OR java 9")
    public void testWillBeRunOnJava8OrJava9() {
    	System.out.println("This test runs only on Jav 8 or 9");
        assertEquals(1, 1);
    }

}
