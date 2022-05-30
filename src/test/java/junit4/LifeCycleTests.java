package junit4;


import junit5.StringUtils;
import org.junit.*;
import org.junit.experimental.categories.Category;

import junit4.api.category.TestMac;

import static org.junit.Assert.assertTrue;

@Category(value = TestMac.class)
public class LifeCycleTests {
    private static int count = 0;

    public LifeCycleTests() {
        System.out.println("Count: " + ++count);
    }

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Before class");
    }

    @Before
    public void setUp() {
        System.out.println("Before each test method");
    }


    @Test
    public void testInvalidMacAddress01() {

        String invalidMAC = "01-00-AA-FF-00-ZZ";

        System.out.println("Test invalid MAC : " + invalidMAC);

        boolean isValidMac = StringUtils.isValidMACAddress(invalidMAC);

        Assert.assertFalse(isValidMac);
    }

    @Test
    public void testSecondMethod() {

        System.out.println("In test method 2");

        String MAC = "d4-9a-a0-54-3a-10";

        boolean isValidMac = StringUtils.isValidMACAddress(MAC);

        assertTrue(isValidMac);
    }

    @After
    public void tearDown() {
        System.out.println("After each test method");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("After class");
    }
}
