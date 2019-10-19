package com.ch5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test_beforeGenerics() {
		List list = new ArrayList();
		list.add(5);
		list.add("asf");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
	}

	@Test
	void test_warning() {
		List<String> list = new ArrayList<String>();
		list.add("alhumdulillah");
//		list.add(3);
	}

	@Test
	void test_list_objects() {
		List<Object> objects = new ArrayList<Object>();
		objects.add("alhuldulillah");
		objects.add(3);
		Iterator<Object> it = objects.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(object.toString());
		}
	}

	@Test
	void test_wildcardList() {
		Set<?> collection = new TreeSet<String>();
		collection.add(null);
	}

	@Test
	void test_1() {
		@SuppressWarnings("unchecked")
		Set<String> set = new HashSet();
	}

	@Test
	void test_arrayInvariants() {
		Object[] objects = new Long[1];
		assertThrows(ArrayStoreException.class, () -> {
			objects[0] = "i dont fit in";
		});
//		List<Object> objects2 = new ArrayList<Long>(); // compilation error
	}

	@Test
	void test() {
		MyStack<Number> stack = new MyStack<Number>();
		Iterable<Integer> integers = Arrays.asList(1, 2, 3, 45, 5);
		Collection<Number> numbers = new ArrayList<Number>();
		stack.pushAll(integers);
		System.out.println(stack.size());
		stack.popAll(numbers);
		System.out.println(numbers.size());
	}

	public static void dangerous(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = intList;
		System.out.println(stringLists[0].toString());
	}

	@Test
	void test_dangerous() {
		List<String> list1 = Arrays.asList("cat", "dog", "hati");
		List<String> list2 = Arrays.asList("a", "b", "n");
		dangerous(list1, list2);
	}

	public <T> T[] toArray(T... args) {
		return args;
	}

	public <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			return toArray(a, b);
		case 1:
			return toArray(b, c);
		case 2:
			return toArray(c, a);
		}
		throw new AssertionError();
	}

	@Test
	void test_main() {
		assertThrows(ClassCastException.class, () -> {
			String[] attrs = (String[]) pickTwo("good", "fast", "cheap");
		});
	}

//	@SafeVarargs
	static <T> List<T> flatten(List<List<? extends T>> lists) {
		List<T> result = new ArrayList<T>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

	@Test
	void test_fab() {
		Collection stamps = new ArrayList();
		stamps.add(Integer.valueOf(1));
		stamps.add("stamp");
		
		assertThrows(ClassCastException.class, () -> {
			for (Iterator iterator = stamps.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
			}
		});
	}
	
	@Test
	void test_fab_solved() {
		Collection<String> stamps = new ArrayList<String>();
		stamps.add("cat");
//		stamps.add(Integer.valueOf(10));
	}
	
	void unsafeAdd(List<Object> list, Object o) {
		list.add(o);
	}
	
	@Test
	void test_unsafeAdd() {
		List<String> list = new ArrayList<>();
//		unsafeAdd(list, "alhumdulillah");
//		unsafeAdd(list, Integer.valueOf(1));
		assertThrows(ClassCastException.class, () -> {
			String string = list.get(1);
		});
	}
	int numOfELementsInCommon(Set<?> s1, Set<?> s2) {
		int r = 0;
		if (s1 instanceof HashSet) {
			System.out.println(s1.getClass());
			HashSet<?> sk = (HashSet<?>)s1;
		}
		System.out.println(s1.size());
		System.out.println(s2.size());
		for(Object o: s1)
			if (s2.contains(o))
				r++;
		return r;
	}
	
	@Test
	void test_setsInCommon() {
		Set<String> s1 = new HashSet<String>();
		s1.add("cat");
		s1.add("dog");
		Set<Integer> s2 = new TreeSet<Integer>();
		assertEquals(0, numOfELementsInCommon(s1, s2));
		Collection<?> collection = new ArrayList<String>();
		collection.add(null);
//		collection.add("alhumdulillah");
		System.out.println(String[].class);
		System.out.println(int.class);
		System.out.println(List.class);
//		System.out.println(List<String>.class());
//		System.out.println(List<?>.class);	
	}
	
	@Test
	void test_warnings() {
		Set<String> set = new HashSet<>();
	}
	
	@Test
	void test_arrays_vs_generics() {
		Object[] objects = new Long[10];
		assertThrows(ArrayStoreException.class, () -> {
			objects[0] = "I dont fit in"; // runtime error
		});
//		List<Object> list = new ArrayList<Long>(); // compilation error
//		String[] strings = new Long[10]; //compilation error, array reified
	}
	
	@Test
	void test_stack() {
		Stack<String> stack = new Stack<String>();
		stack.push("alhumdulillah");
		stack.push("bismillah");	
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		Stack<List<String>> stack2 = new Stack<List<String>>();
		List<String> list = Arrays.asList("alhumdulillah", "bismillah");
		List<String> list2 = Arrays.asList("cal", "dog");
		stack2.push(list);
		stack2.push(list2);
		while(!stack2.isEmpty())
			System.out.println(stack2.pop().toString());
	}
	
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
	
}

