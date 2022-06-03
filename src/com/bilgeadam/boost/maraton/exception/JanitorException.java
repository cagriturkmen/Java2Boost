package com.bilgeadam.boost.maraton.exception;

public class JanitorException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 436246583976848290L;
	
	public JanitorException() throws JanitorException{
		System.err.println("Only student can be created by this method.");
	}
}
