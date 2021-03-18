import java.util.Scanner;

public class MaiorQue100 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o número");
		int numero = leitor.nextInt();
		if(numero > 100) {
			int soma = numero + 150;
			System.out.println("A soma é:" + soma);
		} else {
			System.out.println("O valor é:" + numero);
		}
	}

}
