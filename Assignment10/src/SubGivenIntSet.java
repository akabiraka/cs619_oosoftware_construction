
public class SubGivenIntSet extends GivenIntSet implements Cloneable{
	private String extraVar;
	
	public SubGivenIntSet(String extraVar) {
		super();
		this.extraVar = extraVar;
	}
	
	@Override
	public SubGivenIntSet clone() {
		SubGivenIntSet result = (SubGivenIntSet) super.clone();
		result.extraVar = this.extraVar;
		return result;
	}
}
