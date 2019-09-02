/**
 * Assignment 1 
 * @author akabir
 * @version 1.0
 */
public class Loan {
	
	/**
	 * Calculate the number of months to pay off the principal.
	 * @param principal The loan amount taken. Requires positive integer value.
	 * @param annualInterestRate The annual interest rate in decimal point. Requires positive decimal value.
	 * @param monthlyPayment The monthly payment amount. Requires positive integer value. 
	 * It should be sufficiently large to drive the principal to zero.
	 * @return The number of months to pay off the principal loan amount. 
	 */
	public static int months(int principal, double annualInterestRate, int monthlyPayment) {
		double monthlyInterestRate = annualInterestRate / 12;
		int months = 0;
		double oldPrincipal = (double) principal;
		double newPrincipal = 0.0;
		while (oldPrincipal > 0) {
			newPrincipal = oldPrincipal * (1 + monthlyInterestRate) - monthlyPayment;
			oldPrincipal = newPrincipal;
			months++;
		}
		return months;
	}
}
