package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private MathUtils m;
	
	@BeforeEach
	void setup() {
		System.out.println("setting up math utils");
		m = new MathUtils();
	}
	@Test
	void testAdd() {
		assertEquals(2, m.add(1, 1), "1 plus 1 must be 2");
	}
	@Test
	void testAdd2() {
		assertTrue(3 == m.add(1, 1), () -> "1 plus 1 must be 3 but expensive");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented hehe");
	}
	
	@RepeatedTest(value = 5)
	void testRepeatedly() {
		// randomly pick a microwave
		// call device A, open and shut door
		// QUATEST1
	}

}
