
public class Loan {
	public static int months(int principal, double annualInterestRate, int monthlyPayment) {

		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		int months = 0;

		if (principal < 0 || annualInterestRate < 0 || monthlyInterestRate < 0)
			System.out.println("Illigal argument.");
		else {
			double oldPrincipal = (double) principal;
			double newPrincipal = oldPrincipal * (1 + monthlyInterestRate) - monthlyPayment;
			if (newPrincipal > oldPrincipal) {
				System.out.println("Payment is not sufficiently large to drive the principal to zero.");
			} else {
				newPrincipal = 0.0;
				while (oldPrincipal > 0) {
					newPrincipal = oldPrincipal * (1 + monthlyInterestRate) - monthlyPayment;
					oldPrincipal = newPrincipal;
					months++;
				}
			}
		}
		return months;
	}
}
