package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private Pessoa pessoa;
	private String dataReserva;
	private List<ItemReserva> itens;

	//CONSTRUTOR
	public Reserva(Pessoa pessoa, String dataReserva ) {
		this.pessoa = pessoa;
		this.dataReserva = dataReserva;
		this.itens = new ArrayList<>();
	}

	public Reserva() {
		this.itens = new ArrayList<>();
	}

	//METODOS
	public void adicionarItem(ItemReserva item) {
		itens.add(item);
	}

	//GETS E SETS
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}

	public List<ItemReserva> getItens() {
		return itens;
	}

	public void setItens(List<ItemReserva> itens) {
		this.itens = itens;
	}
}