
public class FilaAtendimentoBancario {
	public static void main(String[] args) {
		Fila fila = new Fila();
		Fila filaPrioritaria = new Fila();
		
		fila.enfileira(101);
		fila.enfileira(102);
		fila.enfileira(103);
		fila.enfileira(104);
		fila.enfileira(105);
		
		filaPrioritaria.enfileira(201);
		filaPrioritaria.enfileira(202);
		filaPrioritaria.enfileira(203);
		filaPrioritaria.enfileira(204);
		filaPrioritaria.enfileira(205);
		
		int cont = 1;
		
		while(!fila.ehVazia() || !filaPrioritaria.ehVazia()) {
			if(cont <= 2 && !filaPrioritaria.ehvazia()) {
				System.out.println(filaPrioritaria.desenfileira());
				cont++;
			} else {
				System.out.println(fila.desenfileira());
				cont = 1;
			}
		}
		
		
	}
	

}
