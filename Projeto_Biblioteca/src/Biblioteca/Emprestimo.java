package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
	private Pessoa pessoa;
	private String dataEmprestimo;
	private List<ItemEmprestimo> itens;

	//CONSTRUTOR
	public Emprestimo() {
		this.itens = new ArrayList<>();
	}

	public Emprestimo(Pessoa pessoa, String dataEmprestimo) {
		this.pessoa = pessoa;
		this.dataEmprestimo = dataEmprestimo;
		this.itens = new ArrayList<>();
	}
	
	//METODOS
	public void adicionarItem(ItemEmprestimo item) {
		itens.add(item);
	}

	//GETS E SETS
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public List<ItemEmprestimo> getItens() {
		return itens;
	}

	public void setItens(List<ItemEmprestimo> itens) {
		this.itens = itens;
	}

}