package inclass.excercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSomething();
	}
	
	private static void doSomething() {
		List<String> xList = new ArrayList<String>();
		xList.add("bat");
		xList.add("cat");
		xList.add("dog");
		Iterator<String> iterator = xList.iterator();
		System.out.println(xList);
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
		
		System.out.println(xList);
	}

}
