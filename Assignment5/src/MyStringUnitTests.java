import static org.junit.jupiter.api.Assertions.*;

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
				myString.remove();
			}
		});
	}
	
	@Test
	void test_getFront() {
		MyString myString = new MyString("cat");
		System.out.println(myString.getFront());
		assertEquals("c", myString.getFront());
	}
	
	@Test
	void test_next() {
		MyString myString = new MyString("cat");
		while (myString.hasNext()) {
			System.out.println(myString.getFront());
			myString = myString.next();
		}
	}

}
