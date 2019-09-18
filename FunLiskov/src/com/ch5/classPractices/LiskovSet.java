package com.ch5.classPractices;

import java.util.*;
/*
 * Liskov's IntSet example (called LiskovSet), with minor changes
 * This version doesn't include AF or RI
 */

public class LiskovSet {

	// Overview: LiskovSets were unbounded, mutable sets of integers. I converted it
	// as immutable.
	private List<Integer> els; // the rep

	// constructor
	// EFFECTS: Intitializes this to be empty
	public LiskovSet() {
		els = new ArrayList<Integer>();
	}
	
	private LiskovSet(List<Integer> integers) {
		this.els = new ArrayList<Integer>(integers);
	}

	// methods
	// MODIFIES this
	// EFFECTS: Adds x to the elements of this
//  public void insert (int x) {
//     if (els.indexOf(x) < 0)    // could also self-use isIn()
//     els.add(x);
//  }

	public LiskovSet insert(int x) {
		LiskovSet newLiskovSet = new LiskovSet(this.els);
		if (this.isIn(x))
			return newLiskovSet;
		newLiskovSet.els.add(x);
		return newLiskovSet;
	}
	// MODIFIES this
	// EFFECTS: Removes x from this
//  public void remove (int x) {
//     int index = els.indexOf(x);
//     if (index < 0) return;
//     els.set(index, els.get(els.size()-1));
//     els.remove(els.size()-1);
//  }
	public LiskovSet remove(int x) {
		LiskovSet liskovSet = new LiskovSet(this.els);
		int index = liskovSet.els.indexOf(x);
		if (index < 0) {
			return liskovSet;
		}
		liskovSet.els.set(index, liskovSet.els.get(liskovSet.size() - 1));
		liskovSet.els.remove(liskovSet.size() - 1);
		return liskovSet;
	}

	// EFFECTS: Returns true if x is in this else returns false
	public boolean isIn(int x) {
		return els.indexOf(x) >= 0; // could also use contains()
	}

	// EFFECTS: Returns the cardinality of this
	public int size() {
		return els.size();
	}

	// EFFECTS: If this is empty throw IllegalStateException
	// else returns an arbitrary element of this
	public int choose() {
		return els.get(els.size() - 1);
	}
}
