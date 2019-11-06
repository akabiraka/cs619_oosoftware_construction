import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	void test_GivenIntSet_clone_CCE() {
		SubGivenIntSet subIntSet = new SubGivenIntSet("subIntSet");
		assertThrows(ClassCastException.class, () -> subIntSet.clone());
	}
	
	@Test
	void test_equalsContract() {
		IntSet intSet = new IntSet();
		IntSet intSet2 = new IntSet();
		IntSet intSet3 = new IntSet();
		assertTrue(intSet.equals(intSet)); // reflexive
		assertTrue(intSet.equals(intSet2) && intSet2.equals(intSet)); // symmetric
		assertTrue(intSet.equals(intSet2) && intSet2.equals(intSet3) && intSet.equals(intSet3)); // transitive
		int x = (int)(Math.random()*100);
		for (int i = 0; i < x; i++) {
			assertTrue(intSet.equals(intSet2) && intSet2.equals(intSet3) && intSet.equals(intSet3)); // consistent
		}
		assertFalse(intSet.equals(null)); // non-null
	}
	
	
	@Test
	void test_cloneContract() {
		IntSet intSet = new IntSet();
		assertTrue(intSet.clone() != intSet);   // x.clone() != x
		assertTrue(intSet.clone().getClass() == intSet.getClass()); // x.clone().getClass() == x.getClass()
		assertTrue(intSet.clone().equals(intSet)); // x.clone().equals(x)
	}
	
	@Test
	void test_hashCodeContract() {
		IntSet intSet = new IntSet();
		IntSet intSet2 = new IntSet();
		assertTrue(intSet.equals(intSet2) && intSet.hashCode()==intSet2.hashCode());
		intSet2.put(111);
		assertTrue(!intSet.equals(intSet2) && intSet.hashCode()!=intSet2.hashCode());
	}

}
