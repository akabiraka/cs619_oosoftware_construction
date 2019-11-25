package com.ch3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test() {
		int[] a = null;
		testHelper(a);
		System.out.println(a);
	}
	
	void testHelper(int[] b) {
		System.out.println(b);
	}

}
