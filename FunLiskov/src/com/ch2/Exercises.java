package com.ch2;

public class Exercises {
	
	// exercise 2.5
	public void twoPointFive() {
		Object o = "abc";
		boolean b = o.equals("a, b, c");
		System.out.println(b);
		//char c = o.charAt(1); //compilation error
		Object o2 = b;
		// String s = o; //compilation error
		String t = (String) o;
		char c = t.charAt(0);
		c = t.charAt(3);
	}
	
	// exercise 2.6
	public void twoPointSix() {
		int[] a = {1, 2, 3};
		Object o = "123";
		String t = "12";
		String w = t + "3";
		System.out.println(o.equals(a)); //false
		System.out.println(o.equals(t)); // false
		System.out.println(o.equals(w)); //true
		System.out.println(o==w); // false
	}
	
	// exercise 2.7
	public void m(Object o, long x, long y) {
		System.out.println(1);
	}
	
	public void m(String s, int x, long y) {
		System.out.println(2);
	}
	
	public void m(Object o, int x, long y) {
		System.out.println(3);
	}
	
	public void m (String s, long x, int y) {
		System.out.println(4);
	}
}