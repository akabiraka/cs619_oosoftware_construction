package com.ob;

import java.util.Iterator;
import java.util.List;

public class OB {
	
	public static <T extends Comparable<? super T>> T min(List <? extends T> list) {
		if(list.size() == 0)
			throw new IllegalArgumentException("Min.min");
		
		T result = list.get(0);
		for (T comp : list) {
			if (comp.compareTo(result) < 0) { // throws exception NPE, CCE as needed
				result = comp;
			}
		}
		return result;
	}
}
