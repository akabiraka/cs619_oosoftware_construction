package using.iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MyStringUnitTests {

	@Test
	void test_remove() {
		assertThrows(UnsupportedOperationException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				MyString myString = new MyString("");
				Iterator myIterator =  myString.myIterator();
				myIterator.remove();
			}
		});
	}
	
	@Test
	void test_walkthrough() {
		MyString myString = new MyString("cat");
		Iterator myIterator = myString.myIterator();
		assertEquals(true, myIterator.hasNext());
		System.out.println(myIterator.next());
	}

}
