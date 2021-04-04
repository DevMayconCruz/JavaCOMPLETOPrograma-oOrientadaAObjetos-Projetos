package AulaUm;
import java.util.Locale;
import java.util.Scanner;

public class PrimeiraAula {
	
	
	

		 public static void main(String[] args){

		   Scanner sc = new Scanner(System.in);
		   
		    double x =12.52555;
		    String nome = "Maria";
		    int idade = 38;
		    double renda = 4000.0;
		    
	       System.out.println(x);
		   System.out.printf("%.2f%n",x);
		   System.out.printf("%.2f%n",x);
		   Locale.setDefault(Locale.US);
		   System.out.printf("%.2f%n",x);
		   System.out.println("Resultado"+" = "+x);
		   System.out.printf("Resultado = %.2f%n ",x);
		   System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
		   
		   String product1 ="Computer";
		   String product2 ="Office desk";
		   
		   int age = 30;
		   int code = 5290;
		   char gender = 'f';
		   
		   double price1 = 2100.0;
		   double prince2 = 650.50;
		   double measure = 53.23456700; 
		   
		   
		   System.out.println(" Computer, which price is $ 2.100,00");
		   System.out.println(" Office desk, which price $  65,50");
		   System.out.printf("Registro: %d years old, code %d and gender %s %n",age,code,gender);
		   System.out.printf("Mesure whit eight decimal places: %.8f %n",measure);
		   
		   //*******************************************************************************\\
		   
		   System.out.println("-------------------------------------------------------");
		   
		   
		   
		 
		  
		   double a,b;
		   double resultado=0;
		   a=5;
		   b=2;
		   resultado = a/b;
		   System.out.println(resultado);
		   
		  
		  
		   a=5;
		   b=2;
		   resultado =(double) a/b;
		   System.out.println(resultado);
		   
		   //Obs:Neste caso não é mais necessário usar o casting, pois o java atualizou. Agora ele converte automaticamente de double para int.\\
		   
		   a = 5.0;
		   b = a;
		   System.out.println(b);
		   
		   //**********************************************\\
		   String nome2;
		   nome2 = sc.next();
		   System.out.println("Você digitou"+nome2);
		  
		   int y=0;
		  y =  sc.nextInt();
		   System.out.println(y);
		   
		   double y2=0;
			  y2 =  sc.nextDouble();
			   System.out.println(y2);
		   sc.close();
		   
		   //Comentário teste\\


		} 






		}
	
        

