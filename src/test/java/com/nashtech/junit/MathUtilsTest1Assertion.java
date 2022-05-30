package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsTest1Assertion {
	
	int commonCount = 0;

	@Test
	@Tag("UAT")
	void testAddMethod() {
		commonCount++;
		MathUtils m = new MathUtils();
		assertEquals(2, m.add(1, 1));
		assertTrue(2 == m.add(1, 1));
		System.out.println(commonCount);
	}

	@Test
	@Tag("PROD")
	void testAddMethod2() {
		commonCount++;
		MathUtils m = new MathUtils();
		assertEquals(2, m.add(1, 1), "1 plus 1 must be 2");
		System.out.println(commonCount);
	}

	@Test
	void testAddMethod3() {
		commonCount++;
		MathUtils m = new MathUtils();
		assertTrue(2 == m.add(1, 1), () -> "1 and 1 is 2");
		System.out.println(commonCount);
	}

}
