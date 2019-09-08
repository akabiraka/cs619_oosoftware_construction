package com.ch10.unittests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ch10.Exceptions;

class TestCases {

	Exceptions exceptions = null;
	
	@BeforeEach
	void setUp() throws Exception {
		exceptions = new Exceptions();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_AIOOBE() {
		
		assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				int[] a = {1, 2, 3};
				try {
					int i =0;
					while (true) {
						int x = a[i++];
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					throw new ArrayIndexOutOfBoundsException("bound exceeds!!!");
				}
			}
		});
	}
	
	@Test
	public void test_exceptionChaining() {
		List<Integer> list = new ArrayList<Integer>();
		assertThrows(NoSuchElementException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				try {
					exceptions.exceptionChaining(list.iterator());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.toString());
					throw e.getCause();
				}
				
			}
		});
	}

}
