package com.codingdojo.zookeeperlast;

public class BatTest {
	public static void main(String[] args) {
		Bat uglybat = new Bat();
		
		uglybat.attackTown();
		uglybat.fly();
		uglybat.attackTown();
		uglybat.attackTown();
		uglybat.eatHumans();
		uglybat.fly();
		uglybat.eatHumans();
		
		System.out.println(uglybat.getEnergy());
	}
}