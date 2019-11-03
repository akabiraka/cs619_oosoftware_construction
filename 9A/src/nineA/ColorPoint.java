package nineA;

import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
//		if (o == this) {
//			return true;
//		}
//		if (o.getClass() != this.getClass()) {
//			return false;
//		}
		
		if (!(o instanceof ColorPoint)) {
			return false;
		}

		ColorPoint cp = (ColorPoint) o;
		return super.equals(o) && cp.color == this.color;
	}

}
