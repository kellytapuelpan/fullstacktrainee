package com.codingdojo.objectsmasterfirst;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human human) {
		human.health -= this.strength;
	}
}