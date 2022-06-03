package com.bilgeadam.boost.maraton.exception;

public class OfficerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 436246583976848290L;
	
	public OfficerException() throws OfficerException{
		System.err.println("Only student can be created by this method.");
	}
}
