public class EjerciciosBasicosTest {
	public static void main(String[] args) {
		EjerciciosBasicos getvalues = new EjerciciosBasicos();
		
		//Imprimir n�meros entre 1 y el 255
		int num = 1;
		getvalues.getNumbers(num);
		
		//Imprimir los impares entre 1 y el 255
		int impar = 1;
		getvalues.getImpares(impar);
		
		//Sumar e imprimir n�meros entre 0 y 255
		int numero = 0;
		int suma = 0;
		getvalues.plusAndPrint(numero, suma);
		
		//Recorrer un arreglo e imprimir cada elemento
		getvalues.getArray();
		
		//Recorrer un arreglo e imprimir cada elemento
		getvalues.getScannerArray();
		
		//Encontrar el valor m�ximo en un arreglo
		getvalues.getMaxValue();
		
		//Encontrar el valor m�ximo en un arreglo entregado por teclado
		getvalues.getMaxValueScreen();
		
		//Obtener el promedio
		getvalues.getAverage();
		
		//Obtener el promedio de un arreglo obtenido por teclado
		getvalues.getAverageScreen();
		
		//Arreglo con n�meros impares
		getvalues.getImparesArray();
		
		//Mayor que Y
		getvalues.mayorY();
		
		//Mayor que Y por teclado
		getvalues.mayorYScreen();
		
		//Valores al cuadrado
		getvalues.squareVal();
		
		//Eliminar N�meros negativos
		getvalues.ReplaceNeg();
		
		//M�nimo, M�ximo y Promedio
		getvalues.getMinMaxAvg();
		
		//Cambiando los Valores del Arreglo
		getvalues.changeVal();
	}
}