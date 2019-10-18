package com.ch5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserGeneric<T> {
	private final List<T> choiceList;
	
	public ChooserGeneric(Collection<T> choices) {
		this.choiceList = new ArrayList<T>(choices);
	}
	
	public T choose() {
		Random rnd = ThreadLocalRandom.current();
		return this.choiceList.get(rnd.nextInt(choiceList.size()));
	}
}
