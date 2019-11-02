package com.ch3;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test_object_comparison() {
		Object aObject = new AClass(1, 2);
		Object bObject = new AClass(1, 2);
		assertFalse(aObject.equals(bObject));
		assertFalse(aObject.equals(null));

	}

	@Test
	void test_CaseInsensitiveString() {
		CaseInsensitiveString string = new CaseInsensitiveString("Alhumdulillah");
		assertFalse(string.equals("alhumdulillah"));
		assertFalse("alhumdulillah".equals(string));
	}

	@Test
	void test_colorPoint_point_equality() {
		Point point = new Point(1, 2);
		ColorPoint blackColorPoint = new ColorPoint(1, 0, Color.BLACK);
		System.out.println(blackColorPoint.hashCode());
		System.out.println((new ColorPoint(1, 0, Color.BLACK)).hashCode());
//		assertTrue(point.equals(blackColorPoint));
//		assertFalse(blackColorPoint.equals(point));
//		assertFalse(Point.onUnitCircle(colorPoint));
	}

	@Test
	void test_phoneNumber_hashCode() throws CloneNotSupportedException {
		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
		m.put(new PhoneNumber(1, 2, 3), "my number");
		System.out.println(m.get(new PhoneNumber(1, 2, 3))); // null
		PhoneNumber myNumber = new PhoneNumber(1, 2, 3);
		System.out.println(m.get(myNumber)); // null
		m.put(myNumber, "current number");
		System.out.println(m.get(myNumber));
		System.out.println(myNumber.hashCode());
		System.out.println((new PhoneNumber(1, 2, 3)).hashCode());
		System.out.println((new PhoneNumber(1, 2, 3)).hashCode());
		System.out.println((new PhoneNumber(1, 2, 3)).equals((new PhoneNumber(1, 2, 3))));
		System.out.println((new PhoneNumber(1, 2, 3)).equals(myNumber));
		System.out.println(myNumber.equals(new PhoneNumber(1, 2, 3)));
		System.out.println(myNumber);
		System.out.println(myNumber.clone());
		System.out.println(myNumber.clone().equals(myNumber));
		System.out.println(myNumber.equals(myNumber.clone()));
		System.out.println(myNumber == myNumber.clone());
	}

}
