package AulaQuatro;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1
		 * at� X, um valor por linha, inclusive o X, se for o caso. Exemplo: 
		 * Entrada:             Sa�da:
		 *       8                  1
		 *                          3
		 *                          5
		 *                          7
		 */
		
		
		
		
		int x = 0;

		System.out.println("Digite ");
		x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			if (i % 2 == 1) {

				System.out.println(i);

			}

		}

		sc.close();

	}

}
