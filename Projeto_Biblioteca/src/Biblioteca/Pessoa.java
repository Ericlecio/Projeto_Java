package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String endereco;
	protected List<Livro> livrosPegos;

	//CONSTRUTOR
	public Pessoa() {
	}

	public Pessoa(String nome, int idade, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.livrosPegos = new ArrayList<>();
	}

	//METODOS
	public abstract String getTipo();


	//GETS E SETS
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Livro> getLivrosPegos() {
		return livrosPegos;
	}

	public void setLivrosPegos(List<Livro> livrosPegos) {
		this.livrosPegos = livrosPegos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}