package com.ch10;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Exceptions {
	
	/**
	 * @param iterator An iterator object to find the next.
	 * @throws IllegalArgumentException when {@link NoSuchElementException} occurs
	 */
	public void exceptionChaining (Iterator<Integer> iterator){
		try {
			iterator.next();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			throw new IllegalArgumentException(e);
		}
	}
}