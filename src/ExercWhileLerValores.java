import java.util.Scanner;

public class ExercWhileLerValores {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		int[] num = {0, 0, 0, 0, 0, 0};
		int soma = 0;
		int tamanho = 0;
		float media = 0;
		
		while(i < 6){
			System.out.println("Número: ");
			num[i] = leitor.nextInt();
			i = i + 1;
		}

		i = 0;
		while(i < 6){
			int par = num[i] % 2;

			if(par == 0) {
				System.out.println("O número " + num[i] + " é par");
				soma = num[i]+num[i];
				tamanho = num.length;
				media = soma / tamanho;
			} else {
				System.out.println("O número " + num[i] + " não é par");
			}
			i++;
		}
		
		System.out.println("A soma dos pares é : " + soma);
		System.out.println("tamanho: " + tamanho);
		System.out.println("media: " + media);
		
		
	}

}
