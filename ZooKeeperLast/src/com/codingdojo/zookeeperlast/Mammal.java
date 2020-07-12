package com.codingdojo.zookeeperlast;

public class Mammal {
	private int newenergy = 300;
	
	public int getEnergy() {
		return this.newenergy;
	}
	
	public void setEnergy(int energy) {
		this.newenergy = energy;
	}
	
	public int displayEnergy() {
		System.out.println(newenergy);
        return this.newenergy;
	}
}