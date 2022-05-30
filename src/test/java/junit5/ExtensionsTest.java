package junit5;

import junit5.support.LoggingExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({LoggingExtension.class})
public class ExtensionsTest {
    @Test
    public void testAdd2Numbers() {
        System.out.println("testAdd2Numbers running....");
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    public void testSubtract2Numbers() {
        System.out.println("testSubtract2Numbers running....");
        Assertions.assertEquals(0, 2 - 2);
    }
}
