package com.ch6;

public enum Ensemble {
	
//	worst example
//	SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
//	
//	public int numberOfMusicians() {
//		return ordinal() +1; 
//	}
	
//	good example
	SOLO(1), DUET(2), TRIO(3), TRIPLE_QUARTET(12);
	
	private final int numberOfMusicians;
	private Ensemble(int numberOfMusicians) {
		this.numberOfMusicians = numberOfMusicians;
	}
	
	public int numberOfMusicians() {
		return numberOfMusicians;
	}
}
