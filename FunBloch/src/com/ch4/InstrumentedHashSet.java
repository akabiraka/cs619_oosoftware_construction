package com.ch4;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E>{
	private static final long serialVersionUID = 1L;
	private int addCount = 0;
	InstrumentedHashSet() {
		super();
	}
	
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount = addCount + c.size();
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return addCount;
	}
}
