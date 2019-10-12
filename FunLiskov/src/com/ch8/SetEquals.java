package com.ch8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<List<String>> s = new HashSet<List<String>>();
		List<String> x = new ArrayList<String>();
		List<String> y = new ArrayList<String>();
		print(s, x, y);
		s.add(x);
		s.add(y);
		print(s, x, y);
		System.out.println(s.contains(y));
		y.add("cat");
		System.out.println(s.contains(y));
		print(s, x, y);
		s.add(y);
		print(s, x, y);
		y.remove("cat");
		print(s, x, y);
		s.remove(y);
		print(s, x, y);
		System.out.println(s.contains(y));
	}
	
	public static void print(Set<List<String>> s, List<String> x, List<String> y) {
		System.out.println(s.toString());
		System.out.println(x.toString());
		System.out.println(y.toString());
	}

}
