package Prob6;

public class GenerareVector {

	public static String[] generare (int nrElem) {
		
		String vec[] = new String[nrElem];
		
		for (int i = 0; i<nrElem; i++) {
			vec[i] = GenerareString.gen(100);
		}
		
		return vec;
	}
	
	/*public static void Afisare(String[] str) {
		for (String string : str) {
			System.out.println(string);
		}
	}*/
}
