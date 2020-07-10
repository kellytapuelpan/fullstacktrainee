import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
public class PuzzleJava {
	// 1) Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los números en el arreglo. El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).
	public void PrintArray() {
		int[] theArray = new int[] {3,5,1,2,7,9,8,13,25,32};
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		int sum = 0;
	    for(int i = 0; i < theArray.length; i++) {
	    	sum = sum + theArray[i];
	    	if(theArray[i] > 10) {
	    		list.add(theArray[i]);
	    	}
	    }
	    
	    System.out.println(sum);
	    System.out.println(list);
	}
	
	// 2) Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.
	public void PrintNames() {
		ArrayList<String> nameslist = new ArrayList<String>();
		nameslist.add("Nancy");
		nameslist.add("Jinichi");
		nameslist.add("Fujibayashi");
		nameslist.add("Momochi");
		nameslist.add("Ishikawa");
		
		Collections.shuffle(nameslist);
        System.out.println(nameslist);
        
        ArrayList<String> nameslistnew = new ArrayList<String>();
        
        for (int i = 0; i < nameslist.size() ; i++) {
        	String str = nameslist.get(i);
            int length = str.length();
            if (length > 5) {
            	nameslistnew.add(str);
            }
        }
        Collections.shuffle(nameslistnew);
        System.out.println(nameslistnew);
	}
	
	// 3) Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
	public void Alphabet() {
		String[] lettersArray = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		List<String> letterslist = Arrays.asList(lettersArray);
		
		Collections.shuffle(letterslist);
        System.out.println(letterslist);
        
        System.out.println(letterslist.get(letterslist.size() - 1));
        System.out.println(letterslist.get(0));
        
        if (letterslist.get(0) == "a" || letterslist.get(0) == "e" || letterslist.get(0) == "i" || letterslist.get(0) == "o" || letterslist.get(0) == "u") {
	        System.out.println("Soy una linda vocal!! :)");
	    }
	}
	
	// 4) Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
	public void generateRandom() {
		int[] myArray;
		myArray = new int[10];
		
		ArrayList<Integer> randomlist = new ArrayList<Integer>();
		
        int num1 = 55;
        int num2 = 100;
      
		for(int i = 0; i<10; i++){
			int random = num1-((int)Math.round((Math.random())*(num1-num2)));
			randomlist.add(random);
		}
		System.out.println(randomlist);
	}
	
	// 5) Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
	public void getRamdomValues() {
		int[] randomArray;
		randomArray = new int[10];
		
		ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
		
        int num1 = 55;
        int num2 = 100;
      
		for(int i = 0; i<10; i++){
			int random = num1-((int)Math.round((Math.random())*(num1-num2)));
			randomnumbers.add(random);
		}
		
		Collections.sort(randomnumbers);
        System.out.println(randomnumbers);
        
        System.out.println("El valor m\u00ednimo del arreglo es: " + randomnumbers.get(0));
        System.out.println("El valor m\u00e1ximo del arreglo es: " + randomnumbers.get(randomnumbers.size() - 1));
	}
	
	// 6) Crear una cadena aleatoria con 5 caracteres de longitud.
	public void randomString() {
		String[] stringArray = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		ArrayList<Object> charslist = new ArrayList<Object>();
		
        int char1 = 0;
        int char2 = 25;
        
        String s1 = "";
        
        for(int i = 0; i<5; i++){
			int charrandom = char1-((int)Math.round((Math.random())*(char1-char2)));
			charslist.add(stringArray[charrandom]);
			s1 = s1.concat(stringArray[charrandom]);
		}
        System.out.println(s1);
	}
	
	// 7) Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud
	public void TenRandoms() {
		char[] chars = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> myChars = new ArrayList<>();
        StringBuilder listString = new StringBuilder();
        ArrayList<String> chainedStrings = new ArrayList<>();
        
        int i = 0;
        while(i < 10) {

            for (int j = 0; j < 5; j++) {
                int random = (int) (Math.random() * (26));
                myChars.add(chars[random]);
            }

            for (Character s : myChars){
                listString.append(s.toString());
            }

            chainedStrings.add(listString.toString());
            listString = new StringBuilder();
            myChars.clear();
            i++;
        }
        System.out.println(chainedStrings);
	}
}