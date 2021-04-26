package AulaDois;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
		
  /*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
   de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
   ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
   Se o ponto estiver na origem, escreva a mensagem “Origem”.
   Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
   situação.

    Entrada: 4.5 -2.2                           Saída: Q4
    Entrada: 0.1 0.1                            Saída: Q1
    Entrada: 0.0 0.0                            Saída: Origem                         */

	double y = 0;
	double x = 0;

	System.out.println("Digite o valor de y: ");
	y = in.nextDouble();

	System.out.println("Digite o valor de x: ");
	x = in.nextDouble();

	if ((x > 0) && (y > 0)) {

		System.out.println("Q1");

	} else if ((x < 0) && (y > 0)) {

		System.out.println("Q4");

	} else if ((x == 0) && (y == 0)) {

		System.out.println("Origem");

	}

}

}
