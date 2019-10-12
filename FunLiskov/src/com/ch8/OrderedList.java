package com.ch8;

public class OrderedList {
	private boolean empty;
	private OrderedList left, right;
	private Comparable val;

	public OrderedList() {
		// TODO Auto-generated constructor stub
		this.empty = true;
	}

	public void addE1(Comparable e1) {
		if (e1 == null) {
			throw new NullPointerException("OrderedList.addE1");
		}
		if (empty) {
			this.left = new OrderedList();
			this.right = new OrderedList();
			this.empty = false;
			this.val = e1;
			return;
		}
		int n = e1.compareTo(this.val);
		if (n == 0) {
			throw new IllegalArgumentException("DuplicateException");
		}
		if (n < 0) {
			left.addE1(e1);
		} else {
			right.addE1(e1);
		}
	}

}
