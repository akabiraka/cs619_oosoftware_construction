package com.ch5;

import com.customExceptions.NegativeExponenetException;

/**
 * Implements immutable basic operations like creation, add, sub, mul etc on
 * Polynomials e.g.: c_0x^0 + c_1x^1 + c_2x^2 + ... ... ...
 * 
 * @author akabir
 *
 */
public class Poly {
	// OVERVIEW: Polinomial implementation and basic operations on polynomials.
	private int[] trms; // coefficients of 0, 1, 2, 3 ... ... -th polynomials, increasing order.
	private int deg;

	// constructors

	/**
	 * Initializes this to be the zero polynomial.
	 */
	public Poly() {
		// EFFECTS: Initializes this to be the zero polynomial.
		trms = new int[1];
		deg = 0;
	}

	/**
	 * Initializes this to be a polynomial cx^n if n>=0, else throws
	 * NegativeExponenetException.
	 * 
	 * @param c The coefficient of the polynomial.
	 * @param n The degree of the polynomial.
	 * @throws NegativeExponenetException if n<0
	 */
	public Poly(int c, int n) throws NegativeExponenetException {
		// EFFECTS: If n<0, throws NegativeExponenetException; else initializes this to
		// be cx^n
		if (n < 0)
			throw new NegativeExponenetException();
		if (c == 0) {
			trms = new int[1];
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

	public Poly(int n) {
		trms = new int[n + 1];
		deg = n;
	}

	// methods

	/**
	 * Get the degree of this.
	 * 
	 * @return the degree of this, i.e. the largest exponent with non-zero
	 *         coefficient. Returns 0 for zero-poly
	 */
	public int degree() {
		// EFFECTS: Returns the degree of this, i.e. the largest exponent with non-zero
		// coefficient. Returns 0 for zero-poly.
		return deg;
	}

	/**
	 * Get the coefficient of the term of this whose exponent is d.
	 * 
	 * @param d An exponent value.
	 * @return the coefficient of the term of this whose exponent is d.
	 */
	public int coeff(int d) {
		// EFFECTS: Returns the coefficient of the term of this whose exponent is d.
		if (d < 0 || d > deg) {
			return 0;
		}
		return trms[d];
	}

	/**
	 * Subtract a Poly from this Poly.
	 * 
	 * @param q A Poly to be subtracted from this.
	 * @return the Poly this-q.
	 * @throws NullPointerException if q is null
	 */
	public Poly sub(Poly q) {
		// EFFECTS: If q is null, throws NullPointerException; else returns the Poly
		// this-q
		if (q == null) {
			throw new NullPointerException("Poly.sub");
		}
		return add(q.minusPoly());
	}

	/**
	 * -this
	 * 
	 * @return the negative of this.
	 */
	public Poly minusPoly() {
		// EFFECTS: Returns the Poly -this.
		Poly copyPoly = new Poly(deg);
		for (int i = 0; i < deg; i++) {
			copyPoly.trms[i] = -trms[i];
		}
		return copyPoly;
	}

	/**
	 * If q is null, throws NullPointerException; else add q to this.
	 * 
	 * @param q A Poly to be added with this.
	 * @return the Poly this+q.
	 * @throws NullPointerException if q is null.
	 */
	public Poly add(Poly q) {
		// EFFECTS: If q is null, throws NullPointerException; else retuns the Poly
		// this+q.
		if (q == null)
			throw new NullPointerException();
		Poly la, sm;
		if (deg > q.deg) {
			la = this;
			sm = q;
		} else {
			la = q;
			sm = this;
		}
		int newdeg = la.deg; // new degree is the larger degree
		if (deg == q.deg) {
			for (int k = deg; k > 0; k--) {
				if (trms[k] + q.trms[k] != 0) {
					break;
				}else {
					newdeg--;
				}
			}
		}
		
		Poly r = new Poly(newdeg);
		int i;
		for (i = 0; i <= sm.deg && i<=newdeg; i++) {
			r.trms[i] = sm.trms[i] + la.trms[i];
		}
		for (int j = i; j <= newdeg; j++) {
			r.trms[j] = la.trms[j];
		}
		return r;
	}

	/**
	 * If q is null, throws NullPointerException; else multiply q with this.
	 * @param q A Poly to be multiplied with this.
	 * @return a Poly this*q.
	 * @throws NullPointerException if q is null.
	 */
	public Poly mul(Poly q) {
		// EFFECTS: If q is null throws NullPointerException, else retuns the Poly
		// this*q
		if ((q.deg == 0 && q.trms[0]==0) || (deg==0 && trms[0]==0)) {
			return new Poly();
		}
		
		Poly r = new Poly(deg+q.deg);
		r.trms[deg+q.deg] = 0;
		for (int i = 0; i <= deg; i++) {
			for (int j = 0; j <= q.deg; j++) {
				r.trms[i+j] = r.trms[i+j] + trms[i]*q.trms[j];
			}
		}
		
		return r;
	}
}
