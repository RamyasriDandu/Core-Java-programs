package com.assessment;


	import java.util.Scanner;

	public class CojStudent {
		public int studentId;
		public String studentName;
		private int marks;
		private int grade;

		public CojStudent() {
			System.out.println("Default Constructure");
		}

		/*
		 * public String displayDetails() { return "CojStudent [studentId=" + studentId
		 * + ", studentName=" + studentName + ", Marks=" + marks + ", grade=" + grade +
		 * "]";
		 * 
		 * }
		 */
		public CojStudent(int studentId, String studentName, int marks) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.marks = marks;
		}

		private void calculateGrade() {
			if (90 > marks) {
				System.out.println("Grade A");
			} else if (90 > marks && marks < 80) {
				System.out.println("Grade B");
			} else if (80 > marks && marks < 70) {
				System.out.println("Grade c");
			} else if (70 > marks && marks < 60) {
				System.out.println("Grade D");
			} else {
				System.out.println("Grade E");
			}

		}

		public String displayDetails() {
			return "CojStudent [studentId=" + studentId + ", studentName=" + studentName + ", Marks=" + marks + ", grade="
					+ grade + "]";

		}

		public static void main(String[] args) {
			CojStudent c1 = new CojStudent(1, "ramya", 65);
			c1.calculateGrade();
			System.out.println(c1.displayDetails());
		}
	}

