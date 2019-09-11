package com.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.Loan;

class UnitTests {

	@Test
	void test_Loan_HappyPaths() {
		assertEquals(166, Loan.months(100000, .08, 1000));
		assertEquals(141, Loan.months(100000, .08, 1100));
	}
	
	@Test
	void test_Loan_AllArgumentsBePositive() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				Loan.months(-10000, 8, 1000);
				Loan.months(10000, -8, 1000);
				Loan.months(10000, 8, -1000);
			}
		});
	}
	
	@Test
	void test_Loan_MonthlyPaymentShouldBeSufficientlyLarge() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				Loan.months(100000, .08, 100);
				Loan.months(10000, 8, 0);
			}
		});
	}

}
