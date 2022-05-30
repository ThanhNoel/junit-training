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

class TestWithArgumentCaptor {
	
	private BenefitCalculationService underTest;
	private EmployeeService es;
	ArgumentCaptor<Integer> argCaptor;

	@BeforeEach
	void setUp() throws Exception {
		MathUtils mu = new MathUtils();
		es = Mockito.mock(EmployeeService.class);
		argCaptor = ArgumentCaptor.forClass(Integer.class);
		underTest = new BenefitCalculationService(es, mu);
	}

	@Test
	void testCalculateMonthlySalary_success() {
		Mockito.when(es.isValidEmployee(Mockito.anyInt())).thenReturn(true);
		int inputEmployeeId = 10;
		underTest.calculateMonthlySalary(inputEmployeeId, 1);
		// verify that method isValidEmployee is called with "recalculated" employee id
		// (employee id + 5)
		Mockito.verify(es).isValidEmployee(argCaptor.capture());
		assertEquals(inputEmployeeId + 5, argCaptor.getValue());
	}	

	@Test
	void testCalculateMonthlySalary_invalidEmployee() {
		
	}
	

}
