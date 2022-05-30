package com.nashtech.junit.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nashtech.junit.MathUtils;

class TestWithMockAndStubs {
	
	private BenefitCalculationService underTest;
	private EmployeeService es;

	@BeforeEach
	void setUp() throws Exception {
		es = mock(EmployeeService.class);
		MathUtils mu = new MathUtils();
		underTest = new BenefitCalculationService(es, mu);
	}
	
	@Test
	void testMockObject() {
		when(es.getDailySalary(1000)).thenCallRealMethod();
		
		System.out.println(es.getDailySalary(1000));
		System.out.println(es.getDailySalary(1001));
		Mockito.reset(es);
		System.out.println(es.getDailySalary(1000));
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
		when(es.isValidEmployee(Mockito.anyInt())).thenReturn(true);
		when(es.getDailySalary(12)).thenReturn(300_000);
		int monthlySalary = underTest.calculateMonthlySalary(12, 5);
		assertEquals(9_300_000, monthlySalary);
	}

	@Test
	void testCalculateMonthlySalary_invalidEmployee() {
		when(es.isValidEmployee(11)).thenReturn(false);
		assertThrows(IllegalAccessError.class,
				() -> underTest.calculateMonthlySalary(11, 5));
		
	}

}
