package AulaUm;

import java.text.DecimalFormat;

public class CriandoTesteParaAprendizado {
	
	
	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat();
		// Resolva em z7

		// x + (y^2) + 2 = 0
		// Manual
		// 0 + 0^2 +2= 2f  *   1 + 0^2 = 3f  *   2 + 0^2 = 4f  *  3 + 0^2 = 5f
		// 0 + 1^2 +2= 3f  *   1 + 1^2 = 4f  *   2 + 1^2 = 5f  *  3 + 0^2 = 6f
		// 0 + 2^2 +2= 6f  *   1 + 2^2 = 0v  *   2 + 2^2 = 1f  *  3 + 0^2 = 2f
		// 0 + 3^2 +2= 4f  *   1 + 3^2 = 5f  *   2 + 3^2 = 6f  *  3 + 0^2 = 0v
		// 0 + 4^2 +2= 4f  *   1 + 4^2 = 5f  *   2 + 4^2 = 6f  *  3 + 0^2 = 0v
		// 0 + 5^2 +2= 6f  *   1 + 5^2 = 0v  *   2 + 5^2 = 1f  *  3 + 0^2 = 2f
		// 0 + 6^2 +2= 3f  *   1 + 6^2 = 4f  *   2 + 6^2 = 5f  *  3 + 0^2 = 6f
		// ****************************************************************
		// 4 + 0^2 =6
		// 4 + 1^2 =0
		// 4 + 2^2 =3
		// 4 + 3^2 =1
		// 4 + 4^2 =1
		// 4 + 5^2 =3
		// 4 + 6^2 =0
		// *****************************************************************
		// Algoritmo

		String b;
		int x3 = 0;
		double r = 0;
		int z = 7;
		int S;
		int x = 0;
		int y = 0;
		int a, c;
		for (x = 0; x <= 6; x++) {
		System.out.println();
		System.out.println();
		for (y = 0; y <= 6; y++) {

		r = x + Math.pow(y, 2) + 2;
		r = r % z;
		b = (r == 0) ? "v" : "f";
		// x + (y^2) + 2 = 0
		System.out.println(x + " +(" + y +"^2)"+" + 2 = " + df.format(r) + b);
		           
		if (r == 0) {

		System.out.println("{(" + x + ")} {(" + y + ")}");

		         }

		     }

		 }

	 }

 }	



		
		
	
	
	
	


