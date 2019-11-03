package nineB;

public class SubIntSet extends IntSet{
	private String name;
	
	public SubIntSet(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
	}
	
	@Override
	public SubIntSet clone() throws CloneNotSupportedException {
		SubIntSet subIntSet = (SubIntSet) super.clone();
		subIntSet.name = this.name;
		return subIntSet;
	}
}
