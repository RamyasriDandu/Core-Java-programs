package com.assessment;

	class Employees{
		int employeeId;
		String employeeName;
		double basicSalary;
		
		public Employees(int employeeId, String employeeName, double basicSalary, double grossSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
			this.grossSalary = grossSalary;
		}
		public double getBasicSalary() {
			return basicSalary;
		}
		public double getGrossSalary() {
			return basicSalary;
		}
		public void setGrossSalary(double grossSalary) {
			this.grossSalary=grossSalary;
		}
		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}
		double grossSalary;
		public Employees() {
			
		}
		public Employees(int employeeId, String employeeName, double basicSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
		}
		
		public String displayDetails() {
			return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
					+ ", grossSalary=" + grossSalary + "]";
		}
		public void calculateSalary() {
			grossSalary=basicSalary;
		}
	}
	class Managers extends Employees{
		double grossSalary;
		public Managers() {
			
		}
		
		public Managers(int employeeId,String employeeName,double basicSalary) {
			//super(employeeId, employeeName, basicSalary);
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.basicSalary=basicSalary;
		}
		
		@Override
		public void calculateSalary() {
			grossSalary=basicSalary+((15*basicSalary)/100);
			//System.out.println("Manager : "+grossSalary);
		}
		public String displayDetails() {
			return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
					+ ", grossSalary=" + grossSalary + "]";
		}
		

	}
	class Trainee extends Employees{
		public Trainee() {
			
		}
		public Trainee(int employeeId,String employeeName,double basicSalary) {
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.basicSalary=basicSalary;
		}
		/*
		 * public void setGrossSalary() { double
		 * grossSalary=basicSalary+(10*basicSalary/100);
		 * System.out.println(grossSalary); }
		 */
		
		@Override
		public void calculateSalary() {
			grossSalary=basicSalary+((10*basicSalary)/100);
			//System.out.println("Trainee : "+grossSalary);
		}
		public String displayDetails() {
			return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
					+ ", grossSalary=" + grossSalary + "]";
		}
	}

	public class SalaryTest {
	 public static void main(String[] args) {
		
			Employees emp=new Employees(1,"Chinnu",12000.00); 
			emp.calculateSalary();
			System.out.println(emp.displayDetails());
			Managers manager=new Managers(100,"ramya",45000.00);
			manager.calculateSalary(); 
			System.out.println(manager.displayDetails());
			Trainee trainee=new Trainee(200,"sree",18000.00);
		    trainee.calculateSalary();
		    System.out.println(trainee.displayDetails());
	 }
	}


