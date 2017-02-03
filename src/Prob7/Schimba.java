package Prob7;

public class Schimba {
		
	static void linii (String[][] mat, int l1, int l2) {
		String temp = new String();
		
		for (int i = 0; i < 5; i++) {
			temp = mat[l1][i];
			mat[l1][i] = mat[l2][i];
			mat[l2][i] = temp;
		}
		
	}
}
