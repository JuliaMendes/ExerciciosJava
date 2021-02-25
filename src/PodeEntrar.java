import java.util.Scanner;

public class PodeEntrar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade =leitor.nextInt();
		if(idade >= 18) {
			System.out.print("Pode entrar");
		} else {
			System.out.print("Não pode entrar");
		}
				
	}

}
