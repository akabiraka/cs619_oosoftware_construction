package com.ch8;


public class BClass {
	
	private AClass a;
	
	public BClass(AClass a) {
		this.a = new AClass(a);
	}
	
	public void doSomething() {
		this.a.doSomething();
	}
}
