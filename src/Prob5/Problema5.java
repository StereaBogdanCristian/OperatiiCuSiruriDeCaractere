package Prob5;

public class Problema5 {
	
		public static void main(String[] args) {
			
			String sir1 = "obiceiul";
			String sir2 = "obiectiv";
			String temp = "";
			
			for (int i=0; i < sir1.length(); i++) {
				if (sir1.charAt(i) == sir2.charAt(i)) { 
					temp = temp.concat(sir1.substring(i, i+1));
				}
			}
					
			System.out.println(Recursiv.sirCom(sir1, sir2));
		}
}
