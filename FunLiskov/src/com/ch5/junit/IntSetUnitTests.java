package com.ch5.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ch5.IntSet;

class IntSetUnitTests {
	IntSet intset = null;
	@BeforeEach
	void setUp() throws Exception {
		intset = new IntSet();
	}

	@Test
	void test_mutable_objects_equals() {
		IntSet aIntSet = new IntSet();
		IntSet bIntSet = new IntSet();
		assertEquals(aIntSet.equals(bIntSet), true);
	}

}
