package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon {
	int myPokemons;
	
	public void listPokemon() {
		myPokemons = Pokemon.counter;
	}
}