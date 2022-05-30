package com.nashtech.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MathUtilsTest4StatusesOfTestCase {

	@Test
	public void testAdd() {
		System.out.println("This test will fail");
		fail("Not yet implemented");
	}

	@Test
	public void testAdd2() throws Exception {
		System.out.println("This test will throw exception");
		throw new Exception("Test exception");
	}

	@Test
	public void testAdd3() throws Exception {
		System.out.println("This test passes intentionally");
	}

	@Test
	@Disabled("Skipped until bug related to mathutils.add is fixed")
	public void testDivide() {
		MathUtils m = new MathUtils();
		assertEquals(2, m.add(1, 1));
		System.out.println("This test is ignored. This line is not printed");
	}

}
