package AulaUm;
import java.util.Scanner;
public class Exercicio_2 {
	
	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		/* Fa�a um programa para ler dois valores inteiros, e 
		   depois mostrar na tela a soma desses n�meros com uma 
		   mensagem explicativa, conforme exemplos.
		   Exemplos:
		   Entrada:10 30    *************   Sa�da: SOMA = 40     */
				   
		   int a = 0;		  
		   int b = 0;  
		   int soma; 
		   a = in.nextInt();
		   b = in.nextInt();
		   soma = a+b;
		   System.out.println("Entrada: "+a+" "+b+" sa�da: "+soma); 
		
		
	}

}
