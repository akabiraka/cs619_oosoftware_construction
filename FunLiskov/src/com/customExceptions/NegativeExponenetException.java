package com.customExceptions;

public class NegativeExponenetException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeExponenetException() {
		// TODO Auto-generated constructor stub
		super();
	}

	public NegativeExponenetException(String msg) {
		super(msg);
	}

	public NegativeExponenetException(Throwable throwable) {
		super(throwable);
	}
}
