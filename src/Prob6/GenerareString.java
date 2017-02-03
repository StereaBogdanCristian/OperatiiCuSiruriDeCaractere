package Prob6;

public class GenerareString {

	public static String gen (int n){
		
		String caractere = new String ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		String sirGenerat = "";
		for (int i=0; i < n; i++){
			sirGenerat += caractere.charAt((int)(Math.random()*caractere.length()));
		}
		
	return sirGenerat;
	}
}
