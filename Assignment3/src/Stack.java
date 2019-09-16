

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

	private Stack(Object[] elements) {
		this.elements = elements;
		this.size = elements.length;
	}

	/**
	 * Push an Object at the top of the Stack.
	 * 
	 * @param e The Object to be pushed.
	 * @return Stack after e being pushed.
	 * @throws IllegalArgumentException if e is null.
	 */
	public Stack push(Object e) {
		if (e == null)
			throw new IllegalArgumentException("Stack.push: cannot push null object.");
		Object[] oldElements = new Object[this.elements.length + 1];
		System.arraycopy(this.elements, 0, oldElements, 0, this.elements.length);
		oldElements[this.elements.length] = e;
		return new Stack(oldElements);
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
		if (size == 0)
			throw new EmptyStackException("Stack.pop: Stack is empty.");
		Object[] newElements = new Object[this.elements.length-1];
		System.arraycopy(this.elements, 0, newElements, 0, newElements.length);
		return new Stack(newElements);
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
		if (size == 0)
			throw new EmptyStackException("Stack.top: No element at the top, Stack is empty.");
		return this.elements[this.elements.length - 1];
	}

	/**
	 * Returns the current size of the Stack.
	 * 
	 * @return The size of the Stack.
	 */
	public int getSize() {
		return size;
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
