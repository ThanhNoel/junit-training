package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest2AssertAll {

	@Test
	void testAdd() {
		MathUtils m = new MathUtils();
		assertAll(() -> assertEquals(2, m.add(1, 1), () -> "1 plus 1 must be 2")
				, () -> assertEquals(5, m.add(2, 3), () -> "2 plus 3 must be 5"));
	}
	
	@Test
	void testAddFail() {
		MathUtils m = new MathUtils();
		assertAll(() -> assertEquals(3, m.add(1, 1), () -> "1 plus 1 must be 3")
				, () -> assertEquals(5, m.add(2, 3), () -> "2 plus 3 must be 5")
				, () -> assertEquals(7, m.add(7, 3), () -> "7 plus 3 must be 7"));
	}

}
