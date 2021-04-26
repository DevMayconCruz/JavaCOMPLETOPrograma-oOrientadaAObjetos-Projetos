package AulaUm;
import java.util.Scanner;
public class Exercicio_8 {
           
	
	
	  /*Algoritmo análise de credito*/
	
	    public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		
		double renda;
		double emprestimo;
		double x;
		int parcelas;
		double y;
		
		System.out.println("Digite o valor do emprestimo: ");
		emprestimo = in.nextDouble();
		
		System.out.println("Digite o valor da sua renda: ");
		renda = in.nextDouble();
		
		System.out.println("Em quantas vezes deseja parcelar? ");
		parcelas = in.nextInt();
		
		y = emprestimo/parcelas;
		x = (renda * 30)/100;
		x = renda-x;
		
		  if(emprestimo<=x) {
			
			
			System.out.println("Emprestimo foi aprovado! ");
			System.out.printf("O valor do emprestimo é de R$ %.2f",emprestimo);
			System.out.print(" parcelado em "+parcelas);
			System.out.printf(" vezes de R$ %.2f ",y);
		  }else{
			
		       System.out.println("Infelizmente seu emprestimo não foi aprovado! ");	
			
		  }
		
		
		
	}
	
	
}
