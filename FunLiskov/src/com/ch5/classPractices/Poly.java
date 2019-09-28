package com.ch5.classPractices;

/*
 * Liskov's Poly class, as typed in out of her text
 * This was basically immutable, I have made this mutable. 4 mutator functions need to be changed namely sub, minus, add and mul.
 */
public class Poly {

	private int[] trms;
	private int deg;

	// Effects: Initializes this to be the zero polynomial
	public Poly() {
		trms = new int[1];
		trms[0] = 0;
		deg = 0;
	}

	// Effects: If n < 0 throws IllegalArgumentException
	// else initializes this to be the polynomial c*x^n
	public Poly(int c, int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException("Poly(int, int) constructor");
		}
		if (c == 0) {
			trms = new int[1];
			trms[0] = 0;
			deg = 0;
			return;
		}
		trms = new int[n + 1];
		for (int i = 0; i < n; i++) {
			trms[i] = 0;
		}
		trms[n] = c;
		deg = n;
	}

	private Poly(int n) {
		trms = new int[n + 1];
		deg = n;
	}

	// Effects: returns the degree of this
	public int degree() {
		return deg;
	}

	// Effects: returns the coefficent of the term of this whose exponent is d
	public int coeff(int d) {
		return (d < 0 || d > deg) ? 0 : trms[d];
	}

	// Effects: If q is null throw NullPointerException
	// else return the Poly this - q
//	public Poly sub(Poly q) throws NullPointerException {
//		return add(q.minus());
//	}
	
	public void sub(Poly q) throws NullPointerException {
		this.minus();
		this.add(q);
	}
	
	// Effects: return the Poly -this
//    public Poly minus() {
//       Poly r = new Poly(deg);
//       for (int i=0; i <= deg; i++) {
//          r.trms[i] = -trms[i];
//       }
//       return r;
//    }

	public void minus() {
		for (int i = 0; i <= this.deg; i++) {
			this.trms[i] = -this.trms[i];
		}
	}

	// Effects: If q is null throw NullPointerException
	// else return the Poly this + q
//	public Poly add(Poly q) throws NullPointerException {
//		Poly la, sm;
//		if (deg > q.deg) {
//			la = this;
//			sm = q;
//		} else {
//			la = q;
//			sm = this;
//		}
//		int newdeg = la.deg;
//		if (deg == q.deg) {
//			for (int k = deg; k > 0; k--) {
//				if (trms[k] + q.trms[k] != 0) {
//					break;
//				} else {
//					newdeg--;
//				}
//			}
//		}
//		Poly r = new Poly(newdeg);
//		int i;
//		for (i = 0; i <= sm.deg && i <= newdeg; i++) {
//			r.trms[i] = sm.trms[i] + la.trms[i];
//		}
//		for (int j = i; j <= newdeg; j++) {
//			r.trms[j] = la.trms[j];
//		}
//		return r;
//	}
	
	public void add(Poly q) throws NullPointerException {
		Poly la, sm;
		if (this.deg > q.deg) {
			la = this;
			sm = q;
		} else {
			la = q;
			sm = this;
		}
		int newdeg = la.deg;
		if (this.deg == q.deg) {
			for (int k = this.deg; k > 0; k--) {
				if (this.trms[k] + q.trms[k] != 0) {
					break;
				} else {
					newdeg--;
				}
			}
		}
		Poly r = new Poly(newdeg);
		int i;
		for (i = 0; i <= sm.deg && i <= newdeg; i++) {
			r.trms[i] = sm.trms[i] + la.trms[i];
		}
		for (int j = i; j <= newdeg; j++) {
			r.trms[j] = la.trms[j];
		}
	}
	// Effects: If q is null throw NullPointerException
	// else return the Poly this * q
	public Poly mul(Poly q) throws NullPointerException {

		if ((q.deg == 0 && q.trms[0] == 0) || (deg == 0 && trms[0] == 0)) {
			return new Poly();
		}

		Poly r = new Poly(deg + q.deg);
		r.trms[deg + q.deg] = 0;
		for (int i = 0; i <= deg; i++) {
			for (int j = 0; j <= q.deg; j++) {
				r.trms[i + j] += trms[i] * q.trms[j];
			}
		}
		return r;
	}

	public String toString() {
		String r = "Poly:";

		if (deg == 0 || trms[0] != 0) {
			r += " " + trms[0];
		}

		for (int i = 1; i <= deg; i++) {
			if (trms[i] < 0) {
				r += " - " + -trms[i] + "x^" + i;
			} else if (trms[i] > 0) {
				r += " + " + trms[i] + "x^" + i;
			}
		}
		return r;
	}
}