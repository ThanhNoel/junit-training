package junit4.api.testcase.interitance;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import org.junit.After;
import org.junit.Before;


import junit.framework.TestCase;

import static org.hamcrest.Matchers.*;


// Cannot extends TestCaseJunit3StyleParentClassTests 
// because can only extends 1 another class.
public class TestCaseJunit3StyleChildClassTests extends TestCase {
	
	@Before
	public void setUp() {
		System.out.println("SetUp Child....");
	}
		
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
