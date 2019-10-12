package com.ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>();
		words.add("asfg");
		words.add("c");
		words.add("a");
		words.add("alhumdulillah");
//		Comparator<String> comparator = new Comparator<String>() {
//			@Override
//			public int compare(String arg0, String arg1) {
//				// TODO Auto-generated method stub
//				return Integer.compare(arg0.length(), arg1.length());
//			}
//		};
		Collections.sort(words, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.length(), arg1.length());
			}
		});
		System.out.println(words);
	}

}
