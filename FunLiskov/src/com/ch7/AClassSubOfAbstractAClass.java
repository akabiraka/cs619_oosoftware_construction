package com.ch7;

public class AClassSubOfAbstractAClass extends AbstractAClass {

	public AClassSubOfAbstractAClass(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}
	
	public int getProtectedX() {
		AClass aClass = new AClass(19);
		return aClass.x;
	}
	
	@Override
	public AClassSub getS() throws IllegalArgumentException {
		return new AClassSub(0);
	}

}
