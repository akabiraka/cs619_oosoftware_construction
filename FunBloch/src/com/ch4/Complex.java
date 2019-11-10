package com.ch4;

public class Complex {
	private final double re;
	private final double im;

	private Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public static Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}

	public double realPart() {
		return this.re;
	}

	public double imaginaryPart() {
		return this.im;
	}

	public Complex plus(Complex c) {
		return new Complex(this.re + c.re, this.im + c.im);
	}

	public Complex minus(Complex c) {
		return new Complex(this.re - c.re, this.im - c.im);
	}

	public Complex times(Complex c) {
		double reTemp = this.re * c.re - this.im * c.im;
		double imTemp = this.re * c.im + this.im * c.re;
		return new Complex(reTemp, imTemp);
	}

	public Complex dividyBy(Complex c) {
		double temp = c.re * c.re + c.im * c.im;
		double reTemp = (this.re * c.re + this.im * c.im) / temp;
		double imTemp = (this.im * c.re - this.re * c.im) / temp;
		return new Complex(reTemp, imTemp);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Complex)) {
			return false;
		}
		Complex other = (Complex) o;
		return Double.compare(this.re, other.re) == 0 && Double.compare(this.im, other.im) == 0;
	}
	
	@Override
	public int hashCode() {
		return Double.hashCode(this.re) + Double.hashCode(this.im);
	}
	
	@Override
	public String toString() {
		return "(" + this.re + " + " + this.im + "i)";
	}
	
	public static final Complex ZERO = new Complex(0, 0);
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex I = new Complex(0, 1);
}
