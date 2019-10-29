package com.ch5;

import java.util.ArrayList;
import java.util.List;

public class InClass7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "bat";
		Integer x = 7;
		Object[] objects;
		List rawList;
		List<Object> objectList;
		List<String> stringList;

		objects = new String[1];
		objects[0] = string;
//	    objects[0] = x; // runtime error

		objects = new Object[1];
		objects[0] = string;
		objects[0] = x;

		stringList = new ArrayList<String>();
		stringList.add(string);

//	    objectList = new ArrayList < String >();
//	    objectList.add(string) ;

		objectList = new ArrayList<Object>();
		objectList.add(string);
		objectList.add(x);

		rawList = new ArrayList();
		rawList.add(string);
		rawList.add(x);
	}

}
