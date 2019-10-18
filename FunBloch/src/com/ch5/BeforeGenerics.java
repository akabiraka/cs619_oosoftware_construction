package com.ch5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BeforeGenerics {
	public static void main(String args[]) {
		Set set = new TreeSet();
		add(set, Integer.valueOf(5));
	}

	private static void unsafeadd(List<Object> list, Object o) {
		list.add(o);
	}

	public static void add(Set s, Object o) {
		s.add(o);
	}

	public static int elementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}

	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}
