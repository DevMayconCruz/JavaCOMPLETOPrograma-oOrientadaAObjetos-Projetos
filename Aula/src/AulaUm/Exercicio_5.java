package AulaUm;

import java.util.*;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		
	/*	Fazer um programa que leia o número de um 
		funcionário, seu número de horas trabalhadas,
		o valor que recebe por 
		hora e calcula o salário desse funcionário.
		A seguir, mostre o número e o salário 
		do funcionário, com duas casas decimais.  
		
Entrada: 25 100 5.50***********Saída: Númber = 25 Salary = U$ 550.00
Entrada: 1 200 20.50 **********Saída Númber = 1 Salary = U$ 4100.00		
Entrada: 6 145 15.55 **********Saída Númber = 6 Salary = U$ 2254.75				
	                                                                 */
		 
		    
		    int numeroFuncionario=0;
		    int horasTrabalhadas=0;
			double x=0;
			double totalSalario=0;
			
			
			System.out.println("Digite o número do funcionario ");
			numeroFuncionario = input.nextInt();
			System.out.println("Digite o total de horas trabalhadas: ");
			horasTrabalhadas = input.nextInt();
			System.out.println("Digite o salario do funcionário: ");
			x = input.nextDouble();
			
			totalSalario = (horasTrabalhadas*x);
			
			System.out.printf("Funcionario número: "+numeroFuncionario+" valor do salário a receber:%.2f%n ",totalSalario);
	  
		
			
		
		
		
		
	}
	
	
}
