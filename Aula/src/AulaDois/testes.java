package AulaDois;
import java.util.Scanner;
public class testes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = 5;
		int horas = 0;

		if ((x <= 20) && (x == 5)) {
			System.out.println("True");

		}

		System.out.println("Quantas horas?");
		horas = in.nextInt();

		if (horas < 12) {
			System.out.println("Bom dia!");

		} else if ((horas < 18)) {
			System.out.println("Boa tarde!");

		} else {
			System.out.println("Boa noite!");

		}

		in.close();

	}

}
