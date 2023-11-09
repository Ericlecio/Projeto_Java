package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private int numeroMatricula;

	//CONSTRUTOR
	public Aluno(String nome, int idade, String endereco, int numeroMatricula) {
		super(nome, idade, endereco);
		this.numeroMatricula = numeroMatricula;
		this.livrosEmprestados = new ArrayList<>();
	}

	//METODOS
	//	@Override
	//	public void emprestarLivro(Livro livro) throws BibliotecaException {
	//		if (livrosEmprestados.size() < 3) {
	//			livrosEmprestados.add(livro);
	//		} else {
	//			throw new BibliotecaException("Você atingiu o limite de livros emprestados.");
	//		}
	//	}
	//	@Override
	//	public void devolverLivro(Livro livro) {
	//		livrosEmprestados.remove(livro);
	//	}

	//GETS E SETS
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}