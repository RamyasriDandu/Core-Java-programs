package com.assessment;

public class TestStudent {
	
		public static void main(String[] args) {
			Student s = new Student();
			System.out.println(s.displayDetails());
			Hosteller h = new Hosteller(2, "ramya", 120.0, 120.00);
			System.out.println(h.displayDetails());
			System.out.println(h.payFee(100.00));
			DayScholar d = new DayScholar(3, "sree", 29.00, 23.00);
			System.out.println(d.displayDetails());
			System.out.println(d.payFee(50.0));

		}
	}



