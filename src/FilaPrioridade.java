
public class FilaPrioridade {
	public static void main(String[] args) {
		filaprioridade f = new filaprioridade(6);
		try {
			f.enfileira(new Item<String>("roxo", 5));
			f.enfileira(new Item<String>("preto", 1));
			f.enfileira(new Item<String>("laranja", 0));
			f.enfileira(new Item<String>("branco", 4));
			f.enfileira(new Item<String>("verde", 1));
			f.enfileira(new Item<String>("amarelo", 3));
		} catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
		System.out.printf("%s\n\n", f);
		try {
			while(!f.ehVazia()) {
				System.out.println(f.desenfileira());
			}
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}

}
