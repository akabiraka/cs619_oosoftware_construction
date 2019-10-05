package using.iterableInterface;

import java.util.NoSuchElementException;

public final class MyString implements Iterable {
	private String str;

	public MyString(String str) {
		// TODO Auto-generated constructor stub
		if (str == null)
			throw new NullPointerException("MyString: string can not be null");
		this.str = new String(str);
	}

	public String get() {
		return new String(str);
	}

	@Override
	public ImmutableIterator iterator() {
		// TODO Auto-generated method stub
		return new MyStringIterator(this, 0);
	}

	private class MyStringIterator implements ImmutableIterator {
		private int i;
		private MyString me;

		private MyStringIterator(MyString it, int i) {
			// TODO Auto-generated constructor stub
			this.i = i;
			this.me = it;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (this.i < this.me.str.length())
				return true;
			return false;
		}

		@Override
		public MyStringIterator next() {
			// TODO Auto-generated method stub
			if (this.i >= this.me.str.length())
				throw new NoSuchElementException();
			return new MyStringIterator(this.me, this.i + 1);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("MyString.remove");
		}

		@Override
		public String getFront() {
			// TODO Auto-generated method stub
			if (this.i >= this.me.str.length())
				throw new NoSuchElementException("MyString.getFront");
			return new String(this.me.str.substring(i, i + 1));
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			if (this.i > 0)
				return true;
			return false;
		}

		@Override
		public ImmutableIterator previous() {
			// TODO Auto-generated method stub
			if (this.i < 0)
				throw new NoSuchElementException("MyString.previous");
			return new MyStringIterator(this.me, this.i - 1);
		}

		@Override
		public String getTail() {
			// TODO Auto-generated method stub
			if (this.i < 0)
				throw new NoSuchElementException("MyString.getTain");
			return new String(this.me.str.substring(i - 1, i));
		}

	}

}
