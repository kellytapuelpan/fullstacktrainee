package com.codingdojo.pets.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		if (this.getWeight() < 20) {
			return String.format("Just hug it and put %s in your lap!!", this.getName());
		} else {
			return String.format("%s it's too big!!, it will throw you to the ground when cuddle you.", this.getName());
		}
	}

}