package exerciciosDh;

import java.util.Scanner;

public class exercicioMedia {

	public static void main(String[] args) {
		Scanner alunoMedia = new Scanner(System.in);
		
		int notaTrimestre1, notaTrimestre2, notaTrimestre3, mediaAluno;
		
		System.out.print("Qual a nota do 1° trimestre?");
		notaTrimestre1 = alunoMedia.nextInt();
		
		System.out.println("Qual a nota do 1° trimestre?");
		notaTrimestre2 = alunoMedia.nextInt();
		
		System.out.println("Qual a nota do 1° trimestre?");
		notaTrimestre3 = alunoMedia.nextInt();
		
		mediaAluno = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3)/3;
		
		System.out.println("Sua média é ", mediaAluno);
		
		Switch (alunoMedia) {
		
		}
		alunoMedia.close();
	}

	private static void Switch(Scanner alunoMedia) {
	case1: 
	mediaAluno > = 7;
	System.out.println("Parabéns, você foi aprovado!!");
	break;
	
	case 2: mediaAluno >= 5;
	System.out.println("Sinto muito, você está de recuperação. Não desista!");
	break;
	
	case 3: mediaAluno < 5;
	System.out.println("Você foi reprovado. Descanse e tente novamente no próximo ano!");
	break;
		
	}

}
