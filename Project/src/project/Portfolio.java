package project;
import java.util.*;

public class Portfolio {
	private ArrayList<Project> projects = new ArrayList<>();
	
	public void addProject(Project project){
		this.projects.add(project);
   	}
	
	public Object getAllProjects(){
		return this.projects;
	}
	
	public String getPortfolioCost(Portfolio portfolio){
        double sum = 0;

        for (Project project : projects) {
            sum += project.getInitialCost();
        }
        return "Total cost of the project's portfolio: " + sum;
    }

	public void showPortfolio(Portfolio portfolio){
		String totalCost = getPortfolioCost(portfolio);
		for (Project project: projects){
           System.out.println(project.elevatorPitch());
		}
		System.out.println(totalCost);
	}
}