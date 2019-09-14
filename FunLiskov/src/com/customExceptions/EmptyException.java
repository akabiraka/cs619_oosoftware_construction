package com.customExceptions;

/**
 * If anything is empty, EmptyException will be used.
 * 
 * @author akabir
 *
 */
public class EmptyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// constructors
	
	public EmptyException() {
		// TODO Auto-generated constructor stub
		super();
	}

	public EmptyException(String msg) {
		super(msg);
	}

	public EmptyException(Throwable throwable) {
		super(throwable);
	}
}
