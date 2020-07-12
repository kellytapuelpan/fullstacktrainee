package project;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Project {
	private String name;
	private String description;
	
	@Override
	public String toString() {
	   return name + " / " + description;
	}
	
    private double initialCost;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public double getInitialCost() {
    	return initialCost;
    }
    
    public void setInitialCost(double initialCost) {
    	this.initialCost = initialCost;
    }
    
    public Project() {
    	
    }
    
    public Project(String name) {
    	this.name = name;
    }
    
    public Project(String name, String description) { 
    	this.name = name;
    	this.description = description;
    }
    
    public String elevatorPitch(){
        return String.format(Locale.ROOT, "%s (%f): %s", this.name, this.initialCost, this.description);
    }
}