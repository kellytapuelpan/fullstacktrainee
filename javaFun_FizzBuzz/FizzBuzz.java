import java.util.*;
public class FizzBuzz {
    public String fizzBuzz(int number) {
    	Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa un n\u00famero");
		number = reader.nextInt();

		String response = "";

		if (number % 3 == 0 && number % 5 == 0) {
			response = "FizzBuzz";
		} else if (number % 3 == 0) {
			response = "Fizz";
		} else if (number % 5 == 0) {
			response = "Buzz";
		} else {
			response = "El n\u00famero " + number + " no es divisible ni por 3 ni por 5";
		}

		return response;
    }
}