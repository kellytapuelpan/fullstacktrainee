package com.codingdojo.objectsmasterlast;
import java.util.*;

public class Samurai extends Human {
	public String name = "Honourable Samurai";
	
    private int counter = 0;

    public Samurai(){
        this.setHealth(200);
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        this.counter += 1;
        this.setHealth(this.getHealth() / 2);
    }

    public void meditate(){
        this.setHealth(this.getHealth() + this.getHealth()/2);
    }

    public int howMany(){
        return this.counter;
    }
}
