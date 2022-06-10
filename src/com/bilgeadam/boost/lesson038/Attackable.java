package com.bilgeadam.boost.lesson038;

import java.util.List;

public interface Attackable {
	
	public default void fight(Hero hero, List<Enemy> enemies) {
		
		
		boolean isHealthRemaining = true;
		
		
		for (Enemy enemy : enemies) {
			if(hero.position.equals(enemy.position)) {

			while(isHealthRemaining==true) {
			
				hero.setHp(hero.hp-enemy.attack);
				enemy.setHp(enemy.hp-hero.attack);
				hero.position++;
				
				if(hero.hp>0 || enemy.hp>0) {
					isHealthRemaining=true;
				}else {
					isHealthRemaining=false;
				}
			}
		  }else {
			  hero.position++;
		  }
		}
		
	};
		
}
