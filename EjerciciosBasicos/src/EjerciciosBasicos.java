import java.util.*;
public class EjerciciosBasicos {
	//Imprimir números entre 1 y el 255
	public void getNumbers(int num) {
		for (num=1; num<=255; num++){
			System.out.println(num);
		}
	}
	
	//Imprimir los impares entre 1 y el 255
	public void getImpares(int impar) {
		for(impar=1; impar<=255; impar++) {
			if (impar % 2 != 0){
				System.out.println(impar);
		    }
		}
	}
	
	//Sumar e imprimir números entre 0 y 255
	public void plusAndPrint(int numero, int suma) {
		for (numero=0; numero<=255; numero++){
			 suma = suma + numero;
			 System.out.println("Nuevo numero:" + numero + ", Suma:" + suma);
		}
	}
	
	//Recorrer un arreglo e imprimir cada elemento
	public void getArray() {
		int x = 0;
		int[] myArray = {1,3,5,7,9,13};
		
		for (x=0; x<myArray.length; x++) {
			  System.out.println(myArray[x]);
		}
	}
	
	//Recorrer un arreglo e imprimir cada elemento
	public void getScannerArray() {
		int yy = 1;
	    int zz = 0;
	    int vv = 0;
	    int ww = 0;
		
	    Scanner arr = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos para tu arreglo");
		zz = arr.nextInt();
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		while (yy <= zz) {
			Scanner arr2 = new Scanner(System.in);
	        System.out.println("Ingresa el nuevo elemento");
			ww = arr2.nextInt();
			list.add(ww);
			yy++;
		}
		
		System.out.println("El arreglo es " + list);
		
		for (vv=0; vv<list.size(); vv++) {
			System.out.println(list.get(vv));
		}
	}
	
	//Encontrar el valor máximo en un arreglo
	public void getMaxValue() {
		int[] chars = {-3,-5,-7};
		int max = chars[0];
	    for (int ktr = 0; ktr < chars.length; ktr++) {
	        if (chars[ktr] > max) {
	            max = chars[ktr];
	        }
	    }
	    System.out.println(max);
	}
	
	//Encontrar el valor máximo en un arreglo entregado por teclado
	public void getMaxValueScreen() {
		int a = 1;
	    int b = 0;
	    int c = 0;
	    int d = 0;
	    
	    Scanner vlmax = new Scanner(System.in);
	    System.out.println("Ingresa la cantidad de elementos para tu arreglo");
		b = vlmax.nextInt();
		
		ArrayList<Integer> listMax = new ArrayList<Integer>();
		
		while (a <= b) {
			Scanner vlmax2 = new Scanner(System.in);
	        System.out.println("Ingresa el nuevo elemento");
			d = vlmax2.nextInt();
			listMax.add(d);
			a++;
		}
		
		System.out.println("El arreglo es " + listMax);
		
		int maximo = listMax.get(0);
		
		for (c = 0; c < listMax.size(); c++) {
	        if (listMax.get(c) > maximo) {
	            maximo = listMax.get(c);
	        }
	    }
	    System.out.println(maximo);
	}
	
	//Obtener el promedio
	public void getAverage() {
	    int[] arreglo = {2,10,3};
        int total = 0;

        for(int i=0; i<arreglo.length; i++){
        	total = total + arreglo[i];
        }
        
        double average = total / arreglo.length;

        System.out.println("El promedio es: " + average);
	}
	
	//Obtener el promedio de un arreglo obtenido por teclado
	public void getAverageScreen() {
		int a = 1;
	    int b = 0;
	    int c = 0;
	    
	    Scanner vlavg = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos para tu arreglo");
		b = vlavg.nextInt();
		
		ArrayList<Integer> listAvg = new ArrayList<Integer>();
		
		while (a <= b) {
			Scanner vlavg2 = new Scanner(System.in);
	        System.out.println("Ingresa el nuevo elemento");
			c = vlavg2.nextInt();
			listAvg.add(c);
			a++;
		}
		
		System.out.println("El arreglo es " + listAvg);
		
		double sumatotal = 0;
		
		for(int f=0; f < listAvg.size(); f++){
        	sumatotal = sumatotal + listAvg.get(f);
        }
        
        double getaverage = sumatotal / listAvg.size();
        
        System.out.println("El promedio es: " + getaverage);
	}
	
	//Arreglo con números impares
    public void getImparesArray() {
    	ArrayList<Integer> listY = new ArrayList<Integer>();
	    
	    int impares = 1;
		for(impares=1; impares<=255; impares++) {
			if (impares % 2 != 0){
				listY.add(impares);
		    }
		}
		System.out.println(listY);
    }
    
    //Mayor que Y
    public void mayorY() {
    	int[] secArray = {1,3,5,7};
    	int Y = 4;
        int count = 0;
        
        for(int g=0; g < secArray.length; g++){
        	int N = secArray[g];
        	if(N > Y) {
        		count = count + 1;
        	}
        }
        
        System.out.println("Los valores mayores a Y son " + count);
    }
    
    //Encontrar la cantidad de elementos mayores que Y en arreglo por teclado
    public void mayorYScreen() {
    	int f = 1;
    	int g = 0;
    	int h = 0;
    	int m = 0;
	    
	    Scanner large = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos para tu arreglo");
		g = large.nextInt();
		
		ArrayList<Integer> largeList = new ArrayList<Integer>();
		
		while (f <= g) {
			Scanner large2 = new Scanner(System.in);
	        System.out.println("Ingresa el nuevo elemento");
			h = large2.nextInt();
			largeList.add(h);
			f++;
		}
		
		System.out.println("El arreglo es " + largeList);
		
		Scanner large3 = new Scanner(System.in);
        System.out.println("Ingresa el valor con el que se va a comparar");
		m = large3.nextInt();
		
        int counter = 0;
        
        for(int l=0; l < largeList.size(); l++){
        	int NN = largeList.get(l);
        	if(NN > m) {
        		counter = counter + 1;
        	}
        }
        
        System.out.println("Los valores mayores al valor entregado son " + counter);
    }
    
    //Valores al cuadrado
    public void squareVal() {
    	int[] sqArray = {1,5,10,-2};
    	int p = 0;
        
    	ArrayList<Integer> listP = new ArrayList<Integer>();
    	
        for(int o=0; o < sqArray.length; o++){
        	int q = sqArray[o];
        	p = q * q;
        	listP.add(p);
        }
        System.out.println(listP);
    }
    
    //Eliminar Números negativos
    public void ReplaceNeg() {
    	ArrayList<Integer> listNeg = new ArrayList<Integer>();
    	
    	listNeg.add(1);
    	listNeg.add(5);
    	listNeg.add(10);
    	listNeg.add(-2);
    	
    	for(int i=0; i <= listNeg.size() - 1; i++){
        	int newi = listNeg.get(i);
        	if(newi < 0) {
        		listNeg.set(i, 0);
        	}
        }
    	
    	System.out.println(Arrays.toString(listNeg.toArray()));
    }
    
    //Mínimo, Máximo y Promedio
    public void getMinMaxAvg() {
    	int[] chars = {1,5,10,-2};
		int max = chars[0];
		int min = chars[0];
		
		double totalcal = 0;
		
	    for (int i = 0; i < chars.length; i++) {
	        if (chars[i] > max) {
	            max = chars[i];
	        }
	    }
	    System.out.println(max);
	    
	    for (int j = 0; j < chars.length; j++) {
	        if (chars[j] < min) {
	            min = chars[j];
	        }
	    }
	    System.out.println(min);
	    
	    for(int k = 0; k < chars.length; k++){
        	totalcal = totalcal + chars[k];
        }
        
        double average = totalcal / chars.length;

        System.out.println("El promedio es: " + average);
        
        ArrayList<Object> listMix = new ArrayList<Object>();
        listMix.add(max);
    	listMix.add(min);
    	listMix.add(average);
    	
    	System.out.println("Los valores máximo, mínimo y promedio son: " + listMix);
    }
    
    //Cambiando los Valores del Arreglo
    public void changeVal() {
    	ArrayList<Integer> listChange = new ArrayList<Integer>();
    	
    	listChange.add(1);
    	listChange.add(5);
    	listChange.add(10);
    	listChange.add(7);
    	listChange.add(-2);
    	
    	for (int i=0; i <= listChange.size() - 1; i++){
    		listChange.remove(0);
        	listChange.add(0);
        	System.out.println(listChange);
        }
    }
}