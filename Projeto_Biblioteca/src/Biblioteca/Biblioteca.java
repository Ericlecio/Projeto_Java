package Biblioteca;

import java.util.List;

public class Biblioteca {
	private List<Estante> estante;

	//CONSTRUTOR
	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}

	public Biblioteca(List<Estante> estante) {
		super();
		this.estante = estante;
	}

	//GETS E SETS
	public List<Estante> getEstante() {
		return estante;
	}

	public void setEstante(List<Estante> estante) {
		this.estante = estante;
	}
}