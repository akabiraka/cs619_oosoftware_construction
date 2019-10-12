package Inclass7;

import java.util.Comparator;

public class EvensB4OddsComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer e1, Integer e2) {
		// TODO Auto-generated method stub

		if (Math.abs(e1) % 2 == 0 && Math.abs(e2) % 2 == 1) {
			return -1;
		} else if (Math.abs(e1) % 2 == 1 && Math.abs(e2) % 2 == 0) {
			return 1;
		}
		return e1.compareTo(e2);
	}

}
