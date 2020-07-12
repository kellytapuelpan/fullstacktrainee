package project;

public class ProjectTest {
	public static void main (String[] args) {
		Project a = new Project("Name: A" , "Description of A");
		
		Project b = new Project();
        b.setName("Name: B");
        b.setDescription("Description of B");
        System.out.println(b.getName());
        System.out.println(b.getDescription());

        Project c = new Project("Name: C");
        c.setDescription("Description of C");
        c.setInitialCost(50.00);
        System.out.println(c.getInitialCost());
        
        Project d = new Project("Name: D");
        d.setDescription("Description of D");
        d.setInitialCost(28.00);
        System.out.println(d.getInitialCost());

        System.out.println(a.elevatorPitch());
        System.out.println(b.elevatorPitch());
        System.out.println(c.elevatorPitch());
        System.out.println(d.elevatorPitch());

        Portfolio x = new Portfolio();
        x.addProject(a);
        x.addProject(b);
        x.addProject(c);
        x.addProject(d);
        
        System.out.println(x.getAllProjects());
        
        System.out.println(x.getPortfolioCost(x));
        
        System.out.println("SHOWING THE DETAILS OF THE PORTFOLIO:");
        x.showPortfolio(x);
	}
}