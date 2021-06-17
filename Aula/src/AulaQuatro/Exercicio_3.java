package AulaQuatro;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		char resp;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		double c = sc.nextDouble();
		double f = 9.0 * c / 5.0 +32.0;
		System.out.printf("Equivalente em fahrenheit: %.1f%n",f);
		System.out.println("Deseja repetir (s/n)");
		resp = sc.next().charAt(0); 
		}while(resp!= 'n');
		
	}

}
