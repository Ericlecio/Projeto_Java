package Biblioteca;

import java.util.List;

public class Estante {
	private List<Livro> livros;

	//CONSTRUTOR
	public Estante() {
		// TODO Auto-generated constructor stub
	}

	public Estante(List<Livro> livros) {
		super();
		this.livros = livros;
	}
	
	//GETS E SETS
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}	

}