package nineA;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
//		if (o == this) {
//			return true;
//		}
//		if (o.getClass() != this.getClass()) {
//			return false;
//		}
		
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return p.x == this.x && p.y == this.y;
	}
}
