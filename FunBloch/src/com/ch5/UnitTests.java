package com.ch5;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

}
