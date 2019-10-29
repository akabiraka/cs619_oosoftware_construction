package Generic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test_queueCreation() {
		// negative-sized buffer creation not allowed
		assertThrows(IllegalArgumentException.class, () -> {
			BoundedQueue<String> q = new BoundedQueue<String>(-5);
		});

		// zero-sized buffer-creation allowed
		BoundedQueue<String> q = new BoundedQueue<String>(0);
		assertEquals(0, q.getSize());

		// happy queue
		BoundedQueue<Number> queue = new BoundedQueue<Number>(10);
		for (int i = 0; !queue.isFull(); i++) {
			queue.put(Integer.valueOf(i));
			System.out.println("put: " + i);
		}
		while (!queue.isEmpty()) {
			System.out.println("get: " + queue.get());
		}

		assertTrue(queue.repOk());
	}

	@Test
	void test_typeParamE() {
		// we can put subtype of type parameter E in queue.
		BoundedQueue<Number> q = new BoundedQueue<Number>(10);
		Integer integer = Integer.valueOf(1);
		Double double1 = Double.valueOf(1.111);
		q.put(integer);
		q.put(double1);
		Number aNumber = q.get();
		Number bNumber = q.get();
		assertEquals(0, q.getCount());
		assertTrue(q.repOk());
	}

	@Test
	void test_boundedWildcard() {
		BoundedQueue<Number> q = new BoundedQueue<Number>(10);
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		q.putAll(integers);
		List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
		q.putAll(doubles);
		List<Number> numbers = new ArrayList<Number>();
		q.getAll(numbers);
		System.out.println(numbers);
		assertEquals(integers.size() + doubles.size(), numbers.size());
		assertTrue(q.repOk());
	}

	@Test
	void test_emptyQ() {
		BoundedQueue<Number> q = new BoundedQueue<Number>(0);
		assertThrows(IllegalStateException.class, () -> q.put(5)); // putting an item into empty queue
		assertThrows(IllegalStateException.class, () -> q.get()); // getting an item from empty queue
		List<Number> numbers = new ArrayList<Number>();
		assertThrows(IllegalStateException.class, () -> q.getAll(numbers)); // getting all items from empty queue
		numbers.add(5.5);
		numbers.add(0);
		assertThrows(IllegalArgumentException.class, () -> q.putAll(numbers)); // putting a collection into empty queue
		assertTrue(q.repOk());
	}

	@Test
	void test_nullAndEmptyOperation() {
		BoundedQueue<String> q = new BoundedQueue<String>(10);
		assertThrows(NullPointerException.class, () -> q.put(null)); // putting null value into queue
		List<String> stringList = Arrays.asList(null, null, null);
		assertThrows(NullPointerException.class, () -> q.putAll(stringList)); // putting a collection that contains null value into queue
		List<String> stringList2 = new ArrayList<String>();
		q.putAll(stringList2);
//		assertThrows(IllegalArgumentException.class, () -> q.putAll(stringList2)); // putting an empty collection into queue
		List<String> stringList3 = null;
		assertThrows(NullPointerException.class, () -> q.getAll(stringList3)); // passing null destination to receive all items from queue 
		assertTrue(q.repOk());
	}
	
	@Test
	void test_fullQ() {
		BoundedQueue<String> q = new BoundedQueue<String>(2);
		q.put("cat");
		q.put("dog");
		assertThrows(IllegalStateException.class, () -> q.put("elephant")); // putting an item into full queue
		List<String> stringList = Arrays.asList("mouse", "bird");
		assertThrows(IllegalArgumentException.class, () -> q.putAll(stringList)); // putting a collection into full queue 
		assertTrue(q.repOk());
	}

}
