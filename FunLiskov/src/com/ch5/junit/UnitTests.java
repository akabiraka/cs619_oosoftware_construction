package com.ch5.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ch5.IntSet;
import com.customExceptions.EmptyException;

class UnitTests {
	IntSet intSet = null;

	@BeforeEach
	void setUp() throws Exception {
		intSet = new IntSet();
	}

	@Test
	void IntSet_testInsert() {
		intSet.insert(1);
		intSet.insert(-1);
		intSet.insert(0xFFFFFFFF);
		intSet.insert(0x7FFFFFFF);
		// intSet.insert(null); // compilation error
		intSet.remove(-1);
		intSet.remove(-1);
		intSet.isIn(-1);
	}
	
	@Test
	void IntSet_testChoosExcption() {
		assertThrows(EmptyException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				intSet.choose();
			}
		});
	}

}
