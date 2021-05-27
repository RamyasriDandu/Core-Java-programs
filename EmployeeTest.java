package com.assessment;

import com.assessment.Employee.ManagerType;

class Employee{
	    String name;
	    int employeeId;
	    double salary;
	    enum ManagerType{
	        HR,SALES
	    }
	    public Employee(String name, int employeeId, double salary) {
	        super();
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	    }
	    
	}
	class Manager extends Employee{
	    ManagerType type;    
	    public Manager(String name, int employeeId, double salary, ManagerType type) {
	        super(name, employeeId, salary);
	        this.type = type;
	        setSalary();
	    }      void setSalary() {
	        if(this.type==ManagerType.HR) {
	            salary+=10000;
	        }
	        else {
	            salary+=5000;
	        }
	    }     @Override
	    public String toString() {
	        return "Manager [type=" + type + ", name=" + name + ", employeeId=" + employeeId + ", salary=" + salary
	                + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId() + ", getSalary()=" + getSalary()
	                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
	                + "]";
	    }
	} 
	class Clerk extends Employee{
	    int speed;
	    int accuracy;
	    int increment=0;
	    public Clerk(String name, int employeeId, double salary, int speed, int accuracy,int increment) {
	        super(name, employeeId, salary);
	        this.speed = speed;
	        this.accuracy = accuracy;
	        this.increment = increment;
	        setSalary();
	    }
	    
	    public int getSpeed() {
	        return speed;    
	    }     
	    public void setSpeed(int speed) {
	    	
	        this.speed = speed;    
	    }    
	    public int getAccuracy() {
	    	
	        return accuracy;  
	    }  
	    public void setAccuracy(int accuracy) {
	        this.accuracy = accuracy;
	    }   
	    public int getIncrement() {
	        return increment;
	    }  
	    public void setIncrement(int increment) {
	        this.increment = increment;
	    }   
	    void setSalary() {
	        if(increment==0) {
	            if(speed>=70&&accuracy<=80) {
	                salary+=1000;
	                increment++;
	            }
	        }
	    }     @Override
	    public String toString() {
	        return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", increment=" + increment + ", name=" + name
	                + ", employeeId=" + employeeId + ", salary=" + salary + ", getSpeed()=" + getSpeed()
	                + ", getAccuracy()=" + getAccuracy() + ", getIncrement()=" + getIncrement() + ", getName()=" + getName()
	                + ", getEmployeeId()=" + getEmployeeId() + ", getSalary()=" + getSalary() + ", toString()="
	                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	    }
	}
	public class EmployeeTest {
	  public static void main(String[] args) {
	      Manager mgr=new Manager("Ramya",1,30000,ManagerType.HR);
	      System.out.println(mgr.toString());
	      Clerk clk=new Clerk("Shri",101,10000.00,70,80,0);
	      System.out.println(clk.toString());
	      clk.setAccuracy(85);
	      clk.setSalary();
	      System.out.println(clk.toString());
	  }
	}
	 


