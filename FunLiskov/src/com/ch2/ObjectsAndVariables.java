package com.ch2;


public class ObjectsAndVariables {
	
	public void removeElement(int[] a, int removedIdx) {
	    System.arraycopy(a, removedIdx + 1, a, removedIdx, a.length - 1 - removedIdx);
	}
	
	/**
	 * @param a can not be empty
	 * @param b
	 * Here a and b are referencing same object. So any change in a with affect in b
	 * and vice versa.
	 */
	public void changeArrayReference(int[] a, int[] b) {
		System.out.println(a == b);
		a = b;
		removeElement(a, 0);
		System.out.println(a==b);
	}
}
