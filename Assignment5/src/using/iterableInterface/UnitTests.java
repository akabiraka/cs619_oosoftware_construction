package using.iterableInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class UnitTests {

	@Test
	void test_remove() {
		assertThrows(UnsupportedOperationException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				MyString myString = new MyString("car");
				Iterator<MyString> itr = myString.iterator();
				itr.remove();
			}
		});
	}
	
	@Test
	void test_null() {
		assertThrows(NullPointerException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				new MyString(null);
			}
		});
	}
	
	@Test
	void test_palindrome() {
		MyString myString = new MyString("bat");
		ImmutableIterator itr = myString.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.getFront());
			itr = (ImmutableIterator) itr.next();
		}
		
		String palindrome = new String("");
		while(itr.hasPrevious()) {
			palindrome = palindrome + itr.getTail();
			itr = (ImmutableIterator) itr.previous();
		}
		assertEquals("tab", palindrome);
	}

}
