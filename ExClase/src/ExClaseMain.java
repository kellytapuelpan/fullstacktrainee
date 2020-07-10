public class ExClaseMain {
	public static void main(String[] args) {
		ExClase basics = new ExClase();
		
		//1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
		basics.Arithmetics();
		
		//2) Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
		basics.CompareTo();
		
		//3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
		basics.MyName();
		
		//4) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
		System.out.println(basics.IsPairNumber(2));
		
		//5) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
		basics.getNumbers();
		
		//6) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
		basics.Weekend();
		
		//7) ¨Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio.
		basics.getRandom();
	}
}