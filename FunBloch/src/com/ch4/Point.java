package com.ch4;

class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.valueOf(x) + ", " + String.valueOf(y);
	}
}
