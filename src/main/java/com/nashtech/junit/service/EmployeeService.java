package com.nashtech.junit.service;

public class EmployeeService {
	
	IValidImployeeInterface validEmployeeService;
	
	public boolean isValidEmployee(int employeeId) {
		// update
		return employeeId % 2 == 0;
	}
	
	public int getDailySalary(int employeeId) {
		if (employeeId > 100) {
			return 200_000;
		}
		return 300_000;
	}
	
	public String getEmployeeName(int employeeId, String prefix) {
		if (employeeId == 10)
			throw new IllegalArgumentException("invalid employee id");
		return prefix + employeeId; 
	}
	
	public String[] getEmployeeNames() {
		// query DB
		return new String[] {"asdasd", "2342as"};
	}

}
