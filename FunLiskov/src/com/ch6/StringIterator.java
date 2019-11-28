package com.ch6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringIterator implements Iterator<String> {
	private final List<String> els;
	private int i;

	public StringIterator(ArrayList<String> els) {
		// super() is implicit
		this.els = els;
		this.i = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return i < els.size();
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String string = els.get(i);
		i++;
		return string;
	}

}
