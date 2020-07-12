package com.codingdojo.zookeeperlast;

public class Bat extends Mammal {
	public void fly() {
		System.out.println("ffffffuiiiiiiiiiii");
		this.setEnergy(getEnergy() - 50);
	}
	
	public void eatHumans() {
		System.out.println("Well, it doesn't matter");
		this.setEnergy(getEnergy() + 25);
	}
	
	public void attackTown() {
		System.out.println("grgrgrgrggrjgjhghrgrrg");
		this.setEnergy(getEnergy() - 100);
	}
}