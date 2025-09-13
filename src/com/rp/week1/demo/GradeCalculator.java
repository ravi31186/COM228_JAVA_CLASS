package com.rp.week1.demo;

import java.util.Scanner;

/*
 * Calculate and store student grades for various subjects.
This project stores student grades for various subjects, 
calculates their average, and determines their final grade.
 */

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		// get student name..
		System.out.println("Enter student Name..");
		String studentName = scanner.nextLine();
		
		// Get number of subjects
		System.out.println("How many subjects..");
		int numberOfSubject = scanner.nextInt();
		
		double[] grades = new double[numberOfSubject];
		double totalGrades = 0;
		
		// Array to store grades
		for (int i = 0; i <= (numberOfSubject - 1); i++ ) {
			System.out.println("Enter Grade for Subject " + i);
			grades[i] = scanner.nextDouble();
			totalGrades += grades[i];
		}
		
		double average = totalGrades/numberOfSubject;
		
		String status = average >= 60 ? "Pass" : "Fail";
		
		System.out.println("Student Name => " + studentName);
		System.out.println("Totoal Subjects => " + numberOfSubject);
		System.out.println("Student Status => " + status);
		
		scanner.close();

	}

}
