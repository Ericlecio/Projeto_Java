package Biblioteca;

public class ItemEmprestimo {
	private Livro livro;
	private String dataDevolucaoPrevista;

	//CONSTRUTOR
	public ItemEmprestimo(Livro livro, String dataDevolucaoPrevista) {
		this.livro = livro;
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}
	
	//GETS E SETS
	public Livro getLivro() {
		return livro;
	}

	public String getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}