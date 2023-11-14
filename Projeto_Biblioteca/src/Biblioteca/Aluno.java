package Biblioteca;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private int numeroMatricula;

	//CONSTRUTOR
	public Aluno(String nome, int idade, String endereco, int numeroMatricula) {
		super(nome, idade, endereco);
		this.numeroMatricula = numeroMatricula;
		this.livrosPegos = new ArrayList<>();
	}

	//METODOS
	@Override
	public String getTipo() {
		return "Aluno";
	}

	//GETS E SETS
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}