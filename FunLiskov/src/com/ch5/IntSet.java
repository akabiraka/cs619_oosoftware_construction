package com.ch5;

import java.util.Vector;

import com.customExceptions.EmptyException;

/**
 * IntSets are unbounded, mutable sets of Integers.
 * 
 * @author akabir
 */
public class IntSet {
	private Vector els; // the rep(representation), the instance variable

	// constructors
	/**
	 * Effects: Initializes this to be empty.
	 */
	public IntSet() {
		els = new Vector();
	}

	// methods
	/**
	 * @param x An integer.
	 * @return If x is in this, returns index where x appears; else returns -1
	 */
	private int getIndex(Integer x) {
		// EFFECTS: If x is in this, returns index where x appears;
		// else return -1.
		for (int i = 0; i < els.size(); i++) {
			if (x.equals(els.get(i))) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * The size of this.
	 * 
	 * @return Returns the size of this.
	 */
	public int size() {
		// EFFECTS: Returns the size of this.
		return els.size();
	}

	/**
	 * Inserts x into this.
	 * 
	 * @param x An integer to insert into this.
	 */
	public void insert(int x) {
		// MODIFIES: this
		// EFFECTS: Insert x to the elements of this.
		Integer y = Integer.valueOf(x);
		if (getIndex(y) < 0) {
			els.add(y);
		}
	}

	/**
	 * Removes x from this.
	 * 
	 * @param x An integer to remove from this.
	 */
	public void remove(int x) {
		// MODIFIES: this
		// EFFECTS: Removes x from this.
		int i = getIndex(Integer.valueOf(x));
		if (i < 0) {
			return;
		}
		els.set(i, els.lastElement());
		els.remove(els.size() - 1);
	}

	/**
	 * Whether x in this or not.
	 * 
	 * @param x An integer that is in x or not.
	 * @return Returns true if x in this, else returns false.
	 */
	public boolean isIn(int x) {
		// EFFECTS: Returns true if x in this, else returns false.
		return getIndex(Integer.valueOf(x)) >= 0;
	}

	/**
	 * Choose an element from this arbitrarily.
	 * 
	 * @return If this is empty, throws EmptyException; else returns an arbitrary
	 *         element of this.
	 */
	public int choose() {
		// EFFECTS: If this is empty, throws EmptyException; else returns an arbitrary
		// element of this.
		if (els.size() == 0) {
			throw new EmptyException("IntSet.choose");
		}
		return ((Integer) els.lastElement()).intValue();
	}
}
