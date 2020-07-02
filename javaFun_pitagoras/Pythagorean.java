import java.util.*;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
    	Scanner cat1 = new Scanner(System.in);
        System.out.println("Ingresa el valor del primer cateto");
		legA = cat1.nextInt();

		Scanner cat2 = new Scanner(System.in);
        System.out.println("Ingresa el valor del segundo cateto");
		legB = cat2.nextInt();
		
    	double legC = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
		return legC;
    }
}