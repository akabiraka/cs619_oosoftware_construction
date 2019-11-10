package com.ch4;

import java.io.Serializable;
import java.sql.Date;

public class MySub extends MySuper implements Cloneable, Serializable{

	private final Date date;
	public MySub(int x) {
		super(x);
		overrideMe();
		date = new Date(0);
	}
	
	@Override
	public void overrideMe() {
		System.out.println("MySub.overrideMe: " + date);
	}
}
