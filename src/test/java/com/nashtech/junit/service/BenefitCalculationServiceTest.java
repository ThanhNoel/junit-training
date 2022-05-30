package com.nashtech.junit.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nashtech.junit.MathUtils;

class BenefitCalculationServiceTest {
	
	private BenefitCalculationService underTest;

	@BeforeEach
	void setUp() throws Exception {
		EmployeeService es = new EmployeeService();
		MathUtils mu = new MathUtils();
		underTest = new BenefitCalculationService(es, mu);
	}

	@Test
	void testCalculateMonthlySalary_invalidMonth() {
		assertAll(
				() -> assertThrows(IllegalArgumentException.class,
								() -> underTest.calculateMonthlySalary(11, 15)),
				() -> assertThrows(IllegalArgumentException.class,
								() -> underTest.calculateMonthlySalary(11, -1))
		);
		
	}

	@Test
	void testCalculateMonthlySalary_success() {
		int monthlySalary = underTest.calculateMonthlySalary(11, 5);
		assertEquals(9_300_000, monthlySalary);
	}

	@Test
	void testCalculateMonthlySalary_invalidEmployee() {
		assertThrows(IllegalAccessError.class,
				() -> underTest.calculateMonthlySalary(12, 5));
		
	}

}
