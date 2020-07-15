package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type){
        return new Pokemon(name, health, type);
    }
	
	public String pokemonInfo(Pokemon pokemon) {
		return String.format("Name: %s, health: %s, type: %s", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
	}
}
