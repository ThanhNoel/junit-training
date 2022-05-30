package junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LifeCyclePerMethodTests {
    private static int count = 0;
    public LifeCyclePerMethodTests(){
        System.out.println("Count: " + ++count);
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test method");
    }


    @Test
    @Tag("TEST_MAC")
    public void testInvalidMacAddress01() {
        
        String invalidMAC = "01-00-AA-FF-00-ZZ";

        System.out.println("Test invalid MAC : " + invalidMAC);

        boolean isValidMac = StringUtils.isValidMACAddress(invalidMAC);

        assertFalse(isValidMac);
    }

    @Test
    @DisplayName("Test valid MAC")
    @Tag("TEST_MAC")
    public void testSecondMethod() {

        System.out.println("In test method 2");

        String MAC = "d4-9a-a0-54-3a-10";

        boolean isValidMac = StringUtils.isValidMACAddress(MAC);

        assertTrue(isValidMac);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test method");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }
}
