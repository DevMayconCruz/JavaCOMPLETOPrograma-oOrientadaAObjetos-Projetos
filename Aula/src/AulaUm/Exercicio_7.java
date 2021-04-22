package AulaUm;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
		*A, B e C. Em seguida, calcule e mostre: 
		
		a) a área do triângulo retângulo que tem A por base e C por altura. 
		b) a área do círculo de raio C. (pi = 3.14159) 
		c) a área do trapézio que tem A e B por bases e C por altura. 
		d) a área do quadrado que tem lado B. 
		e) a área do retângulo que tem lados A e B
		
		Entrada:                        Saída:
        3.0 4.0 5.2                     TRIANGULO: 7.800
                                        CIRCULO: 84.949
                                        TRAPEZIO: 18.200
                                        QUADRADO: 16.000
                                        RETANGULO: 12.000
		Entrada:                        Saída:
        12.7 10.4 15.2                  TRIANGULO: 96.520
                                        CIRCULO: 725.833
                                        TRAPEZIO: 175.560
                                        QUADRADO: 108.160
                                        RETANGULO: 132.080 
		
		
		
		
		*/
		
		
		double A=0;
		double B=0;
		double C=0;
		double TRIANGULO=0;
		double CIRCULO=0;	
		double TRAPEZIO=0;
		double pi = 3.14159;		
		double QUADRADO=0;	
		double RETANGULO=0;
		
		
		System.out.println("A: ");
		A = in.nextFloat();
		System.out.println("B: ");
		B = in.nextFloat();
		System.out.println("C: ");
		C = in.nextFloat();
		
		
		TRIANGULO = (A*C)/2.0;
		CIRCULO =  C*C*pi;
		TRAPEZIO = (A+B)/2*C;
		QUADRADO = B*B;
		RETANGULO = A*B;
		
		System.out.printf("%.3f%n",TRIANGULO );
		System.out.printf("%.3f%n",CIRCULO );
		System.out.printf("%.3f%n",TRAPEZIO);
		System.out.printf("%.3f%n",QUADRADO);
		System.out.printf("%.3f%n",RETANGULO);
		
	}
	
	
	
	
}
