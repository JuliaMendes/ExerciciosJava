import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número para saber sua tabuada");
		int numero = leitor.nextInt();
		for(int i = 1; i<= 10; i++) {
			int tabuada = numero * i;
			System.out.println(numero + "x" + i + " = " + tabuada);
		}
		
	}

}
