package nineA;

import java.awt.Color;

public class ColorPoint2ndAttempt extends Point{
	private Color color;
	public ColorPoint2ndAttempt(int x, int y, Color color) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.color = color;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		
		if (!(o instanceof ColorPoint2ndAttempt)) {
			return o.equals(this);
		}
		
		ColorPoint2ndAttempt cp = (ColorPoint2ndAttempt) o;
		return super.equals(o) && cp.color == this.color;
	}
}
