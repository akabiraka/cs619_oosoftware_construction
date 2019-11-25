package com.ch2.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ch2.ObjectsAndVariables;

class UnitTests {
	ObjectsAndVariables objectsAndVariables = null;

	@BeforeEach
	void setUp() {
		// TODO Auto-generated method stub
		objectsAndVariables = new ObjectsAndVariables();
	}

	@Test
	void testObjectReference() {
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];
		objectsAndVariables.changeArrayReference(a, b);
		assertEquals(true, true);
	}

	@Test
	public void testIfObjectSameReferencePreserving() {
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];
		// assertEquals(a, b); // not same
		b = a;
		// assertEquals(a, b); // same
		removeElement(a, 0);
		assertEquals(a, b);
	}

	private void removeElement(int[] a, int removedIdx) {
		System.arraycopy(a, removedIdx + 1, a, removedIdx, a.length - 1 - removedIdx);
	}

	@Test
	public void testInPlaceObjectModificationOfMutableObject() {
		int[] b = { 1, 3, 5 };
		objectsAndVariables.multipliesInPlace(b, 2);
		System.out.println(b[0]); // mutable objects changed in place
		assertEquals(true, true);
	}

	@Test
	public void testInPlaceObjectModificationOfImmutableObject() {
		String xString = "abcde";
		String yString = "fgh";
		System.out.println(xString); // immutable objects did not change in place
		assertEquals(objectsAndVariables.addTwoStrings(xString, yString), xString + yString);
	}

	@Test
	public void apparebtVsActual() {
		Object o1 = "abc";
		System.out.println(o1.equals("abc"));
		// System.out.println(o1.length()); // illigal operation as length() is the
		// String's method;
		String str = (String) o1;
		System.out.println(str.length()); // legal
		o1 = new String("asf");
		// o1.length(); //illigal
	}

	@Test
	public void testMethodOverloading() {
		int x = 1;
		long y = 2;
		float z = (float) 3.5;
		objectsAndVariables.comp(x, y);
		x = 1234567893;
		objectsAndVariables.comp(x, y);
		//objectsAndVariables.comp(x, x); //illigal
	}
	
	@Test
	public void testDispatching() {
		String str = "abc";
		Object obj = str + "d";
		String str2 = "abcd";
		//assertEquals(obj.equals(str2), true); // true
		assertEquals(str2.equals(obj), true); // true
	}
	
	@Test
	void test_nullString() {
		String string = null;
		System.out.println(string+string+string);
	}
	
	@Test
	void test_sameStringReference() {
		String string = "alhumdulillah";
		String string2 = string;
		String string3 = string.replace('a', '0');
		System.out.println(string3);
		System.out.println(string2);
	}
	
	@Test
	void test_dispatch() {
		String t = "ab";
		Object o = t + "c";
		t = "abc";
		System.out.println(o.equals(t));
		System.out.println(t.equals(o));
		Integer x = Integer.valueOf(10);
	}

}
