package com.ch4.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ch4.MyNewException;

class ExceptionTester {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMyNewException() {
		//RuntimeException e1 = new MyNewException("the reason is nothing");
		assertThrows(MyNewException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				throwCustomException();
			}
		});
	}
	
	private void throwCustomException() {
		throw new MyNewException();
	}

}
