package com.ch4;

public class MySuper implements Cloneable{
	private int x;
	public MySuper(int x) {
		overrideMe();
		this.x=x;
	}
	
	public void overrideMe() {
		System.out.println("MySuper.overrideMe");
	}
	
	@Override
	public MySuper clone() {
		try {
			Object object = super.clone();
			MySuper super1 = (MySuper) object;
			super1.x = this.x;
			return super1;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MySuper)) {
			System.out.println("here");
			return false;
		}
		MySuper other = (MySuper) o;
		return this.x==other.x;
	}
}
