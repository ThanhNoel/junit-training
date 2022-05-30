package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTestNested {
	
	@Nested
    @DisplayName("Test add method")
    public class TestAddMethodOfMathUtils {
		private MathUtils m;
		@BeforeEach
		public void setup() {
			m = new MathUtils();
		}
        @Test
        public void testAdd1() {
            assertEquals(2, m.add(1, 0));
        }
        @Test
        public void testAdd2() {
        	assertEquals(1, m.add(1, 0));
        }
    }

	@Nested
    @DisplayName("Test multiply method")
    public class TestMultiplyMethodOfMathUtils {
		private MathUtils m;
		@BeforeEach
		public void setup() {
			m = new MathUtils();
		}
        @Test
        public void testMult1() {
            assertEquals(1, m.multiply(1, 1));
        }
        @Test
        public void testMult2() {
        	assertEquals(6, m.multiply(2, 3));
        }
    }


}
