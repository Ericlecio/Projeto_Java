package Biblioteca;

public class ItemReserva {
	private Livro livro;

	//CONSTRUTOR
	public ItemReserva() {
		// TODO Auto-generated constructor stub
	}
	public ItemReserva(Livro livro) {
		this.livro = livro;
	}

	//GETS E SETS
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}