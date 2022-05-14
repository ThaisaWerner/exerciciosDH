package exerciciosDh;

import java.util.Scanner;

public class testeInput {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		int nina;
		int jade;
		int sum;
		System.out.println("Qual a idade de Nina?");
		nina = input.nextInt();

		System.out.println("Qual a idade de Jade?");
		jade = input.nextInt();

		sum = nina + jade;

		System.out.print(sum);
	}

}

