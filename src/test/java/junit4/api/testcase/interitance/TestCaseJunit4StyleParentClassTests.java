package junit4.api.testcase.interitance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCaseJunit4StyleParentClassTests {
	@Before
	public void setUp() {
		System.out.println("SetUp Parent....");
	}
	@Test
	public void testEqualTwoListInAnyOrder() {
		System.out.println("testEqualTwoListInAnyOrder....");
		List<String> first = Arrays.asList("a","b","c");
		List<String> second = Arrays.asList("a","c","b");
		assertThat(first, is(containsInAnyOrder(second)));
	}
	
	@After	
	public void tearDown() {
		System.out.println("TearDown Parent....");
	}
}
