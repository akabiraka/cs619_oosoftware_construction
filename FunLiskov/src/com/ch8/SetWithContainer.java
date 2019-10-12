package com.ch8;

import java.awt.Container;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetWithContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new  HashSet();
		Vector x = new Vector();
		Vector y = new Vector();
		print(s, x, y);
//		s.insert(new Container(x));
	}

	public static void print(Set s, Vector x, Vector y) {
		System.out.println(s.toString());
		System.out.println(x.toString());
		System.out.println(y.toString());
	}

}
