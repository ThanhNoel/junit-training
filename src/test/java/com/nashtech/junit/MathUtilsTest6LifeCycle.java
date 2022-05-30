package com.nashtech.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest6LifeCycle {

	public MathUtilsTest6LifeCycle() {
		System.out.println("*** Class instantiated ***");
	}

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This runs before ALL tests");
		System.out.println("==========================");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
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
	void test() {
		System.out.println("Test method 1");
	}
	@Test
	void test2() {
		System.out.println("Test method 2");
	}

}
