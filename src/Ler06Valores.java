import java.util.Scanner;

public class Ler06Valores {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i = 1;
		int soma = 0;
		int quantidade = 0;
		while(i <= 6) {
			System.out.println("Digite um número");
			int numero = leitor.nextInt();
			if(numero % 2 == 0) {
				soma = soma + numero;
				quantidade = quantidade + 1;
			}
			i++;
		}
		float media = (float) soma / quantidade;
		System.out.println("A quantidade de números pares são: " + quantidade);
		System.out.println("A soma dos números pares é: " + soma);
		System.out.println("A média dos números pares é: " + String.format("%.1f", media));
	}

}
