package Biblioteca;

import java.util.List;

public class Biblioteca {
	private List<Estante> estante;
	private List<Funcionario> funcionario;

	//CONSTRUTOR
	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}

	public Biblioteca(List<Estante> estante, List<Funcionario> funcionario) {
		super();
		this.estante = estante;
		this.funcionario = funcionario;
	}


	//GETS E SETS
	public List<Estante> getEstante() {
		return estante;
	}

	public void setEstante(List<Estante> estante) {
		this.estante = estante;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
}