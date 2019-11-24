package com.ch6;

public enum Operation {

//	version 1
//	PLUS, MINUS, TIMES, DIVIDE, XXX;
//
//	public double apply(double x, double y) {
//		switch (this) {
//		case PLUS:
//			return x + y;
//		case MINUS:
//			return x - y;
//		case TIMES:
//			return x * y;
//		case DIVIDE:
//			return x / y;
//		default:
//			throw new AssertionError("unknown op: " + this);
//		}
//	}

//	version 2
//	PLUS {
//		@Override
//		public double apply(double x, double y) {
//			return x + y;
//		}
//	},
//	MINUS {
//		@Override
//		public double apply(double x, double y) {
//			return x - y;
//		}
//	},
//	TIMES {
//		@Override
//		public double apply(double x, double y) {
//			return x * y;
//		}
//	},
//	DIVIDE {
//		@Override
//		public double apply(double x, double y) {
//			return x / y;
//		}
//	},
//	XXX {
//		@Override
//		public double apply(double x, double y) {
//			return 0;
//		}
//	};
//
//	public abstract double apply(double x, double y);
	
//	version 3
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	},
	XXX("XXX") {
		@Override
		public double apply(double x, double y) {
			return 0;
		}
	};
	
	private final String symbol;
	
	private Operation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
	public abstract double apply(double x, double y);
}
