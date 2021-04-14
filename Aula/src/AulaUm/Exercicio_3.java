package AulaUm;
import java.util.Scanner;
public class Exercicio_3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*  	Faça um programa para ler o valor do raio de 
		um círculo, e depois mostrar o valor da área deste 
		círculo com quatro 
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio^2
		Considere o valor de π = 3.14159
		
		Entrada: 2.00       Saída: A=12.5664
		
        Entrada: 100.64     Saída: A=31819.3103	

		Entrada:150.00      Saída: A=70685.7750   */
	 
	   double area = 0;
	   double raio = 0;	
	   double pi = 3.14159;		   
	    
	   
	   System.out.print(" Entrada:");
	   raio = in.nextDouble();
	   area = pi * (raio*raio);
	   System.out.printf(" Saída: "+"%.4f",area);
	   
		
	}
}
