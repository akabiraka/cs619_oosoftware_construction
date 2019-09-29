package com.ch8;

public class AAClass extends AClass{
	
	private AClass a;
	public AAClass(AClass a) {
		super(a);
		this.a = a;
	}
	
	@Override
	public void doSomething() {
		System.out.println("AA Class");
	}
}
