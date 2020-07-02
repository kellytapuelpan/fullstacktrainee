import java.util.*;
public class PythagoreanTest {
    public static void main(String[] args) {
    	int legA = 0;
    	int legB = 0;
    	double legC = 0;
    	
        Pythagorean p = new Pythagorean();

        double getHypo = p.calculateHypotenuse(legA,legB);
        System.out.println("El valor de la Hipotenusa es " + getHypo);
    }
}