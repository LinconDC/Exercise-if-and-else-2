package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Duração do jogo
		System.out.print("Que horas o jogo começou?: ");
		int initial = sc.nextInt();
		System.out.print("Que horas o jogo terminou?: ");
		int terminated = sc.nextInt();

		if (initial > terminated) {
			int dur = 24 - initial + terminated;
			System.out.printf("O jogo durou %d horas", dur);
		} else {
			int dur = terminated - initial;
			System.out.printf("O jogo durou %d horas", dur);
		}
		System.out.println();
		System.out.println();

		// Pedido e valor total
		System.out.print("Insira o código e a quantidade do seu pedido: ");
		int cod = sc.nextInt();
		int qte = sc.nextInt();
		double total;

		if (cod == 1) {
			total = 4.00 * qte;
		} else if (cod == 2) {
			total = 4.50 * qte;
		} else if (cod == 3) {
			total = 5.00 * qte;
		} else if (cod == 4) {
			total = 2.00 * qte;
		} else {
			total = 1.50 * qte;
		}

		System.out.printf("Valor total do pedido: R$ %.2f%n", total);
		System.out.println();

		sc.close();

	}

}
