package com.packagevisible.only;

public class ClassA {
	private int x;
	protected int y;
	ClassA(int x, int y) {
		this.x = x;
		this.y = y;
	}

	ClassA(int x) {
		this.x = x;
	}
	
	protected int getX() {
		return x;
	}
	@Override
	public String toString() {
		return String.valueOf(x);
	}
}
