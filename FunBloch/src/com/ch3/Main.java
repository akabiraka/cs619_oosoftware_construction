package com.ch3;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object aObject = new AClass(1, 2);
		Object bObject = new AClass(1, 2);
		System.out.println(aObject.equals(bObject)); // false
		AClass xAClass = null;
		System.out.println(aObject.equals(null));  // false
//		System.out.println(xAClass.equals(aObject)); // NPE
//		System.out.println(xAClass.equals(null)); // NPE
		System.out.println(aObject.equals(aObject)); //true
	}

}
