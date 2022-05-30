package junit5;

import junit5.support.CustomerMethodOrder;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodOrderTests {

    @Nested
    @DisplayName("Test methods are run by Numeric order")
    @TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
    public class TestMethodOrderAnnotationOrderTests {

        @Test
        @Order(2)
        public void testMethod02() {
            assertEquals(1, 1);
        }

        @Test
        @Order(3)
        public void testMethod01() {
            assertEquals(1, 1);
        }

        @Order(1)
        @Test
        public void testMethod03() {
            assertEquals(1, 1);
        }
    }


    @Nested
    @DisplayName("Test methods are run by Display name order (ASC)")
    @TestMethodOrder(value = MethodOrderer.DisplayName.class)
    public class TestMethodOrderDisplayNameTests {

        @Test
        @DisplayName("Method 1")
        public void testMethodA() {
            assertEquals(1, 1);
        }

        @Test
        @DisplayName("Method 2")
        public void testMethodC() {
            assertEquals(1, 1);
        }

        @Test
        @DisplayName("Method 3")
        public void testMethodB() {
            assertEquals(1, 1);
        }
    }


    @Nested
    @DisplayName("Test methods are run by Method name order (ASC)")
    @TestMethodOrder(value = MethodOrderer.MethodName.class)
    public class TestMethodOrderMethodNameTests {

        @Test
        public void testMethodA() {
            assertEquals(1, 1);
        }

        @Test
        public void testMethoda() {
            assertEquals(1, 1);
        }

        @Test
        public void testMethodB() {
            assertEquals(1, 1);
        }
    }

    @Nested
    @DisplayName("Test methods are run by Method name ignore case order")
    @TestMethodOrder(value = CustomerMethodOrder.class)
    public class TestMethodOrderIgnoreCaseTests {
        @Test
        public void testMethodA() {
            assertEquals(1, 1);
        }

        @Test
        public void testMethoda() {
            assertEquals(1, 1);
        }

        @Test
        public void testMethodB() {
            assertEquals(1, 1);
        }
    }

}
