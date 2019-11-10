package com.packagevisible.only;

public class SubClassA {
	private int y;
	private final ClassB b;
	public SubClassA(int y) {
		b = new ClassB(y*y);
		this.y = y;
	}

	@Override
	public String toString() {
		String string = b.toString();
		return "X: " + string + ", Y: " + String.valueOf(this.y);
	}
	
	private static class ClassB{
		private int x;
		ClassB(int x) {
			this.x = x;
		}
		
		@Override
		public String toString() {
			return String.valueOf(this.x);
		}
	}
}
