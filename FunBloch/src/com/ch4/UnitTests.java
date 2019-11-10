package com.ch4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.packagevisible.only.SubClassA;

import static com.ch4.PhysicalConstants.*;
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
		MySub sub = new MySub(12);
		sub.overrideMe();
		MySuper super1 = new MySuper(11);
		System.out.println(super1.clone().equals(super1));
	}
	
	@Test
	void test_ITestSubClasses() {
		ITest test1 = new Sub1Test();
		ITest test2 = new Sub2Test();
		ITest test3 = new Sub3Test();
		System.out.println(test1.getD());
		System.out.println(test2.getB());
		System.out.println(test3.getD());
	}
	
	@Test
	void test_physicalConstants() {
		System.out.println(AVOGADROS_NUMBER);
		System.out.println(BOLTZMAN_CONST);
		System.out.println(ELECTRON_MASS);
	}
}
