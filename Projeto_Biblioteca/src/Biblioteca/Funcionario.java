package Biblioteca;

public class Funcionario extends Pessoa {
	private int numeroFuncionario;
	private double salario;

	//CONSTRUTOR
	public Funcionario(String nome, int idade, String endereco, int numeroFuncionario, double salario) {
		super(nome, idade, endereco);
		this.numeroFuncionario = numeroFuncionario;
		this.salario = salario;
	}

	//METODOS
	@Override
	public String getTipo() {
		return "Funcionario";
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}