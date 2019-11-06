import java.util.*;

public class GivenIntSet implements Cloneable {
	private List<Integer> els;

	@Override
	public boolean equals(Object obj) { // Standard recipe
		if (!(obj instanceof GivenIntSet))
			return false;

		GivenIntSet s = (GivenIntSet) obj;
		return false;
	}

	@Override
	public int hashCode() {
		// see below
		return 42;
	}

	public GivenIntSet() {
		els = new ArrayList<Integer>();
	}

	private GivenIntSet(List<Integer> list) {
		els = list;
	}

	@Override
	public GivenIntSet clone() {
		return new GivenIntSet(new ArrayList<Integer>(els));
	}
}