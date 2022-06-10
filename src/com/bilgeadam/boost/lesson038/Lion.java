package com.bilgeadam.boost.lesson038;

public class Lion extends Enemy {

	public Lion(int position) {
		super(position);
		this.hp=100;
		this.attack=15;	
		}

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Lion summonEnemy(int position) {
		return new Lion(position);		
	}
	
	@Override
	public String toString() {
		return "Lion at position=" + position ;
	}

}
