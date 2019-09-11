package com;

public class Loan {

	/**
	 * This method calculates the number of months needed to pay off the principal
	 * amount.
	 * 
	 * @param principal          The principal amount.
	 * @param annualInterestRate The annual interest rate.
	 * @param monthlyPayment     The monthly payment amount.
	 * @return the number of months required to pay off the principal.
	 * @throws IllegalArgumentException if any of principal, annualInterestRate or
	 *                                  monthlyPayment is not positive. Or
	 *                                  monthlyPayment amount is not sufficiently
	 *                                  large to drive the principal to zero.
	 */
	public static int months(int principal, double annualInterestRate, int monthlyPayment) {

		if (principal < 0)
			throw new IllegalArgumentException("Principal" + principal + " can not be negative.");

		if (annualInterestRate < 0)
			throw new IllegalArgumentException("Annual interest rate " + annualInterestRate + " can not be negative.");

		if (monthlyPayment < 0)
			throw new IllegalArgumentException("Monthly payment amount " + monthlyPayment + " can not be negative.");

		double monthlyInterestRate = annualInterestRate / 12;
		if (monthlyPayment <= principal * monthlyInterestRate)
			throw new IllegalArgumentException("Payment " + monthlyPayment + " should be more than "
					+ principal * monthlyInterestRate + " to drive principal to zero.");

		int months = 0;
		double currentPrincipal = (double) principal;

		while (currentPrincipal > 0) {
			currentPrincipal = currentPrincipal * (1 + monthlyInterestRate) - monthlyPayment;
			months++;
		}
		return months;
	}
}
