package com.ch3;

import java.awt.Color;

public class ColorPoint extends Point {
	
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ColorPoint))
			return false;
		ColorPoint other = (ColorPoint) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof Point)) {
//			return false;
//		}
//		if (!(o instanceof ColorPoint)) {
//			return o.equals(this);
//		}
//		ColorPoint point = (ColorPoint) o;
//		return super.equals(point) && point.color == this.color;
//
//	}
	
	
}
