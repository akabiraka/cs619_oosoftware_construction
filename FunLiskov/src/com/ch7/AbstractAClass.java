package com.ch7;

public abstract class AbstractAClass {
	protected int x;

	public AbstractAClass(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}

	public abstract int getX();
	
	public AClass getS() {
		return new AClass(0);
	}
}
