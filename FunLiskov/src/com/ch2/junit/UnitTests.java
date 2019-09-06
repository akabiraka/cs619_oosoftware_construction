package com.ch2.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ch2.ObjectsAndVariables;

class UnitTests {

	@Test
	void testObjectReference() {
		ObjectsAndVariables objectsAndVariables = new ObjectsAndVariables();
		int[] a = {1, 2, 3};
		int[] b = new int[3];
		objectsAndVariables.changeArrayReference(a, b);
		assertEquals(true, true);
	}
	@Test
	public void testIfObjectSameReferencePreserving() {
		int[] a = {1, 2, 3};
		int[] b = new int[3];
		//assertEquals(a, b); // not same
		b = a;
		//assertEquals(a, b); // same
		removeElement(a, 0);
		assertEquals(a, b);
	}
	
	private void removeElement(int[] a, int removedIdx) {
	    System.arraycopy(a, removedIdx + 1, a, removedIdx, a.length - 1 - removedIdx);
	}

}
