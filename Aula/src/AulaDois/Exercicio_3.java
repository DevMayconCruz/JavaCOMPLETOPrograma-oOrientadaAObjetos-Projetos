package AulaDois;

import java.util.*;

public class Exercicio_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	/*
     * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
	 *Entrada: 12                 Sa�da: PAR
     *Entrada: -27                Sa�da: Impar
     *Entrada:0                   Sa�da: Par
	 */

	int par = 0;

	System.out.println("Digite um valor: ");
	par = sc.nextInt();

	if (par % 2 == 0) {

		System.out.println("PAR");

	} else {

		System.out.println("�MPAR");

	}

}

}
