package Prob7;

public class Ordoneaza {
	
	static void matrice (String[][] mat, int c){
		
		for (int i=0; i < 4; i++) {
			if (mat[i][c].compareTo(mat[i+1][c]) > 0) {
				Schimba.linii(mat, i, i+1);
				
				matrice(mat, c);
			}
		}
	}

}
