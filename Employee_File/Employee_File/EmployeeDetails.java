package com.interview.empz;

import java.util.List;

public class EmployeeDetails {

	List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public EmployeeDetails(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeList=" + employeeList + "]";
	}
	
	
}
