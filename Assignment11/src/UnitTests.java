import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class UnitTests {
	@Test
	void test_List_equals() {
		List<String> list = new InstrumentedList<String>(new ArrayList<String>());
		list.add("ant");
		list.add("bee");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("ant");
		list2.add("bee");
		
		List<String> list3 = new LinkedList<String>();
		list3.add("ant");
		list3.add("bee");
		
		assertTrue(list.equals(list2));
		assertTrue(list2.equals(list)); //symmetry 
		
		assertTrue(list.equals(list2));
		assertTrue(list2.equals(list3));
		assertTrue(list.equals(list3)); //transitivity
	}
	
	@Test
	void test_Collection_equals() {
		Collection<String> hashSetCollection = new HashSet<String>();
		hashSetCollection.add("ant");
		hashSetCollection.add("bee");
		
		Collection<String> instrumentedCollection = new InstrumentedCollection<String>(new HashSet<String>());
		instrumentedCollection.add("ant");
		instrumentedCollection.add("bee");
		
		assertTrue(instrumentedCollection.equals(hashSetCollection)); 
		assertFalse(hashSetCollection.equals(instrumentedCollection)); // broken symmetry rule
	}

}
