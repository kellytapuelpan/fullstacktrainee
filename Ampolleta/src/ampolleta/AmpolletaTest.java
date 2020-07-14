package ampolleta;
import java.util.*;

public class AmpolletaTest {
	public static void main (String[] args) {
		boolean myBoolean = true;
	    Ampolleta myLightbulb = new Ampolleta();
	    
	    while (myBoolean){
	        Scanner input = new Scanner(System.in);
	        System.out.println("Choose an option from the menu: \n 1. Turn it on \n 2. Turn it off \n 3. Lightbulb state \n 4. Change power \n 5. Get power \n 6. Change color \n 7. Get color \n 8. Charge \n 9. Exit");
	        String userChoice = input.nextLine();
	        int choice = Integer.parseInt(userChoice);
	        
	        switch(choice) {
	        	case 1:
	        		System.out.println("Option selected: 1");
	                System.out.println(myLightbulb.getHours());

	                if(myLightbulb.getHours() >= 1.0){
	                  Scanner setHours = new Scanner(System.in);
	                  System.out.println("Hours of use: ");
	                  String hoursChoice = setHours.nextLine();
	                  float hours = Float.parseFloat(hoursChoice) * -1.0f ;
	                  myLightbulb.reload(hours);
	                  if(myLightbulb.getState() == true) {
		        			System.out.println("The lightbulb it's already on");
		        		} else {
		        			myLightbulb.prender();
		        		}
	                } else {
	                    System.out.println("There's not enought hours left!!, you must charge it up first");
	                }

	                break;
	        	case 2:
	        		System.out.println("Option selected: 2");
	        		if(myLightbulb.getState() == false) {
	        			System.out.println("The lightbulb it's already off");
	        		} else {
	        			myLightbulb.apagar();
	        		}
	                break;
	        	case 3:
	        		System.out.println("Option selected: 3");
	        		System.out.println(myLightbulb.getState());
	                break;
	        	case 4:
	        		System.out.println("Option selected: 4");
	                Scanner setPower = new Scanner(System.in);
	                System.out.println("Set lightbulb power in vatios: ");
	                String powerChoice = setPower.nextLine();
	                int power = Integer.parseInt(powerChoice);
	                myLightbulb.setPotencia(power);
	                break;
	        	case 5:
	        		System.out.println("Option selected: 5");
	        		System.out.println(myLightbulb.getPotencia());
	        		break;
	        	case 6:
	        		System.out.println("Option selected: 6");
	        		Scanner setColor = new Scanner(System.in);
	                System.out.println("Which it's my lightbulb color?: ");
	                String colorChoice = setColor.nextLine();
	                myLightbulb.setColor(colorChoice);
	                break;
	        	case 7:
	        		System.out.println("Option selected: 7");
	        		System.out.println("My lightbulb have a beatiful" + myLightbulb.getColor() + " color");
	        		break;
	        	case 8:
	        		System.out.println("Option selected: 8");
	        		Scanner charge = new Scanner(System.in);
	                System.out.println("How many hours: ");
	                String hoursChoice = charge.nextLine();
	                float hours = Float.parseFloat(hoursChoice);
	                myLightbulb.reload(hours);
	        		break;
	        	case 9:
	        		System.out.println("Option selected: 9");
	        		System.out.println("Goodbye :)");
	                myBoolean = false;
	        		break;
	        }
	    }
	}
}