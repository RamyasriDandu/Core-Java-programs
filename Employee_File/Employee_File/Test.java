package com.interview.empz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {

		try {
			File file = new File("./src/Employee.txt"); 
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
			String employeeLines;
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
			while ((employeeLines = br.readLine()) != null) {
				String[] values = employeeLines.split(";");
				if (!values[0].equals("IdNo")) {
					Employee employee = new Employee();
					employee.setEmployeeId(Integer.parseInt(values[0]));
					employee.setEmployeeName(values[1]);
					employee.setDesignation(values[2]);
					employee.setSalary(Double.parseDouble(values[3]));

					System.out.println("Emp : " + employee.toString());
					employeeList.add(employee);
				}
			}
			
			EmployeeDetails employeeDetails =  new EmployeeDetails(employeeList);
			System.out.println("employeeDetails : " +employeeDetails.toString());
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
