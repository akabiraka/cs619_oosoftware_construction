
public class SubIntSet{
	private String name;
	
	public SubIntSet(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof SubIntSet)) {
			return false;
		}
		SubIntSet other = (SubIntSet) o;
		return super.equals(other) && other.name.equals(this.name);
	}
}
