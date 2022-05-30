package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest5DisplayName {

	@Test
	@DisplayName("Test 1 + 1")
	void when_addTwoInteger_and_input1And1_thenReturn2() {
		MathUtils m = new MathUtils();
		assertEquals(2, m.add(1, 1));
	}
	@Test
	@DisplayName("Test 2 + 2")
	void testAdd2() {
		MathUtils m = new MathUtils();
		assertEquals(4, m.add(2, 2));
	}

}
