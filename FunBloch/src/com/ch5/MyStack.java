package com.ch5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyStack<E> {
	private List<E> stack;

	public MyStack() {
		stack = new ArrayList<E>();
	}

	public void push(E e) {
		if (e != null)
			stack.add(e);
	}

	public E pop() {
		E e = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return e;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void pushAll(Iterable<? extends E> es) {
		for(E e: es)
			push(e);
	}
	
	public void popAll(Collection<? super E> dst) {
		while(!isEmpty())
			dst.add(pop());
	}
}
