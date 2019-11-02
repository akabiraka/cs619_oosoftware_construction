package com.ch3;

import java.util.Set;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	private static final Set<Point> unitCircle = Set.of(new Point(1, 0), new Point(-1, 0), new Point(0, 1));
	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) {
			return false;
		}
		Point point = (Point) o;
		return point.x == this.x && point.y == this.y;
	}

}
