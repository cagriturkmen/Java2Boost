package com.bilgeadam.boost.maraton.exception;

public class TeacherException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 436246583976848290L;
	
	public TeacherException() throws TeacherException{
		System.err.println("Only teacher can be created by this method.");
	}
}
