package AulaDois;
import java.util.Scanner;

    public class Exercicio_2 {
	
	 
	
	 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
		
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que da direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 munutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, da� mostrar o valor a ser pago
		 * 
		 * Entrada: 22                         Sa�da: Valor a pagar: R$ 50.00 
		 * Entrada: 103                        Sa�da: Valor a pagar R$ 56.00
		 * 
		 */

		int minutos = 0;
		double conta = 50.00;
		System.out.println("Minutos gastos: ");
		minutos = in.nextInt();

		if (minutos > 100) {

			conta += (minutos - 100) * 2;

		}

		System.out.printf("Valor a pagar: R$ %.2f", conta);

	}

}
