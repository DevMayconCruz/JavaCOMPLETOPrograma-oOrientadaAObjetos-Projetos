package AulaUm;
import java.util.Scanner;
public class Exercicio_6 {
	


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*Fazer um programa para ler o c�digo de uma pe�a 1, o
		n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
		c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor 
		unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
		
		Entrada:                                 Sa�da:VALOR A PAGAR: R$ 15.50
        12 1 5.30
        16 2 5.10
		
		Entrada:                                 Sa�da:VALOR A PAGAR: R$ 51.40
        13 2 15.30
        161 4 5.20
		
		Entrada:                                 Sa�da:VALOR A PAGAR: R$ 30.20
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
		
		System.out.println("Digite o c�digo do produto: ");
		cod1 = in.nextInt();
		System.out.println("Digite a quantidade de pa�as:");
		numPecas1 = in.nextInt();
		System.out.println("Digite o valor das pe�as: ");
		vlPecas1 = in.nextDouble();
		System.out.println("Digite o c�digo do produto: ");
		cod2 = in.nextInt();
		System.out.println("Digite a quantidade de pa�as:");
		numPecas2 = in.nextInt();
		System.out.println("Digite o valor das pe�as: ");
		vlPecas2 = in.nextDouble();
		total = (numPecas1 * vlPecas1)+(numPecas2*vlPecas2);
		System.out.printf("Valor a pagar: %.2f%n",total);
		
	}
     	
	
	
	
	
	
	

}
