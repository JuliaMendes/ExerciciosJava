import java.util.Scanner;

public class ReajusteSalarial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o seu salário");
		float salario = leitor.nextFloat();
		float novoSalario;
		if(salario < 500) {
			novoSalario = salario * 1.15f;
		} else if(salario >= 500 && salario <= 1000) {
			novoSalario = salario * 1.10f;
		} else {
			novoSalario = salario * 1.05f;
		}
		System.out.print("Seu novo salário é :" + novoSalario);
			
		}
		

}
