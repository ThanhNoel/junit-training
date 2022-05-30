package com.nashtech.junit.service;

import java.time.Month;
import java.time.Year;

import com.nashtech.junit.MathUtils;

public class BenefitCalculationService {
	
	private final EmployeeService employeeService;
	private final MathUtils mathUtils;
	
	public BenefitCalculationService(EmployeeService employeeService, MathUtils mathUtils) {
		this.employeeService = employeeService;
		this.mathUtils = mathUtils;
	}
	
	public int calculateMonthlySalary(int employeeId, int month) {
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException("Invalid month");
		}
		if (!employeeService.isValidEmployee(recalculateEmployeeId(employeeId))) {
			throw new IllegalAccessError("Invalid employee");
		}
		boolean leapYear = Year.now().isLeap();
		return mathUtils.multiply(
				employeeService.getDailySalary(employeeId), Month.of(month).length(leapYear));
	}
	
	private int recalculateEmployeeId(int employeeId) {
		// do smt very complicated
		return employeeId + 5;
	}
	
	public int calculateEndOfYearBonus(int employeeId) {
		if (!employeeService.isValidEmployee(employeeId)) {
			throw new IllegalAccessError("Invalid employee");
		}
		return mathUtils.multiply(employeeService.getDailySalary(employeeId), 20);
	}
	

}
