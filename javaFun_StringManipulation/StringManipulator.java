public class StringManipulator {
	public String trimAndConcat(String textoa, String textob) {
		textoa = textoa.trim();
		textob = textob.trim();
		return textoa.concat(textob);
	}

	public Integer getIndexOrNull(String a, char b) {
		if(a.indexOf(b) < 0) {
			return null;
		} else {
			return a.indexOf(b);
		}
	}

	public Integer getIndexOrNull(String textoc, String textod) {
		if(!textoc.contains(textod)) {
			return null;
		} else {
			return textoc.indexOf(textod);
		}
	}

	public String concatSubstring(String otroa, int numa, int numb, String otrob) {
		otroa = otroa.substring(numa , numb);
		return otroa.concat(otrob);
	}
}