package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
	private Pessoa pessoa;
	private Date dataReserva;
	private List<ItemReserva> itens;

	//CONSTRUTOR
	public Reserva(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.dataReserva = new Date();
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

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	public List<ItemReserva> getItens() {
		return itens;
	}

	public void setItens(List<ItemReserva> itens) {
		this.itens = itens;
	}
}