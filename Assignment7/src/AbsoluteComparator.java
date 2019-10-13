import java.util.Comparator;

public class AbsoluteComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return Integer.valueOf(Math.abs(e1)).compareTo(Integer.valueOf(Math.abs(e2)));
	}
}
