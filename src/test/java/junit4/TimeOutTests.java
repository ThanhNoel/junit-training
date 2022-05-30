package junit4;


import org.junit.Test;
import static org.junit.Assert.*;
public class TimeOutTests {
    @Test(timeout = 2)
    public void testTimeOutExceedWithAnnotation() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(1, 1);
    }
}
