package com.ch5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//public class Chooser<T> {
//	private final T[] choiceArray;
//
//	@SuppressWarnings("unchecked")
//	public Chooser(Collection<T> choices) {
//		// whatever type of collection is passed as argument, we are putting into same
//		// type of array of that, so this cast is safe
//		this.choiceArray = (T[]) choices.toArray();
//	}
//
//	public Object choose() {
//		Random rnd = ThreadLocalRandom.current();
//		return choiceArray[rnd.nextInt(this.choiceArray.length)];
//	}
//}

public class Chooser<E> {
	private final List<E> choiceList;
	
	public Chooser(Collection<E> choices) {
		// TODO Auto-generated constructor stub
		this.choiceList = new ArrayList<E>(choices);
	}
	
	public E choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(this.choiceList.size()));
	}
}