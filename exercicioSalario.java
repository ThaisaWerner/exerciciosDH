package exerciciosDh;

import java.util.Scanner;

public class exercicioSalario {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nomeFuncionario = leia.nextLine();
		
		System.out.println("H� quanto tempo trabalha aqui?");
		int tempoServico = leia.nextInt();
		
		System.out.println("Qual � o seu sal�rio atual?");
		float salario = leia.nextFloat();
		
		if(tempoServico >= 10) {
			salario = (float) (salario + salario * 0.10);
			System.out.println(nomeFuncionario + " Parab�ns! Seu novo sal�rio � " + salario);
		} else {
			System.out.println("Sinto muito " + nomeFuncionario + "! Fique mais um tempo conosco e receber� sua recompensa salarial.");
		}
		
	}
}

