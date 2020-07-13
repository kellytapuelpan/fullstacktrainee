package com.codingdojo.objectsmasterlast;
import java.util.*;

public class HumanTest {
	public static void main(String[] args) {
		Ninja ninja = new Ninja();
        Wizard wizard = new Wizard();
        Samurai samurai = new Samurai();

        ninja.stealHealth(samurai);
        System.out.println(String.format("%s health: %s", samurai.name, samurai.getHealth()));
        ninja.runAway();
        System.out.println(String.format("%s health: %s", ninja.name, ninja.getHealth()));

        wizard.heal(samurai);
        System.out.println(String.format("%s health: %s", samurai.name, samurai.getHealth()));
        wizard.fireBall(ninja);
        System.out.println(String.format("%s health: %s", ninja.name, ninja.getHealth()));

        samurai.deathBlow(ninja);
        System.out.println(String.format("%s health: %s", ninja.name, ninja.getHealth()));
        samurai.meditate();
        System.out.println(String.format("%s health: %s", samurai.name, samurai.getHealth()));
        
        System.out.println("HOW MANY SAMURAIS ARE LEFT:");
        System.out.println("There's " + samurai.howMany() + " Samurai left");
	}
}