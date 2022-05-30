package com.nashtech.junit.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.nashtech.junit.MathUtils;

class TestWithSpy {
	
	private BenefitCalculationService underTest;
	private EmployeeService es;
	private EmployeeService spied;
	ArgumentCaptor<EmployeeService> argCaptor;

	@BeforeEach
	void setUp() throws Exception {
		EmployeeService em = new EmployeeService();
		MathUtils mu = new MathUtils();
		spied = Mockito.spy(em);
		argCaptor = ArgumentCaptor.forClass(EmployeeService.class);
		underTest = new BenefitCalculationService(spied, mu);
	}

	@Test
	void testCalculateMonthlySalary_neverCallGetEmployeeName() {
		underTest.calculateMonthlySalary(11, 10);
		Mockito.verify(spied, times(0)).getEmployeeName(
				Mockito.anyInt(), Mockito.anyString());
	}

	@Test
	void testCalculateMonthlySalary_invalidEmployee() {
		assertThrows(IllegalAccessError.class,
				() -> underTest.calculateMonthlySalary(12, 5));
		
	}

}
