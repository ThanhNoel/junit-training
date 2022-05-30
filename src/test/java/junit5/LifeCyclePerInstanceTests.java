package junit5;

import org.junit.jupiter.api.*;

/**
 * Declare @BeforeAll , @AfterAll without static modifier
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifeCyclePerInstanceTests {
    private static int count = 0;

    public LifeCyclePerInstanceTests() {
        System.out.println("Count " + ++count);
    }

    @BeforeAll
    public void beforeAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test method");
    }

    @Test
    public void testFirstMethod1() {
        System.out.println("In test method 1");
    }

    @Test
    public void testFirstMethod2() {
        System.out.println("In test method 2");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test method");
    }

    @AfterAll
    public void afterAll() {
        System.out.println("After all");
    }
}
