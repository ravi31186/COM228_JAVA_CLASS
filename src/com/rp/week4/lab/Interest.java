package com.rp.week4.lab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Interest {
	
	private double principle;
	private double rate;
	private int time;
	
	private BigDecimal principleBigDec;
	private BigDecimal rateBigDec;
	
	public Interest(double principle, double rate, int time) {
		
		if (principle < 0 || rate < 0 || time < 0) {
			throw new IllegalArgumentException("Priciple, rate and time should not be negative values");
		}
		
		if (principle == Math.floor(principle) || rate == Math.floor(rate)) {
			throw new IllegalArgumentException("Priciple, rate should not be integer values");
		}
		
		this.principle = principle;
		this.rate = rate;
		this.time = time;
		
	}
	
	public Interest(BigDecimal principle, BigDecimal rate, int time) {
		if (principle.scale() == 0 || rate.scale() == 0) {
			throw new IllegalArgumentException("Priciple, rate should be integer values");
		}
		
		this.principleBigDec = principle;
		this.rateBigDec = rate;
		this.time = time;
	}
	
	public double calculateSimpleInterest() {
		return (this.principle * this.rate * this.time) / 100.0;
	}
	 
	
	public double calculateCompoundInterest() {
		 double amount = this.principle * Math.pow(1 + this.rate / 100.0, this.time);
	     return amount - this.principle;
	}
	
	// BigDecimal Compound interest
	public BigDecimal calculateCompoundInterestBigDec() {
        BigDecimal timeBD = new BigDecimal(time);

        return principleBigDec.multiply(rateBigDec)
                                 .multiply(timeBD)
                                 .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

    }
	
	// BigDecimal Simple interest
	 public BigDecimal calculateSimpleInterestBigDec() {
		 BigDecimal one = BigDecimal.ONE;

	     BigDecimal rateFraction = rateBigDec.divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP);

	     BigDecimal base = one.add(rateFraction);

	     BigDecimal amount = principleBigDec.multiply(base.pow(time));

	     return amount.subtract(principleBigDec).setScale(2, RoundingMode.HALF_UP);
	   }

}
