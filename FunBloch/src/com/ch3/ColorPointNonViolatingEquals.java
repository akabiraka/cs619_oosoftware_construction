package com.ch3;

import java.awt.Color;
import java.util.concurrent.atomic.AtomicInteger;

public class ColorPointNonViolatingEquals {
	private final Point point;
	private final Color color;
	private final AtomicInteger counter = new AtomicInteger();

	public ColorPointNonViolatingEquals(int x, int y, Color color) {
		// TODO Auto-generated constructor stub
		this.point = new Point(x, y);
		this.color = color;
		counter.incrementAndGet();
	}
	
	public Point asPoint() {
		// I am exposing my rep-inv
//		return point;
		// without exposing rep-inv
		return new Point(point.getx(), point.gety());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ColorPointNonViolatingEquals))
			return false;
		ColorPointNonViolatingEquals other = (ColorPointNonViolatingEquals) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof ColorPointNonViolatingEquals)) {
//			return false;
//		}
//		ColorPointNonViolatingEquals cp = (ColorPointNonViolatingEquals) o;
//		return cp.point.equals(this.point) && cp.color.equals(this.color);
//	}
	
	
}
