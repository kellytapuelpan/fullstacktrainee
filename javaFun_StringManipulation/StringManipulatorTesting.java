public class StringManipulatorTesting {
    public static void main(String[] args) {
    	StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str);

		char letter = 'n';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer anothera = manipulator.getIndexOrNull(word, subString);
		Integer anotherb = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(anothera);
		System.out.println(anotherb);

		String newword = manipulator.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(newword);
    }
}