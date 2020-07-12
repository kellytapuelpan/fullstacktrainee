package com.codingdojo.zookeeper01;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla pablo = new Gorilla();
        pablo.throwSomething();
        pablo.throwSomething();
        pablo.eatBananas();
        pablo.climb();
        pablo.throwSomething();
        pablo.eatBananas();
        pablo.eatBananas();
        pablo.eatBananas();
        pablo.eatBananas();
        pablo.climb();

        System.out.println(pablo.getEnergy());
	}
}