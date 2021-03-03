import java.util.Scanner;

public class ExercSwitch02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("N1:");
		float n1 = leitor.nextFloat();
		System.out.println("Operador");
		char op = leitor.next().charAt(0);
		System.out.println("N2:");
		float n2 = leitor.nextFloat();
		float resultado = 0.0f;
		switch(op) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;
		default:
			System.out.println("Operador Inválido!");
		}
		System.out.println("Resultado = " + String.format("%.2f", resultado));
	}
}
