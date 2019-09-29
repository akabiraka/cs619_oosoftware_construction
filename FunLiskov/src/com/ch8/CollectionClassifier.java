package com.ch8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Broken! - What does this program print?
public class CollectionClassifier {
	

	public static void main(String[] args) {
		Collection<?> hSet = new HashSet<String>();
		System.out.println(hSet.getClass());

		Collection<?>[] collections = {
				new HashSet<String>(), new ArrayList<BigInteger>(), new HashMap<String, String>().values() };
		XCollections xCollections = new XCollections();
		for (Collection<?> c : collections) {
			System.out.println(c.getClass());
//			System.out.println(xCollections.classify(c));
		}

	}
}