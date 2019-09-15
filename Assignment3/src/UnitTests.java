

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class UnitTests {
	
	@Test
	void test_pop_emptyStack() {
		Stack stack = new Stack();
		assertThrows(EmptyStackException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				stack.pop();
			}
		});
	}
	
	@Test
	void test_top_emptyStack() {
		Stack stack = new Stack();
		assertThrows(EmptyStackException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				stack.top();
			}
		});
	}
	
	@Test
	void test_immutabilityAfterObjectBeingPushed() {
		Stack stack = new Stack();
		Stack stack2 = stack.push("cat");
		assertEquals(false, stack2.equals(stack));
	}
	
	@Test
	void test_immutabilityAfterObjectBeingPoppedUp() {
		Stack stack = new Stack();
		stack = stack.push("cat");
		Stack stack2 = stack.pop();
		assertEquals(false, stack2.equals(stack));
	}
	
	@Test
	void test_push_happyPath() {
		Stack stack = new Stack();
		stack = stack.push("cat");
		stack = stack.push("dog");
		assertEquals(stack.getSize(), 2);
	}
	
	@Test
	void test_pop_happyPath() {
		Stack stack = new Stack();
		stack = stack.push("cat");
		stack = stack.push("dog");
		stack = stack.pop();
		assertEquals(stack.getSize(), 1);
	}
	
	@Test 
	void test_top_happyPath() {
		Stack stack = new Stack();
		stack = stack.push("cat");
		stack = stack.push("dog");
		assertEquals("dog", stack.top());
	}
	
	@Test
	void test_happyPath() {
		Stack stack = new Stack();
		stack = stack.push("cat");
		stack = stack.push("dog");
		stack = stack.push("cow");
		Object object = stack.top();
		stack = stack.push("mouse");
		stack = stack.pop();
		stack = stack.pop();
		object = stack.top();
		stack = stack.pop();
		object = stack.top();
		stack = stack.pop();
		assertEquals(0, stack.getSize());
	}

}
