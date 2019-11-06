import java.util.*;

public final class IntSet implements Cloneable {
	private List<Integer> els;

	public IntSet() {
		els = new ArrayList<Integer>();
	}

	/**
	 * Put x into this.
	 * 
	 * @param x to be put in this
	 */
	public void put(int x) {
		if (!this.els.contains(x)) {
			this.els.add(x);
		}
	}

	/**
	 * Follows general contract of Object's equals method. As this class is final,
	 * it prohibits subclassing.
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof IntSet))
			return false;
		IntSet other = (IntSet) obj;
		if (other.els.size() != this.els.size())
			return false;
		for (Integer i : this.els)
			if (!other.els.contains(i))
				return false;
		return true;
	}

	/**
	 * Follows general contract of Object's hashCode method.
	 */
	@Override
	public int hashCode() {
		int sum = 0;
		for (Integer i : els) {
			sum += i.hashCode();
		}
		return sum;

	}

	/**
	 * Follows general contract of Object's clone method.
	 */
	@Override
	public IntSet clone() {
		try {
			IntSet intSet = (IntSet) super.clone();
			intSet.els = new ArrayList<Integer>(this.els);
			return intSet;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	/**
	 * Implements the string representation of this.
	 */
	@Override
	public String toString() {
		return this.els.toString();
	}
}