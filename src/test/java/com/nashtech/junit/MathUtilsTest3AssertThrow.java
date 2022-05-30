package com.nashtech.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest3AssertThrow {

	@Test
	void testDivideMustThrowException() {
		MathUtils m = new MathUtils();
		ArithmeticException exceptionThrown = assertThrows(ArithmeticException.class, () -> m.divide(100, 0));
		System.out.println("arithmetic exception mesage is " + exceptionThrown.getMessage());
	}

	@Test
	void testDivideMustThrowException2() {
		MathUtils m = new MathUtils();
		IllegalArgumentException exceptionThrown = assertThrows(IllegalArgumentException.class, () -> m.divide(100, 2));
		assertEquals("Not accepting divide by 2", exceptionThrown.getMessage(),
				() -> "divide by 2 must throw correct exception");
	}

}
