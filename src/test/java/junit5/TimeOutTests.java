package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeOutTests {

    @Test
    @Timeout(value = 2)
    @DisplayName("Timeout exceed 2 seconds with annotation")
    public void testTimeOutExceedWithAnnotation() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(1, 1);
    }


    @Test
    @DisplayName("Timeout exceed 2 seconds with assertion")
    public void testTimeoutExceedWithAssertion() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            // perform task that take less than 2 seconds
            Thread.sleep(3000);
        });
    }
}
