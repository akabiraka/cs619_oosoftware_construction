package Inclass7;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Comparable>{

	@Override
	public int compare(Comparable e1, Comparable e2) {
		// TODO Auto-generated method stub
		return -e1.compareTo(e2);
	}

}
