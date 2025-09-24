package com.rp.week4.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			  Scanner sc = new Scanner(System.in);
			  
		      System.out.println("=== Simple Interest Calculator with double inputs ===");
		      System.out.print("Principal (P): ");
		      double p = sc.nextDouble();
		 
		      System.out.print("Annual Rate in % (R): ");
		      double r = sc.nextDouble();
		 
		      System.out.print("Time in years (T): ");
		      int t = sc.nextInt();
		      
		      // Input 1 double principle and rate
		      Interest interest = new Interest(p, r, t);
		      double simpleInterest = interest.calculateSimpleInterest();
		      double compoundInterest = interest.calculateCompoundInterest();
				
		      System.out.println("Simple interest => " + simpleInterest);
				
		      System.out.println("Compound interest => " + compoundInterest);
		      
		      
		      System.out.println("=== Simple Interest Calculator with BigDecimal inputs ===");
		      System.out.print("Principal (P): ");
		      BigDecimal p1 = sc.nextBigDecimal();
		 
		      System.out.print("Annual Rate in % (R): ");
		      BigDecimal r1 = sc.nextBigDecimal();
		 
		      System.out.print("Time in years (T): ");
		      int t1 = sc.nextInt();
		      
		      // Input 1 double principle and rate
		      Interest interest1 = new Interest(p1, r1, t1);
		      BigDecimal simpleInterest1 = interest1.calculateSimpleInterestBigDec();
		      BigDecimal compoundInterest1 = interest1.calculateCompoundInterestBigDec();
				
		      System.out.println("Simple interest => " + simpleInterest1);
				
		      System.out.println("Compound interest => " + compoundInterest1);
		      
		 
		      sc.close();
			
		} catch(IllegalArgumentException exception) {
			System.out.println(exception);
			
		}
			
	}

}
