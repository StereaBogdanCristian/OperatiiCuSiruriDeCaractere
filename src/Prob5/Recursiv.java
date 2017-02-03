package Prob5;

public class Recursiv {

	/*static int factorial (int n) {
		if (n == 1) return 1;
		else return n*factorial (n-1);
	}*/
	
	static String sirCom (String s1, String s2) {
		if (s1.equals(s2)) return s1;
		else return sirCom (s1.substring(0, s1.length()-1), s2.substring(0, s1.length()-1));
	}
}
