package AulaUm;
import java.util.Scanner;
public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	/*	Fazer um programa para ler quatro valores inteiros
		A, B, C e D. A seguir, calcule e mostre a diferença 
		do produto 
		de A e B pelo produto de C e D segundo a fórmula:
		DIFERENCA = (A * B - C * D)
		
		Entrada: 5 6 7 8 *************** Saída:  Diferença = -26 
		Entrada: 5 6 -7 8 ************** Saída:  Diferença = 86  */
		
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int DIFERENCA=0;
		
		System.out.println("Entrada: ");
		A = in.nextInt();
		System.out.println("Entrada: ");
	    B = in.nextInt();
	    System.out.println("Entrada: ");
		C = in.nextInt();
		System.out.println("Entrada: ");
		D = in.nextInt();
		
		DIFERENCA = (A * B - C * D);
		System.out.println("Saída: Diferença = "+DIFERENCA);
		
	}

}
