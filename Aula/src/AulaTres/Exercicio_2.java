package AulaTres;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma). Exemplo:
		 *  Entrada:          Saída:
		 *       2 2             Primeiro
		 *       3 -2            Quarto
		 *      -8 -1            Terceirio
		 *      -7 1             Segundo
		 *       0 2
		 */      
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {

				System.out.println("Primeiro");

			} else if (x < 0 && y > 0) {

				System.out.println("Segundo");

			} else if (x < 0 && y < 0) {

				System.out.println("Terceiro");

			} else if (x > 0 && y < 0) {

				System.out.println("Quarto");

			}

			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.next();

	}

}
