package com.bilgeadam.boost.maraton.exception;

public class StudentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 436246583976848290L;
	
	public StudentException() throws StudentException{
		System.err.println("Only student can be created by this method.");
	}
}
