package AulaUm;

import java.util.*;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		
	/*	Fazer um programa que leia o n�mero de um 
		funcion�rio, seu n�mero de horas trabalhadas,
		o valor que recebe por 
		hora e calcula o sal�rio desse funcion�rio.
		A seguir, mostre o n�mero e o sal�rio 
		do funcion�rio, com duas casas decimais.  
		
Entrada: 25 100 5.50***********Sa�da: N�mber = 25 Salary = U$ 550.00
Entrada: 1 200 20.50 **********Sa�da N�mber = 1 Salary = U$ 4100.00		
Entrada: 6 145 15.55 **********Sa�da N�mber = 6 Salary = U$ 2254.75				
	                                                                 */
		 
		    
		    int numeroFuncionario=0;
		    int horasTrabalhadas=0;
			double x=0;
			double totalSalario=0;
			
			
			System.out.println("Digite o n�mero do funcionario ");
			numeroFuncionario = input.nextInt();
			System.out.println("Digite o total de horas trabalhadas: ");
			horasTrabalhadas = input.nextInt();
			System.out.println("Digite o salario do funcion�rio: ");
			x = input.nextDouble();
			
			totalSalario = (horasTrabalhadas*x);
			
			System.out.printf("Funcionario n�mero: "+numeroFuncionario+" valor do sal�rio a receber:%.2f%n ",totalSalario);
	  
		
			
		
		
		
		
	}
	
	
}
