package com.ch6;

import java.util.Stack;

public class TwoWayIterator<Char> {
	private Stack<Character> nextEls;
	private Stack<Character> prevEls;

	public TwoWayIterator(String str) {
		nextEls = new Stack<Character>();
		for (int i = str.length() - 1; i >= 0; i--) {
			nextEls.push(str.charAt(i));
		}
		prevEls = new Stack<Character>();
	}

	public boolean hasNext() {
		return nextEls.size() >= 1;
	}

	public Character next() {
		Character ch = nextEls.pop();
		prevEls.push(ch);
		return ch;
	}

	public boolean hasPrevious() {
		return prevEls.size() >= 1;
	}

	public Character previous() {
		Character ch = prevEls.pop();
		nextEls.push(ch);
		return ch;
	}
}
