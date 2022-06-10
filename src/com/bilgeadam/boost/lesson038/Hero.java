package com.bilgeadam.boost.lesson038;

public class Hero extends Character implements SummonHero{
	private static  Hero INSTANCE;    
	
    
    public Hero() {
		super();
		this.attack=10;
		this.hp=1000;
		this.position=0;
		}


    public static Hero getINSTANCE()
    {
        if(INSTANCE==null)
        {
            INSTANCE=new Hero();
        }
        return INSTANCE;
    }


	@Override
	public String toString() {
		return "Hero [ "+" hp=" + hp + ", attack=" + attack + ", position="
				+ position + "]";
	}


	@Override
	public Character summonHero() {
	return	getINSTANCE();
		
	}







	
}
