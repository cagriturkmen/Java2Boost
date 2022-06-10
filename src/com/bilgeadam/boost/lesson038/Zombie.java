package com.bilgeadam.boost.lesson038;

public class Zombie extends Enemy {

	public Zombie(int position) {
		super(position);
		this.hp=300;
		this.attack=7;
		}
	

	public Zombie() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public Zombie summonEnemy(int position) {
		
		return new Zombie(position);
		
	}

	@Override
	public String toString() {
		return "Zombie at position=" + position ;
	}
}
