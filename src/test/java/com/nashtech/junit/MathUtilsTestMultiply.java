package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTestMultiply {

	@Test
	void testMultiply() {
		MathUtils m = new MathUtils();
		assertAll(
				() -> assertEquals(1, m.multiply(1, 1)),
				() -> assertEquals(4, m.multiply(2, 2)),
				() -> assertEquals(9, m.multiply(3, 3)),
				() -> assertEquals(16, m.multiply(4, 4))
				);
	}

}
