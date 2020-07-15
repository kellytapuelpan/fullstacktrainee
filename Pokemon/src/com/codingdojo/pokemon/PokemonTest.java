package com.codingdojo.pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 200, "Electric");
		Pokemon snorlax = pokedex.createPokemon("Snorlax", 150, "Normal");
		Pokemon jiglypuff = pokedex.createPokemon("Jiglypuff", 120, "Fairy");
		Pokemon charmander = pokedex.createPokemon("Charmander", 200, "Fire");
		
		System.out.println(pikachu.getName());
		System.out.println("Type: " + pikachu.getType());
		pikachu.attackPokemon(charmander);
		System.out.println(pikachu.getHealth());
		
		System.out.println(snorlax.getName());
		System.out.println("Type: " + snorlax.getType());
		snorlax.attackPokemon(jiglypuff);
		System.out.println(snorlax.getHealth());
		
		System.out.println(jiglypuff.getName());
		System.out.println("Type: " + jiglypuff.getType());
		jiglypuff.attackPokemon(pikachu);
		System.out.println(jiglypuff.getHealth());
		
		System.out.println(charmander.getName());
		System.out.println("Type: " + charmander.getType());
		charmander.attackPokemon(pikachu);
		System.out.println(charmander.getHealth());
		
		pokedex.listPokemon();
		System.out.println("Pokemons in my Pokedex: " + pokedex.myPokemons);
	}
}