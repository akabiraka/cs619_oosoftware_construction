package com.ch5.classPractices;

import java.util.ArrayList;
import java.util.List;

// this was mutable, I make this immutable
public class Queue<E> {

	private List<E> elements;
	private int size;

	public Queue() {
		this.elements = new ArrayList<E>();
		this.size = 0;
	}
	
	private Queue(List<E> list) {
		this.elements = new ArrayList<E>(list);
		this.size = this.elements.size();
	}
	
//	public void enQueue(E e) {
//		elements.add(e);
//		size++;
//	}
	
	public Queue<E> enQueue(E e) {
		List<E> copyList = new ArrayList<E>(this.elements);
		copyList.add(e);
		return new Queue<E>(copyList);
	}
//	public E deQueue() {
//		if (size == 0)
//			throw new IllegalStateException("Queue.deQueue");
//		E result = elements.get(0);
//		elements.remove(0);
//		size--;
//		return result;
//	}
	
	public Queue<E> deQueue() {
		if (this.size == 0) {
			throw new IllegalStateException("Queue.deQueue");
		}
		List<E> copyList = new ArrayList<E>(this.elements);
		copyList.remove(0);
		return new Queue<E>(copyList);
	}
	
	public E getHead() {
		if (this.size == 0) {
			throw new IllegalStateException("Queue.getHead");
		}
		return this.elements.get(0);
	}

	public boolean isEmpty() {
		return size == 0;
	}
}