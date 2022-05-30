package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionTests {

    @Test
    @DisplayName("This step will be run if system timezone is Asia/Bangkok")
    public void testAssumption() {
        String systemTimeZone = ZoneId.systemDefault().toString();
        assumeTrue("Asia/Bangkok".equals(systemTimeZone), "Cannot run in " + ZoneId.systemDefault());
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("This step will be run if system timezone is UTC")
    public void testAssumptionUTC() {
        String systemTimeZone = ZoneId.of("UTC").toString();
        assumeTrue("Asia/Bangkok".equals(systemTimeZone), "Cannot run in " + ZoneId.systemDefault());
        assertEquals(1, 1);
    }
}
