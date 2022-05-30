package com.nashtech.junit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsTest8Tag {

	@Test
	@Tag("UAT")
	void testAdd() {
		System.out.println("This tests runs with UAT tag");
	}
	

	@Test
	@Tag("PROD")
	void testAdd2() {
		System.out.println("This tests runs with PROD tag");
	}

}
