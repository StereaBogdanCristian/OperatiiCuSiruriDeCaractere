package Prob6;

import java.util.Arrays;

public class Problema6 {
	
	public static void main(String[] args) {
		
		String[] vector, vector1;
		long oraInitiala, oraFinala;
		
		vector = GenerareVector.generare(3000);
		
		oraInitiala = System.currentTimeMillis();
		vector = OrdoneazaSir.ordoneaza(vector);
		oraFinala = System.currentTimeMillis();
		//System.out.println(oraInitiala + "         " + oraFinala);
		System.out.println("Sortare clasica - timp: " + (oraFinala - oraInitiala));
		
		
		System.out.println("*******************");
		
		vector1 = GenerareVector.generare(3000);
		oraInitiala = System.currentTimeMillis();
		Arrays.sort(vector1);
		oraFinala = System.currentTimeMillis();
		//System.out.println(oraInitiala + "         " + oraFinala);
		System.out.println("Sortare cu Arrays.sort - timp: " + (oraFinala - oraInitiala));
		
		}
	
}
