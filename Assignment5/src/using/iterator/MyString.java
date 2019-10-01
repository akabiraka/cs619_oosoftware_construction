package using.iterator;

import java.util.Iterator;

public final class MyString {
	private String str;

	public MyString(String str) {
		// TODO Auto-generated constructor stub
		this.str = new String(str);
	}

	public String get() {
		return new String(this.str);
	}

	public Iterator<MyStringIterator> myIterator() {
		return new MyStringIterator(this);
	}

	private class MyStringIterator implements Iterator<MyStringIterator> {
		private int i;
		private MyString me;

		public MyStringIterator(MyString it) {
			// TODO Auto-generated constructor stub
			this.i = 0;
			this.me = it;
		}

		private MyStringIterator(MyString it, int i) {
			// TODO Auto-generated constructor stub
			this.i = i;
			this.me = it;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (i < this.me.str.length())
				return true;
			return false;
		}

		@Override
		public MyStringIterator next() {
			// TODO Auto-generated method stub
			return new MyStringIterator(this.me, this.i + 1);
		}

		public String getFront() {
			return new String(this.me.str.substring(i, i + 1));
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("MyString.remove");
		}
	}
}
