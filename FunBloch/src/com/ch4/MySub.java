package com.ch4;

import java.sql.Date;

public class MySub extends MySuper{

	private final Date date;
	public MySub() {
		overrideMe();
		date = new Date(0);
	}
	
	@Override
	public void overrideMe() {
		System.out.println("MySub.overrideMe: " + date);
	}
}
