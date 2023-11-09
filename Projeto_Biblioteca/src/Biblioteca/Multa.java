package Biblioteca;

import java.util.Date;

public class Multa {
	private Pessoa pessoa;
	private Livro livro;
	private double valor;
	private Date dataPagamento;

	public Multa(Pessoa pessoa, Livro livro, double valor) {
		this.pessoa = pessoa;
		this.valor = valor;
		this.livro = livro;
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

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}




}