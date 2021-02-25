import java.util.Scanner;

public class ExemploWhile03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int soma = 0;
		System.out.println("Número: ");
		int numero = leitor.nextInt();
		while(numero >= 0) {
			soma+= numero;
			System.out.println("Número: ");
			numero = leitor.nextInt();
		}
		
		System.out.println("Soma = " + soma);
		
	}

}
