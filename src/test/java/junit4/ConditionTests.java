package junit4;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;


public class ConditionTests {
	@Test
    @Ignore(value = "This method will be skipped")
    public void testWillBeSkipped() {
        assertEquals(1, 1);
    }

    @Test
    public void testWillBeSkippedForMACOs() {
    	boolean isMac = System.getProperty("os.name",  "unknown").toLowerCase().contains("mac");
    	Assume.assumeTrue(isMac);	
        assertEquals(1,1);
    }    
}
