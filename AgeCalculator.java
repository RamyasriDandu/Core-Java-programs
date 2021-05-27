package com.assessment;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
	
	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(1999, Month.APRIL, 12);

		LocalDate endDate = LocalDate.of(2021, Month.MAY, 25);

		double numberOfYears = ChronoUnit.MONTHS.between(startDate, endDate) ;

		double temp = numberOfYears / 12 ;


		System.out.println(temp);

		 
		}

		 

	}


