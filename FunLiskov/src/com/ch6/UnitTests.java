package com.ch6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test_UsingIterator() {
		List<String> list = Arrays.asList("ant", null, "bee", "cat", "dog", null);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Test
	void test_UsingStringIterator() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("ant", null, "bee", "cat", "dog", null));
		Iterator<String> iterator = new StringIterator(list);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}

	@Test
	void test_UsingMyString() {
		MyString myString = new MyString("alhumdulliah");
		Iterator<Character> iterator = myString.iterator();
		while (iterator.hasNext()) {
			Character character = (Character) iterator.next();
			System.out.println(character);
		}

		assertThrows(NoSuchElementException.class, () -> iterator.next());
		assertThrows(NoSuchElementException.class, () -> iterator.next());
		assertThrows(NoSuchElementException.class, () -> iterator.next());
		assertThrows(UnsupportedOperationException.class, () -> iterator.remove());
		assertThrows(UnsupportedOperationException.class, () -> iterator.remove());

		for (Character character : myString) {
			System.out.println(character);
		}
	}
	
	@Test
	void test_using_TwoWayIterator() {
		TwoWayIterator<Character> iterator = new TwoWayIterator<Character>("abcd");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
