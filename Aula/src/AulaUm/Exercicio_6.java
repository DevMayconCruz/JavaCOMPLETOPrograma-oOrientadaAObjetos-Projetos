package AulaUm;
import java.util.Scanner;
public class Exercicio_6 {
	


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*Fazer um programa para ler o código de uma peça 1, o
		número de peças 1, o valor unitário de cada peça 1, o 
		código de uma peça 2, o número de peças 2 e o valor 
		unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		Entrada:                                 Saída:VALOR A PAGAR: R$ 15.50
        12 1 5.30
        16 2 5.10
		
		Entrada:                                 Saída:VALOR A PAGAR: R$ 51.40
        13 2 15.30
        161 4 5.20
		
		Entrada:                                 Saída:VALOR A PAGAR: R$ 30.20
        1 1 15.10
        2 1 15.10
		
		
		
		*/
		int cod1=0;
		int cod2=0;
		int numPecas1 = 0;
		int numPecas2 = 0;
		double vlPecas1 = 0;
		double vlPecas2 = 0;
		double total;
		
		System.out.println("Digite o código do produto: ");
		cod1 = in.nextInt();
		System.out.println("Digite a quantidade de paças:");
		numPecas1 = in.nextInt();
		System.out.println("Digite o valor das peças: ");
		vlPecas1 = in.nextDouble();
		System.out.println("Digite o código do produto: ");
		cod2 = in.nextInt();
		System.out.println("Digite a quantidade de paças:");
		numPecas2 = in.nextInt();
		System.out.println("Digite o valor das peças: ");
		vlPecas2 = in.nextDouble();
		total = (numPecas1 * vlPecas1)+(numPecas2*vlPecas2);
		System.out.printf("Valor a pagar: %.2f%n",total);
		
	}
     	
	
	
	
	
	
	

}
