package Biblioteca;

public class Multa {
	private Pessoa pessoa;
	private Livro livro;
	private double valor;
	private String dataPagamento;

	//CONSTRUTOR
	public Multa() {
		// TODO Auto-generated constructor stub
	}

	public Multa(Pessoa pessoa, Livro livro, double valor, String dataPagamento) {
		super();
		this.pessoa = pessoa;
		this.livro = livro;
		this.valor = valor;
		this.dataPagamento = dataPagamento;
	}

	//GETS E SETS
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}	
}