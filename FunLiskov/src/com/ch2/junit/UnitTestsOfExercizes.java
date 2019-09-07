package com.ch2.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ch2.Exercises;

class UnitTestsOfExercizes {
	Exercises exercises = null;

	@BeforeEach
	void setUp() throws Exception {
		exercises = new Exercises();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_twoPointFive() {
		assertThrows(StringIndexOutOfBoundsException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				exercises.twoPointFive();
			}
		});
	}
	
	@Test
	void test_twoPointSix() {
		exercises.twoPointSix();
	}
	
	@Test
	void test_twoPointSeven() {
		Object o = null;
		String v = "sa";
		int a = 1;
		long b = 3;
		exercises.m(v, a, b);
		//exercises.m(v, a, a);
		exercises.m(v, b, a);
		exercises.m(v, b, b);
		exercises.m(o, b, b);
		exercises.m(o, a, a);
	}

}
