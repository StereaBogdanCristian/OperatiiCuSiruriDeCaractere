package Prob7;

import Prob6.GenerareString;

public class Problema7 {
	
	public static void main(String[] args) {
		
		String matrice[][] = new String [5][5];
		int coloana = 0;
		
		for (int i=0; i<5; i++ )
			for (int j=0; j<5; j++)
				matrice[i][j] = GenerareString.gen(10);
		
		Afiseaza.matrice(matrice);

		System.out.println("*************");		
		
		Ordoneaza.matrice(matrice, coloana);
		
		Afiseaza.matrice(matrice);
	}
}
