package com.nashtech.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest7LifeCyclePerClass {
	
	public MathUtilsTest7LifeCyclePerClass() {
		System.out.println("*** Class instantiated ***");
	}

	@BeforeAll
	public void setUpBeforeClass() throws Exception {
		System.out.println("This runs before ALL tests");
		System.out.println("==========================");
	}

	@AfterAll
	public void tearDownAfterClass() throws Exception {
		System.out.println("==========================");
		System.out.println("This runs after ALL tests");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("This runs before each test");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("This runs after each test");
	}


	@Test
	void testAdd() {
		System.out.println("This test success!!!");
	}

}
