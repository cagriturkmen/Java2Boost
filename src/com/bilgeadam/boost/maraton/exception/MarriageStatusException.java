package com.bilgeadam.boost.maraton.exception;

import com.bilgeadam.boost.maraton.entity.Occupation;
import com.bilgeadam.boost.maraton.entity.Person;

public class MarriageStatusException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1059721131593058258L;

	public  MarriageStatusException(Person person) throws MarriageStatusException {
		
		if(person.getOccupation().equals(Occupation.STUDENT)){
			throw new MarriageStatusException(person);
		}
	
	}
	
	

}
