import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BoundedQueue {

	protected Object rep[];
	protected int front = 0;
	protected int back = -1;
	protected int size = 0;
	protected int count = 0;

	public BoundedQueue(int size) {
		if (size > 0) {
			this.size = size;
			rep = new Object[size];
			back = size - 1;
		}
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public boolean isFull() {
		return (count == size);
	}

	public int getCount() {
		return count;
	}

	public int getSize() {
		return size;
	}

	public void put(Object e) {
		if (e != null && !isFull()) {
			back++;
			if (back >= size)
				back = 0;
			rep[back] = e;
			count++;
		}
	}

	public Object get() {
		Object result = null;
		if (!isEmpty()) {
			result = rep[front];
			rep[front] = null;
			front++;
			if (front >= size)
				front = 0;
			count--;
		}
		return result;
	}

	@SafeVarargs
	public static void dangerousa(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = intList; // Heap pollution
//		assertThrows(ClassCastException.class, () -> stringLists[0].get(0));
		Object o = (Object) stringLists[0].get(0); // ClassCastException
		System.out.println(o);
		assertThrows(ClassCastException.class, () -> {
			System.out.println(stringLists[0].get(0));
		});
	}

	public static void main(String args[]) {
		List<String> list = Arrays.asList("cat", "dog");
		dangerousa(list);
	}
}