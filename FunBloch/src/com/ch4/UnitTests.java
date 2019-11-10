package com.ch4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.packagevisible.only.SubClassA;

class UnitTests {

	@Test
	void test_packageInvisibility() {
//		new ClassA(12, 3);
//		ClassA a = new ClassA(11);
		SubClassA b = new SubClassA(11);
		System.out.println(b);
	}

	@Test
	void test_PointClass() {
		Point point = new Point(1, 2);
		System.out.println(point);
//		point.x = 19; //compilation error
		System.out.println(point);
	}

	@Test
	void test_complex() {
		Complex complex = Complex.valueOf(1, 2);
		System.out.println(complex);
		System.out.println(Complex.ZERO);
		System.out.println(Complex.ONE);
		System.out.println(Complex.I);
	}
	
	@Test
	void test_instrumentedHashSet() {
		InstrumentedHashSet<String> hashSet = new InstrumentedHashSet<String>();
		hashSet.add("cat");
		List<String> list = Arrays.asList("and", "cat", "dog");
		hashSet.addAll(list);
		System.out.println(hashSet.getAddCount());
	}
	
	@Test
	void test_OkInstrumentedHashSet() {
		OkInstrumentedHashSet<String> hashSet = new OkInstrumentedHashSet<String>(new HashSet<String>());
		hashSet.add("ant");
		hashSet.addAll(List.of("bee", "cat", "dog"));
		System.out.println(hashSet.getAddCount());
	}
	
	@Test
	void test_callingOverridableMethodsFromConstructor() {
		MySub sub = new MySub();
		sub.overrideMe();
	}
}
