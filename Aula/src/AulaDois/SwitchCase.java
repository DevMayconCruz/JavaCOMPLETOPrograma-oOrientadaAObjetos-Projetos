package AulaDois;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.println("Digite a opção 1 ou a opção 2");
		x = sc.nextInt();

		switch (x) {
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2");
			break;
		default:
			System.out.println("Opção invalida! ");
			break;
		}

	}

}
