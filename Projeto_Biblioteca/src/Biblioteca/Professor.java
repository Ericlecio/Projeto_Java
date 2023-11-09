package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private int numeroRegistro;

	//CONSTRUTOR
	public Professor(String nome, int idade, String endereco, int numeroRegistro) {
		super(nome, idade, endereco);
		this.numeroRegistro = numeroRegistro;
		this.livrosEmprestados = new ArrayList<>();
	}

	//METODOS
//	@Override
//	public void emprestarLivro(Livro livro) throws BibliotecaException {
//		if (livrosEmprestados.size() < 4) {
//			livrosEmprestados.add(livro);
//		} else {
//			throw new BibliotecaException("Você atingiu o limite de livros emprestados.");
//		}
//	}
//
//	@Override
//	public void devolverLivro(Livro livro) {
//		livrosEmprestados.remove(livro);
//	}

	//GETS E SETS
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
}
