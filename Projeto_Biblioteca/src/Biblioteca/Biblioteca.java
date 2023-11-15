package Biblioteca;

import java.util.List;

public class Biblioteca {
	private List<Estante> estante;
	private List<Funcionario> funcionario;
	private List<Pessoa> pessoa;
	private List<Livro> livro;
	private List<Emprestimo> emprestimo;
	private List<Reserva> reserva;
	private List<Multa> multa;


	//CONSTRUTOR
	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}

	public Biblioteca(List<Estante> estante, List<Funcionario> funcionario, List<Pessoa> pessoa, List<Livro> livro,
			List<Emprestimo> emprestimo, List<Reserva> reserva, List<Multa> multa) {
		super();
		this.estante = estante;
		this.funcionario = funcionario;
		this.pessoa = pessoa;
		this.livro = livro;
		this.emprestimo = emprestimo;
		this.reserva = reserva;
		this.multa = multa;
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

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	public List<Emprestimo> getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(List<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
	}

	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public List<Multa> getMulta() {
		return multa;
	}

	public void setMulta(List<Multa> multa) {
		this.multa = multa;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

}