package com.ch5.classPractices;

import java.util.Date;

public class Period {
	private final Date start;
	private final Date end;
	
	public Period(Date start, Date end) {
		// TODO Auto-generated constructor stub
		if (start.compareTo(end) > 0) {
			throw new IllegalArgumentException();
		}
		this.start = start;
		this.end = end;
	}
	public Date start() {
		return this.start;
	}
	
	public Date end() {
		return this.end;
	}
}
