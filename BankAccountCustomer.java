package com.assessment;

	
	import java.util.Scanner;

	class Account {
		String CustomerType;
		double balance = 0.0;
		int accountNo;
		float interestRate;

		int depositeAmount;

		public double deposite(double balance) {
			return balance += depositeAmount;

		}

		public double withdraw(double balance) {
			return balance = balance - depositeAmount;
		}

		void display() {
			System.out.println("Account No:" + accountNo);
			System.out.println("Balance:" + balance);
		}

		void displaybal() {
			System.out.println("Balance:" + balance);
		}
	}

	class Customer {
		String firstName;
		String lastName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Customer(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;

		}

		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		public Customer() {
			System.out.println("Default Constructor");
		}

	}

	public class BankAccountCustomer {

		public static void main(String[] args) {
			Customer c = new Customer();
			Customer c1 = new Customer("Ramyasree", "Dandu");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your  firstname");
			String name = sc.next();
			System.out.println("Enter your Lastname");
			String name1 = sc.next();
			c.setFirstName(name);
			System.out.println(c.getFirstName());
			c.setLastName(name1);
			System.out.println(c.getLastName());
			Account a = new Account();
			a.accountNo = 101;
			a.balance = 10000;
			a.interestRate = 2;

			a.deposite(20000);
			a.withdraw(5000);
			a.display();
			a.displaybal();
		}

	}


