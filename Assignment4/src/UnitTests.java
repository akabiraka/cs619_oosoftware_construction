import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class UnitTests {

	@Test
	void test_push() {
		Stack stack = new Stack();
		stack.push(null);
		stack.push(null);
		stack.push(null);
		stack.push("cat");
		stack.push("dog");
		System.out.println(stack.toString());
	}

	@Test
	void test_push_maintains_repinv() {
		Stack stack = new Stack();
		stack.push("cat");
		stack.push("dog");
		assertEquals(true, stack.repOk());
	}
	
	@Test
	void test_nullStack_repinv() {
		Stack stack = new Stack();
		assertEquals(true, stack.repOk());
	}

	@Test
	void test_pop_maintains_repinv() {
		Stack stack = new Stack();
		stack.push(2.718);
		stack.push("dog");
		stack.pop();
		stack.pop();
		assertEquals(true, stack.repOk());
	}
	
	@Test
	void test_repinv_violation() {
		Stack stack = new Stack();
		stack.push(2.718);
		stack.push("dog");
		stack.pop();
		stack.pop();
		assertEquals(false, stack.repOk());
	}

}
