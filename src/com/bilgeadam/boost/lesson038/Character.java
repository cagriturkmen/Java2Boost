package com.bilgeadam.boost.lesson038;


public abstract class Character {
	
	    protected int hp;
	    protected int attack;
	    protected Integer position;

	    public Character(int position) {
	        this.position = position;
	    }
	    

	    public Character() {

	    }


		public int getHp() {
	        return hp;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    public int getPosition() {
	        return position;
	    }


	    public void setHp(int hp) {
	        this.hp = hp;
	    }
	    

	    public void setAttack(int attack) {
			this.attack = attack;
		}

		@Override
	    public String toString() {
	        return
	                "hp=" + hp +
	                ", attack=" + attack +
	                ", position=" + position +
	                '}';
	    }

	    
	    
}
