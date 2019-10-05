package com.ch7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleUnitTest {

	@Test
	void test() {
		AClass aClass = new AClassSub(11);
		int a = aClass.getA();
		a = 20;
		assertFalse(a == aClass.getA());
	}

	@Test
	void test_abstractClassCostruction() {
//		AbstractAClass abstractAClass = new AbstractAClass(10); // Cannot instantiate the type AbstractAClass
	}

	@Test
	void test_subOfAbstractClass() {
		AbstractAClass abstractAClass = new AClassSubOfAbstractAClass(1);
		assertEquals(10, abstractAClass.getX());
	}
	
	@Test
	void test_accessingProtectedVariable() {
		AClassSubOfAbstractAClass abstractAClass = new AClassSubOfAbstractAClass(1);
		assertEquals(199999, abstractAClass.getProtectedX());
	}
}
