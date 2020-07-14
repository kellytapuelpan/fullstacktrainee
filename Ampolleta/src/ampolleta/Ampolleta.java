package ampolleta;
import java.util.*;

public class Ampolleta {
	private boolean state = false;
	private int power = 150;
	private String color = "purple";
	private float hours = 10.0f;
	
	public void prender(){
		this.state = true;
		System.out.println("Turning it on");
	}
	  
	public void apagar(){
		this.state = false;
		System.out.println("Turning it off");
	}

	public boolean getState(){
	    return this.state;
	}

	public void setState(boolean state){
	    this.state = state;
	}

	public void setPotencia(int power){
	    this.power = power;
	}

	public int getPotencia(){
	    return this.power;
	}

	public void setColor(String color){
	    this.color = color;
	}

	public String getColor(){
	    return this.color;
	}
	
	public void setHours(float hours){
	    this.hours = hours;
	}

	public float getHours(){
	    return this.hours;
	}

	public void reload(float hours){
	      
	    this.hours += hours;
	      
	    if (this.hours < 0.0f){
	    	this.hours = 0.0f;
	    }
	}
}