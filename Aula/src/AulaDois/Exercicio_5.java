package AulaDois;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
	 	
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 * Exemplos:
		 * Entrada: 25.01                   Saída: Intervalo (25,50]
		 * Entrada: 25.00                   Saída: Intervalo [0,25] 
		 * Entrada: 100.00                  Saída: Intervalo (75,100] 
		 * Entrada: -25.02                  Saída:  Fora de intervalo
		 *  
		 */
		
		double n = 0;

		System.out.println("Digite um número: ");
		n = in.nextDouble();

		if ((n >= 0) && (n <= 25)) {

			System.out.println("Intervalo [0,25]");

		} else if ((n > 25) && (n <= 50)) {

			System.out.println("Intervalo (25,50]");

		} else if ((n >= 75) && (n <= 100)) {

			System.out.println("Intervalo (75,100]");
		} else {

			System.out.println("Fora de intervalo");
		}
		in.close();

	}

}
