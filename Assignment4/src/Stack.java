
/**
 * Bloch's Stack example page 60, 3rd edition. The unbounded, mutable
 * implementation of Stack.
 * 
 * The abstraction function is: 
 * AF(c) = 	c_n 
 * 			c_(n-1) 
 * 			... 
 * 			... 
 * 			... 
 * 			c_1 
 * 			c_0 
 * where c_i = c.elements[i] for 0 <= i <= n-1. Here n represents c.size
 * 
 * The rep invariant is: 
 * c.size <= c.elements.length 
 * c.size >= 0 
 * All items from c.elements[c.size] to c.elements[c.elements.length-1] must be null
 */

public class Stack {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new IllegalStateException("Stack.pop");
		Object result = elements[--size];
		// elements[size] = null; // If we remove this line, the rep-inv will be broken.
		return result;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			Object oldElements[] = elements;
			elements = new Object[2 * size + 1];
			System.arraycopy(oldElements, 0, elements, 0, size);
		}
	}

	/**
	 * Checks whether the rep-inv is ok for this or not.
	 * 
	 * @return true if rep-inv is ok, otherwise false.
	 */
	public boolean repOk() {
		if (this.size < 0 || this.size > this.elements.length)
			return false;
		for (int i = this.size; i < elements.length; i++) {
			if (this.elements[i] != null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The string representation of this.
	 * 
	 * @return the string representation of this with concatenation of
	 *         "class_name@the_unsigned_hexadecimal_representation_of_the_hash_code_of_the_object"
	 *         at the first line.
	 */
	@Override
	public String toString() {
		String str = super.toString();
		for (int i = this.size - 1; i >= 0; i--) {
			str = str + "\n" + this.elements[i];
		}
		return str;
	}

}
