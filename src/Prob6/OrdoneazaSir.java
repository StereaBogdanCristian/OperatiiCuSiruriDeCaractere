package Prob6;

public class OrdoneazaSir {
	
	static String[] ordoneaza (String[] sir) {
		
		/* algoritm recursiv
		  
		String temp;
		
		for (int i=0; i < sir.length - 1; i++) {
			if (sir[i].compareTo(sir[i+1]) < 0) {
				temp = sir[i];
				sir[i] = sir[i+1];
				sir[i+1] = temp;
				
				verifica(sir);
			}
		}
		*/
		
		
		
		String temp, max;
		int poz;
		
		for (int i=0; i < sir.length-1; i++) {
			max = sir[i];
			temp = sir[i];
			poz = i;
			for (int j=i+1; j < sir.length; j++){
				if (max.compareTo(sir[j]) > 0) {
					max = sir[j];
					poz = j;
				}
			}
			sir[i] = max;
			sir[poz] = temp;
			
		}
	
		return sir;
			
	}
}
