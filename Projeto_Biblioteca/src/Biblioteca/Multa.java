package Biblioteca;

import java.util.Date;

public class Multa {
	private Pessoa pessoa;
	private double valor;
	private Date dataPagamento;

	public Multa(Pessoa pessoa, double valor) {
		this.pessoa = pessoa;
		this.valor = valor;
	}

	public void pagarMulta() {
		dataPagamento = new Date();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}