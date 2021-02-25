import java.util.Scanner;

public class NotaAluno {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a sua nota");
		int nota = leitor.nextInt();
		if(nota >= 9) {
			System.out.print("Conceito A");
		} else if (nota >= 7) {
			System.out.print("Conceito B");
		} else if (nota >= 6) {
			System.out.print("Conceito C");
			
		} else {
			System.out.print("Conceito D");
		}
	}

}
