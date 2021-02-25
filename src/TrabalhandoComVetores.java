import java.util.Scanner;

public class TrabalhandoComVetores {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva a quantidade de elementos que serão lidos para o vetor:");
        int tamanhoVetor = leitor.nextInt();

        int[] n = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Informe " + (i + 1) + "º valor de " + tamanhoVetor);
            n[i] = leitor.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }

        int achaMaiorDiferenca = achaMaiorDiferenca(n);
        System.out.println(achaMaiorDiferenca);

        boolean verificaOrdemVetor = verificaOrdemVetor(n);
        System.out.println(verificaOrdemVetor);
    }

    public static int achaMaiorDiferenca(int n[]) {
        int menor = n[0];
        int maior = n[0];
        int diferenca;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < menor) {
                menor = n[i];
            }
            if (n[i] > maior) {
                maior = n[i];
            }
        }

        diferenca = maior - menor;

        System.out.println("\n");

        return diferenca;
    }

    public static boolean verificaOrdemVetor(int n[]) {
        for (int i = 0; i < n.length; i++) {
            if (i == n.length - 1) {
                return true;
            }

            if (n[i] > n[i + 1]) {
                return false;
            }
        }

        return true;
    }
}