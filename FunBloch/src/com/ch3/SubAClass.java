package com.ch3;

public class SubAClass extends AClass{
	private int c;
	public SubAClass(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
//	@Override
//	protected SubAClass clone() throws CloneNotSupportedException {
//		SubAClass result = (SubAClass) super.clone();
//		result.c = 10;
//		return result;
//	}

}
