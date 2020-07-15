package com.codingdojo.pokemon;
import java.util.*;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    public static int counter = 0;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getHealth() {
    	return health;
    }
    
    public void setHealth(int health) {
    	this.health = health;
    }
    
    public String getType() {
    	return type;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
    
    public Pokemon(String name, int health, String type) {
        setName(name);
        setHealth(health);
        setType(type);
        counter++;
    }
    
    public void attackPokemon(Pokemon pokemon) {
    	pokemon.setHealth(pokemon.getHealth() - 10);
    }
}