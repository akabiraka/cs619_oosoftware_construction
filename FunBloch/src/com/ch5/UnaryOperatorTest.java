package com.ch5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest<T> {

	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	private static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("jute", "hemp", "nylon");
		UnaryOperator<String> sameOperator = identityFunction();
		for (String s : strings)
			System.out.println(sameOperator.apply(s));
	}

	public static <T extends Comparable<T>> T max(Collection<T> collection) {
		if (collection.isEmpty()) {
			throw new NoSuchElementException("max");
		}
		Iterator<T> iterator = collection.iterator();
		T result = iterator.next();
		while (iterator.hasNext()) {
			T e = iterator.next();
			if (e.compareTo(result) > 0)
				result = e;
		}

		return result;
	}

	

}
