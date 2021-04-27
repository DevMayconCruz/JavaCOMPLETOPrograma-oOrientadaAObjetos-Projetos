package AulaDois;

import java.util.*;

public class Exercicio_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	/*
     * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 *Entrada: 12                 Saída: PAR
     *Entrada: -27                Saída: Impar
     *Entrada:0                   Saída: Par
	 */

	int par = 0;

	System.out.println("Digite um valor: ");
	par = sc.nextInt();

	if (par % 2 == 0) {

		System.out.println("PAR");

	} else {

		System.out.println("ÍMPAR");

	}

}

}
