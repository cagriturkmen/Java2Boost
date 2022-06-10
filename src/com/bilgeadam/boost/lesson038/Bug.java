package com.bilgeadam.boost.lesson038;

public class Bug extends Enemy {

	public Bug(int position) {
		super(position);
		this.hp=50;
		this.attack=2;
	    
   }
	public Bug() {}


	public Character summonEnemy(int position) {
		 Bug bug = new Bug(position);	
		 return bug;
	}
	@Override
	public String toString() {
		return "Bug at position=" + position ;
	}

	
	

}
