package com;

public class Loan {
	
	/**
	 * This method calculates the number of months needed to pay off the principal amount.
	 * @param principal The principal amount.
	 * @param annualInterestRate The annual interest rate.
	 * @param monthlyPayment The monthly payment amount.
	 * @return the number of months required to pay off the principal.
	 * @throws IllegalArgumentException if any of the arguments is not positive.
	 * @throws IllegalArgumentException if monthlyPayment amount is not sufficiently
	 * large to drive the principal to zero.
	 */
	public static int months(int principal, double annualInterestRate, int monthlyPayment) {
		
		if(principal <0 || annualInterestRate < 0 || monthlyPayment <0)
			throw new IllegalArgumentException("All arguments should be positive.");
		
		double monthlyInterestRate = annualInterestRate / 12;
		int months = 0;
		double currentPrincipal = (double) principal;
		
		if (currentPrincipal < currentPrincipal * (1+monthlyInterestRate) - monthlyPayment)
			throw new IllegalArgumentException("Monthly payment should be sufficiently large.");
		
		while (currentPrincipal > 0) {
			currentPrincipal = currentPrincipal * (1 + monthlyInterestRate) - monthlyPayment;
			months++;
		}
		return months;
	}

}
