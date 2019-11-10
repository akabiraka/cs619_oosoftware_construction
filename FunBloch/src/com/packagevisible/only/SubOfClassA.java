package com.packagevisible.only;

public class SubOfClassA extends ClassA {
	private int z;

	SubOfClassA(int x, int y) {
		super(x, y);
		this.z = x + y;
	}
	
//	@Override
//	private int getX() { //compile time error in this line b/c Cannot reduce the visibility of the inherited method from ClassA
//		return z;
//	}

}
