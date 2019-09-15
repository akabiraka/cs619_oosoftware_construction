package com.ch5.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.ch5.AClass;
import com.ch5.IntSet;
import com.ch5.Poly;
import com.customExceptions.EmptyException;

class PolyUnitTests {
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
	
	@Test
	void test_two_immutable_objects_equals() {
		Poly p = new Poly(3, 4);
		Poly q = new Poly(3, 4);
		assertEquals(p.equals(q), false);
	}
	
	@Test
	void test_two_mutable_objects_equals() {
		IntSet a = new IntSet();
		a.insert(1);
		IntSet b = new IntSet();
		b.insert(1);
		assertEquals(a==b, true);
	}
	
	@Test
	void test_two_objects_equals() {
		AClass x = new AClass(1, 2);
		AClass y = new AClass(1, 2);
		assertEquals(false, x.equals(y));
	}
}
