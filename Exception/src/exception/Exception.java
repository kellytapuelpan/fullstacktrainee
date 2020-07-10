package exception;
import java.util.*;

public class Exception {
	public void getException() {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		for(int i = 0; i < myList.size(); i++) {
			try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
            catch (ClassCastException e){
                System.out.println("Hay un error en el \u00edndice "+ i);
                System.out.println("Exception: " + e);
            }
		}
	}
}