package com.ch8;

public class AClass extends Object{
	private AClass a;
	
	public AClass(AClass a) {
		this.a = a;
	}
	
	public void doSomething() {
		System.out.println("A Class");
	}
}
