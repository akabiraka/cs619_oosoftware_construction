package com.ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test() {
		AClass aClass = new AClass(1, 3);
		AClass bAClass = new AClass(1, 3);
		System.out.println(aClass.equals(bAClass));
	}

}
