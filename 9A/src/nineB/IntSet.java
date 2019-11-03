package nineB;

import java.util.ArrayList;
import java.util.List;

public class IntSet implements Cloneable {
	private ArrayList<Integer> els;

	public IntSet() {
		// TODO Auto-generated constructor stub
		els = new ArrayList<Integer>();
	}
	
	public void put(Integer x) {
		if (!els.contains(x)) {
			this.els.add(x);
		}
	}
	
	private IntSet(ArrayList<Integer> list) {
		els = list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IntSet clone() throws CloneNotSupportedException {
		IntSet intSet = (IntSet) super.clone();
//		intSet.els = new ArrayList<Integer>(els);
		intSet.els = (ArrayList<Integer>) els.clone();
		return intSet;
//		return new IntSet(new ArrayList<Integer>(els));
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof IntSet)) {
			return false;
		}
		IntSet other = (IntSet) o;
		return other.els.equals(this.els);
	}
	
	@Override
	public int hashCode() {
//		return 42;
//		return this.els.hashCode();
		int sum =0;
		for(Integer i:els)
			sum += i.hashCode();
		return sum;
	}
	
	@Override 
	public String toString() {
		return this.els.toString();
	}
	
	
}
