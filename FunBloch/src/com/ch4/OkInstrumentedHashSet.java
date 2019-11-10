package com.ch4;

import java.util.Collection;
import java.util.Set;

public class OkInstrumentedHashSet<E> extends ForwardingSet<E>{
	private int addCount = 0;
	public OkInstrumentedHashSet(Set<E> s) {
		super(s);
	}
	
	@Override
	public boolean add(E e) {
		this.addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		this.addCount += c.size();
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return this.addCount;
	}
}
