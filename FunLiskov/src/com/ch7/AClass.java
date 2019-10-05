package com.ch7;

public class AClass {
	private int a;
	protected int x = 199999;

	public AClass(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("AClass constructor, alhumdulillah");
		this.a = a;
	}

	public int getA() {
		return this.a;
	}

	protected int getX() {
		return this.x;
	}
}
