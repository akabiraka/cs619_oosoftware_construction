import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;



class JUnitTests {

	@Test
	void test_insert() {
		Bag<String> bag = new Bag<String>();
		System.out.println(bag.size());
		bag.insert("cat");
		System.out.println(bag.size());
		bag.insert("cat");
		System.out.println(bag.size());
		bag.insert("dog");
		System.out.println(bag.toString());
	}
	
	@Test
	void test_isIn() {
		Bag<String> bag = new Bag<String>();
		bag.insert("cat");
		bag.insert("cat");
		assertTrue(bag.isIn("cat"));
		assertFalse(bag.isIn("dog"));
	}
	
	@Test
	void test_remove() {
		Bag<String> bag = new Bag<String>();
		bag.insert("cat");
		bag.insert("cat");
		assertEquals(2, bag.size());
		bag.remove("cat");
		assertEquals(1, bag.size());
	}
	
	@Test
	void test_choose() {
		Bag<String> bag = new Bag<String>();
		assertThrows(IllegalStateException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				bag.choose();
			}
		});
		bag.insert("cat");
		assertEquals("cat", bag.choose());
		bag.insert("cat");
		bag.insert("dog");
		assertEquals("cat", bag.choose());
	}
	
	@Test
	void test_repOk() {
		Bag<String> bag = new Bag<String>();
		assertTrue(bag.rekOk());
		bag.insert("cat");
		assertTrue(bag.rekOk());
		bag.insert("cat");
		assertTrue(bag.rekOk());
		bag.isIn("cat");
		bag.insert("dog");
		assertTrue(bag.rekOk());
		bag.remove("cat");
		bag.choose();
		assertTrue(bag.rekOk());
		bag.remove("dog");
		bag.size();
		assertTrue(bag.rekOk());
		bag.remove("dog");
		bag.toString();
		assertTrue(bag.rekOk());
	}

}
