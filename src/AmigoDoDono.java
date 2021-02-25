import java.util.Scanner;

public class AmigoDoDono {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a sua idade:");
		System.out.println("É amigo do dono? s/n");
		int idade = leitor.nextInt();
		String amigoDono = leitor.next();
		if(idade < 18 && amigoDono == "n") {
			System.out.print("Não pode entrar");
			
		} else {
			System.out.print("Pode entrar");
		}
		
		
	}
}
