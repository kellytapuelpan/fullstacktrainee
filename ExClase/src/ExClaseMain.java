public class ExClaseMain {
	public static void main(String[] args) {
		ExClase basics = new ExClase();
		
		//1) Declara dos variables num�ricas (con el valor que desees), muestra por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).
		basics.Arithmetics();
		
		//2) Declara 2 variables num�ricas (con el valor que desees), e indica cual es mayor de los dos. Si son iguales indicarlo tambi�n. Ves cambiando los valores para comprobar que funciona.
		basics.CompareTo();
		
		//3) Declara un String que contenga tu nombre, despu�s muestra un mensaje de bienvenida por consola.
		basics.MyName();
		
		//4) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambi�n debemos indicarlo.
		System.out.println(basics.IsPairNumber(2));
		
		//5) Muestra los n�meros del 1 al 100 (ambos incluidos). Usa un bucle while.
		basics.getNumbers();
		
		//6) Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
		basics.Weekend();
		
		//7) �Pide por teclado dos n�meros y genera 10 n�meros aleatorios entre esos n�meros. Usa el m�todo Math.random para generar un n�mero entero aleatorio.
		basics.getRandom();
	}
}