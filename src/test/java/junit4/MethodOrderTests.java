package junit4;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import junit4.api.category.TestOrder;

import static org.junit.Assert.*;

@Category(value = TestOrder.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodOrderTests {

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
