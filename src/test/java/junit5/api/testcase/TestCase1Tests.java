package junit5.api.testcase;

import junit.framework.TestCase;
import junit5.NumberUtils;

/**
 * introduced from junit 3
 */
public class TestCase1Tests extends TestCase {
	@Override
	protected void setUp() {
		System.out.println("Setting up........");
	}

	@Override
	protected void tearDown() {
		System.out.println("Tearing down....");
	}

	// the test method is always start with test
	public void testAddTwoNumber() {
		System.out.println("testAddTwoNumber in....");
		int a = 2;
		int b = 1;
		assertEquals(3, NumberUtils.add(a, b));
	}

	// not valid test method - not start with 'test' prefix
	public void subtractTwoNumber() {
		System.out.println("subtractTwoNumber in....");
		int a = 2;
		int b = 1;
		assertEquals(1, NumberUtils.subtract(a, b));
	}
}
