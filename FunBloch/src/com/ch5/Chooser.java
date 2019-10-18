package com.ch5;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
	private final T[] choiceArray;
	
	public Chooser(Collection<T> choices) {
		// TODO Auto-generated constructor stub
		this.choiceArray = (T[]) choices.toArray();
	}
	
	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(this.choiceArray.length)];
	}

}
