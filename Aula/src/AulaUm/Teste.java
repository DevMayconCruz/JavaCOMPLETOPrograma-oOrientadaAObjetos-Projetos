package AulaUm;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		        int  pares = 0;
		        int  impares = 0;
		        int  positivos = 0;
		        int  negativos = 0;
		        int numeros = 0;
		       
               
		        for (int i = 0;i < 5;i++) {
		        numeros = leitor.nextInt();	
		        	if(numeros % 2 == 0 ){
		        	 
		         pares++;
		             
		        	}else{
		        		
		        	impares++;	
		        
		        	}if(numeros > 0) {
		        		
		        	positivos++;	
		        		
		        	}if(numeros<0){
		        		
		        	negativos++;	
		        		
		        	}
		        	
		        	
		        	
		        	
		        	
		        }
		
		        System.out.println(pares + " valor(es) par(es)");
		        System.out.println(impares + " valor(es) impar(es)");
		        System.out.println(positivos + " valor(es) positivo(s)");
		        System.out.println(negativos + " valor(es) negativo(s)");
		
		
       leitor.close();
		
	}
   
}

