package AulaDois;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * CÓDIGO            ESPECIFICAÇÃO           PREÇO  
		 * 1                Cachorro Quente         R$4.00
		 *               
		 * 2                   X-Salada             R$4.50
		 * 
		 * 3                   X-bacon              R$5.00
		 * 
		 * 4                Torrada Simples         R$2.00
		 * 
		 * 5                  Refrigerante          R$1.50
		 * 
		 * Entrada: 3 2                           Saída: Total: R$ 10.00
         * 
         * Entrada: 2 3                          Saída:  Total: R$ 13.50
         *
		 */

		int codigo = 0;
		double valor = 0;
		double total = 0;
		int qtd;

		System.out.printf(
				" 1 - Cachorro Quente R$4.00%n 2 - X-Salada R$4.50 %n 3 - X-bacon R$5.00%n 4 - Torrada Simples R$2.00%n 5 - Refrigerante R$1.50%n Digite o código do produto:");
		codigo = sc.nextInt();
		System.out.printf("Digite a quantidade do produto escolhioda: ");
		qtd = sc.nextInt();
		switch (codigo) {

		case 1:

			valor = 4.00;
			total = qtd * valor;

			break;

		case 2:
			valor = 4.50;
			total = qtd * valor;

			break;

		case 3:

			valor = 5.00;
			total = qtd * valor;
			break;
		case 4:
			valor = 2.00;
			total = qtd * valor;
			break;
		case 5:
			valor = 1.50;
			total = qtd * valor;
			break;
		}
		System.out.printf("Total: R$ %.2f", total);

	}

}
