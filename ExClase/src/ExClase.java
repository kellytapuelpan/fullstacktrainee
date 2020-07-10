import java.util.*;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class ExClase {
	//1)
	public void Arithmetics() {
		double b;
		double d;
		
		double suma;
		double resta;
		double multiplica;
		double divide;
		
		System.out.println("[OPERACIONES ARITMETICAS]");
		
		Scanner a = new Scanner(System.in);
        System.out.println("Ingresa primera variable");
		b = a.nextInt();
		
		Scanner c = new Scanner(System.in);
        System.out.println("Ingresa segunda variable");
		d = c.nextInt();
		
		suma = b + d;
		resta = b - d;
		multiplica = b * d;
		divide = b / d;
		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
				
		System.out.println("Suma: " + format.format(suma));
		System.out.println("Resta: " + format.format(resta));
		System.out.println("Multiplicaci\u00f3n: " + format.format(multiplica));
		System.out.println("Divisi\u00f3n: " + format.format(divide));
	}
	
	//2)
	public void CompareTo() {
		Number n1; 
		Number n2;
		
		System.out.println("[N\u00daMERO MAYOR]");
		
		Scanner x = new Scanner(System.in);
        System.out.println("Ingresa el primer n\u00famero");
		n1 = x.nextInt();
		
		Scanner y = new Scanner(System.in);
        System.out.println("Ingresa el segundo n\u00famero");
		n2 = y.nextInt();
		
	    BigDecimal b1 = new BigDecimal(n1.doubleValue());
	    BigDecimal b2 = new BigDecimal(n2.doubleValue());
	    
	    int compareValue = b1.compareTo(b2);
	    if (compareValue > 0) {
	        System.out.println(b1 + " es mayor que " + b2);
	    } else if (compareValue < 0) {
	        System.out.println(b2 + " es mayor que " + b1);
	    } else {
	        System.out.println(b1 + " es igual a " + b2);
	    }
	}
	
	//3)
	public void MyName() {
		System.out.println("[BIENVENIDA]");
		
		String name = "Kelly";
		System.out.println("Bienvenida " + name);
	}
	
	//4)
	public String IsPairNumber(int y) {
		
		System.out.println("[DETERMINAR SI ES N\u00daMERO PAR]");
		
		Scanner x = new Scanner(System.in);
        System.out.println("Ingresa el n\u00famero");
		y = x.nextInt();
		
		String response = "";
		
		if(y % 2 == 0) {
			response = "El número es divisible por 2";
		} else {
			response = "El número no es divisible por 2";
		}
		
		return response;
	}
	
	//5)
	public void getNumbers() {
		System.out.println("[OBTENER N\u00daMEROS ENTRE EL 1 y el 100]");
		
		int num = 1;
		while (num <= 100) {
			System.out.println(num);
			num++;
		}
	}
	
	//6)
	public void Weekend() {
		int y;
		
		System.out.println("[ES O NO DIA LABORAL?]");
		
		Scanner x = new Scanner(System.in);
        System.out.println("Consulta el d\u00eda");
		y = x.nextInt();
		
		int day = 5;
	    switch (day) {
	      case 1:
	        System.out.println("Es Lunes");
	        break;
	      case 2:
	        System.out.println("Es Martes");
	        break;
	      case 3:
	        System.out.println("Es Mi\u00e9rcoles");
	        break;
	      case 4:
	        System.out.println("Es Jueves");
	        break;
	      case 5:
	        System.out.println("Es Viernes");
	        break;
	      case 6:
	        System.out.println("Es Sábado");
	        break;
	      case 7:
	        System.out.println("Es Domingo");
	        break;
	    }
	    if (day <= 5) {
	        System.out.println("Lev\u00e1ntate!! Es día laboral :(");
	    } else {
	        System.out.println("No es día laboral, puedes seguir durmiendo :)");
	    }
	}
	
	//7)
	public void getRandom() {
		System.out.println("[OBTENER N\u00daMEROS RANDOM ENTRE 2 VARIABLES]");
		
		Scanner x = new Scanner(System.in);
        System.out.println("Ingresa el primer n\u00famero");
		int random1 = x.nextInt();
		
		Scanner y = new Scanner(System.in);
        System.out.println("Ingresa el segundo n\u00famero");
		int random2 = y.nextInt();
		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
		
		for(int i = 0; i<10; i++){
			double random = random1-((int)Math.round((Math.random())*(random1-random2)));
			System.out.println(format.format(random));
		}
	}
}