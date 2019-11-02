package com.ch3;

public class AClass {
	private int a;
	private int b;
	
	public AClass(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object o) {
//		throw new AssertionError();
		return false;
	}

	@Override
	protected final AClass clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
