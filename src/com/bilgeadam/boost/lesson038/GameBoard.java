package com.bilgeadam.boost.lesson038;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameBoard {
		
	private  Hero hero;
	private  Bug bug;
	private Lion lion;
	private Zombie zombie;
	private List<Character> characters ;
	private int resourceDistance;

	
	public GameBoard(int resourceDistance) {
		this.hero = Hero.getINSTANCE();
		this.bug = new Bug();
		this.lion = new Lion();
		this.zombie = new Zombie();
		this.characters = new ArrayList<>();
		this.resourceDistance = resourceDistance;
	}

	public List<Character> summonCharactersToGameBoard() {
		characters.add(bug.summonEnemy(600));
		characters.add(hero.summonHero());
		characters.add(bug.summonEnemy(100));
		characters.add(bug.summonEnemy(1300));
		characters.add(lion.summonEnemy(2000));
		characters.add(zombie.summonEnemy(3000));
		characters.add(zombie.summonEnemy(3010));
		characters.add(zombie.summonEnemy(3100));
		characters.add(zombie.summonEnemy(3001));
		characters.add(zombie.summonEnemy(4000));
		
		List<Character> sortedList = characters.stream()
				.sorted((p1,p2)-> p1.position.compareTo(p2.position))
				.collect(Collectors.toList());
		return sortedList;
	}
	
	void startJourney(List<Character> characters) {
		
		Hero hero = (Hero) characters.get(0);
		System.out.println(hero.getHp());
		
		for (int i=1; i< characters.size() ; i++) {
						
			do{
				hero.position++;
				
			} while(!(hero.getPosition() == characters.get(i).getPosition() || hero.getPosition() == resourceDistance));
			attack(hero, (Enemy) characters.get(i));
    }if(hero.getHp()>0) {
    	System.out.println("Resources are captured by your magnificent hero.");
    	
    }
		
	}
    
    void attack(Hero hero, Enemy enemy) {
        do{
            hero.hp = hero.hp-enemy.attack;
            enemy.hp = enemy.hp-hero.attack;
        } while(enemy.hp>0 && hero.hp> 0);
        
        if(hero.hp>0) {
            System.out.println("Enemy defeated!");
            System.out.println("Health remaining :" +hero.hp);
        } else {
            System.out.println("Your hero is dead :P " +hero.hp);
        }
    }
	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
	
	
	
}
