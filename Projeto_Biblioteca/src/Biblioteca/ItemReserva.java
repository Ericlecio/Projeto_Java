package Biblioteca;

public class ItemReserva {
	private Livro livro;

	public ItemReserva(Livro livro) {
		this.livro = livro;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}