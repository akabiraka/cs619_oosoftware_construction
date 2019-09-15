/**
 * Stack is an unbounded, immutable implementation of "Bloch's Stack example
 * page 60, 3rd edition"
 */
public class Stack {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 0;

	/**
	 * Initializes Stack to be empty.
	 */
	public Stack() {
		// EFFECTS: Initializes Stack to be empty.
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	private Stack(Object[] oldElements, int size) {
		this.elements = new Object[oldElements.length];
		this.size = size;
		System.arraycopy(oldElements, 0, this.elements, 0, size);
	}

	/**
	 * Push an Object at the top of the Stack.
	 * 
	 * @param e The Object to be pushed.
	 * @return Stack after e being pushed.
	 * @throws IllegalArgumentException if e is null.
	 */
	public Stack push(Object e) {
		// EFFECTS: If e is null throws IllegalArgumentException, else return Stack
		// after e is being pushed at the top.
		if (e == null)
			throw new IllegalArgumentException("ImmutableStack.push: cannot push null object.");
		Stack stack = new Stack(elements, size);
		increaseCapacityIfNeeded(stack);
		stack.elements[size] = e;
		stack.size++;
		return stack;
	}

	/**
	 * Returns Stack after the top element being popped up.
	 * 
	 * @return Stack after top element being popped up.
	 * @throws EmptyStackException if Stack is empty.
	 */
	public Stack pop() {
		// EFFECTS: If Stack is empty throws EmptyStackException, else return Stack
		// after top element being popped up.
		if (size == 0) {
			throw new EmptyStackException("Stack.pop: Stack is empty.");
		}
		Stack stack = new Stack(elements, size - 1);
		return stack;
	}

	/**
	 * Returns the top element of the Stack.
	 * 
	 * @return Top element of the Stack.
	 * @throws EmptyStackException if no element at the top.
	 */
	public Object top() {
		// EFFECTS: If Stack is empty throws EmptyStackException, else return top Object
		// of the Stack.
		if (size == 0) {
			throw new EmptyStackException("Stack.top: No element at the top, Stack is empty.");
		}
		int topIndex = size - 1;
		return elements[topIndex];
	}

	/**
	 * Returns the current size of the Stack.
	 * 
	 * @return The size of the Stack.
	 */
	public int getSize() {
		return size;
	}

	private void increaseCapacityIfNeeded(Stack stack) {
		if (stack.elements.length == size) {
			Object oldElements[] = stack.elements;
			stack.elements = new Object[2 * size + 1];
			System.arraycopy(oldElements, 0, stack.elements, 0, size);
		}
	}
}

class EmptyStackException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyStackException() {
		super();
	}

	public EmptyStackException(String msg) {
		super(msg);
	}
}
