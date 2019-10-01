package clayton;

import java.util.*;

public final class MyString implements Iterable {

	private String string;

	public MyString(String string) {

		this.string = string;

	}

	public String getString() {

		return string;

	}

	public Iterator iterator() {

		return new myStringIterator(this);

	}

	public class myStringIterator implements Iterator {

		private Stack<String> rep;

		public myStringIterator(MyString myString) {

			this.rep = new Stack<>();

			for (int i = myString.string.length() - 1; i >= 0; i--) {

				this.rep.push(String.valueOf(myString.string.charAt(i)));

			}

		}

		@Override

		public boolean hasNext() {
			System.out.println("here");
			return !rep.isEmpty();

		}

		@Override

		public String next() {

			if (rep.isEmpty())
				throw new NoSuchElementException("empty iterator");

			return rep.pop();

		}

		@Override

		public void remove() {

			throw new UnsupportedOperationException();

		}

	}

}