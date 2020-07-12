package com.codingdojo.zookeeper01;

public class Gorilla extends Mammal {
	public void throwSomething() {
		this.setEnergy(getEnergy() - 5);
	}
	
	public void eatBananas() {
		this.setEnergy(getEnergy() + 10);
	}
	
	public void climb() {
		this.setEnergy(getEnergy() - 10);
	}
}