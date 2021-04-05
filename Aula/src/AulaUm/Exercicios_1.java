package AulaUm;
import java.util.Scanner;
public class Exercicios_1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Criar um algoritmo que exiba a primeira letra de um nome 
		 char x;
		   
		 x =  sc.next().charAt(0); 
		  
		   System.out.println("A primeira letra do seu nome é "+x);
		
		 String x1;
		 int y1;
		 double z1;
		 
		 x1 = sc.next();
		 y1 = sc.nextInt();
		 z1 = sc.nextDouble();
		 
		 System.out.println(x1);
		 System.out.println(y1);
		 System.out.println(z1);
		 sc.close();
		
		
	}
	
	
	
}
