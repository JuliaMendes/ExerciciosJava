import java.util.Scanner;

public class Multado {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Velocidade:");
		int veloc = leitor.nextInt();
		if(veloc > 70) {
			System.out.print("Multado!");
		} else {
			System.out.print("Seguiu as normas de trânsito!");
		}
		
	}

}
