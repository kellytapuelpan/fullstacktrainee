package com.codingdojo.zookeeper01;

public class Mammal {
	private int energylevel = 100;

    public int getEnergy() {
        return this.energylevel;
    }

    public void setEnergy(int energy) {
        this.energylevel = energy;
    }

    public int displayEnergy(){
        System.out.println(energylevel);
        return this.energylevel;
    }
}