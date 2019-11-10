package com.packagevisible.only;


class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public MyPoint getPoint() {
		return (new MyPoint()).getMyPoint();
	}
	
	private class MyPoint {
		private int m;
		private int n;
		public MyPoint() {
			this.m = x;
			this.n = y;
		}
		
		public MyPoint getMyPoint() {
			return this;
		}
	}
}
