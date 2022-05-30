package junit4.api.testcase.interitance;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;


public class TestCaseJunit4StyleChildClassTests extends TestCaseJunit4StyleParentClassTests {
	
	@Before
	public void setUp() {
		System.out.println("SetUp Child....");
	}
	
	@Test
	public void testEqualTwoListInSameOrder() {
		System.out.println("testEqualTwoListInSameOrder....");
		List<String> first = Arrays.asList("a","b","c");
		List<String> second = Arrays.asList("a","b","c");
		assertThat(first, is(equalTo(second)));
	}
	
	@After	
	public void tearDown() {
		System.out.println("TearDown Child....");
	}

}
