package com.ch6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyString implements Iterable<Character> {
	private final String str;

	public MyString(String str) {
		this.str = str;
	}

	@Override
	public Iterator<Character> iterator() {
		return new MyStringIterator(str);
	}

	private static class MyStringIterator implements Iterator<Character> {
		private final String myStr;
		private int crntIndex;

		public MyStringIterator(String myStr) {
			this.myStr = myStr;
			this.crntIndex = 0;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return crntIndex < myStr.length();
		}

		@Override
		public Character next() {
			if (crntIndex >= myStr.length()) {
				throw new NoSuchElementException();
			}
			Character ch = myStr.charAt(crntIndex);
			crntIndex++;
			return ch;
		}
	}
}
