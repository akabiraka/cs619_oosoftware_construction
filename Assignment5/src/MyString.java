
public final class MyString {
	private String str;
	private int i;

	public MyString(String str) {
		this.str = new String(str);
		this.i = 0;
	}

	private MyString(String str, int i) {
		this.str = new String(str);
		this.i = i;
	}

	public boolean hasNext() {
		if (this.i < this.str.length())
			return true;
		return false;
	}

	public String getFront() {
		return new String(this.str.substring(i, i + 1));
	}

	public MyString next() {
		return new MyString(this.str, this.i + 1);
	}

	public void remove() {
		throw new UnsupportedOperationException("MyString.remove");
	}

	public String get() {
		return new String(this.str);
	}
}
