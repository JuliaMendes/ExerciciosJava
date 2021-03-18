import java.util.Scanner;

public class PodeVotar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			System.out.println("Escreva o ano atual");
			int anoAtual = leitor.nextInt();
			System.out.println("Escreva seu ano de nascimento");
			int anoNascimento = leitor.nextInt();
			int idade = anoAtual-anoNascimento;
			if(idade >= 16) {
				System.out.println("Você tem " + idade + " anos, esta apto para votar");
			} else {
				System.out.println("Você tem " + idade + " anos, não esta apto para votar");
			}
		}
}
