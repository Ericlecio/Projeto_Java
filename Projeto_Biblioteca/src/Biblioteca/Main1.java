package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {

		// Criando a biblioteca
		Biblioteca biblioteca = new Biblioteca();

		// Criando as estantes
		Estante estante1 = new Estante();
		Estante estante2 = new Estante();

		// Criando uma lista de estantes e setando as estantes
		List<Estante> listaEstantes = new ArrayList<Estante>();
		listaEstantes.add(estante1);
		listaEstantes.add(estante2);

		//setando a lista de estantes para a biblioteca.
		biblioteca.setEstante(listaEstantes);

		// Criação do livros
		Livro livro1 = new Livro("Livro 1", "Autor 1", 2000);
		Livro livro2 = new Livro("Livro 2", "Autor 2", 2005);
		Livro livro3 = new Livro("Livro 3", "Autor 3", 2010);
		Livro livro4 = new Livro("Livro 4", "Autor 4", 2010);
		Livro livro5 = new Livro("Livro 5", "Autor 4", 2010);
		Livro livro6 = new Livro("Livro 6", "Autor 4", 2010);

		//Criando a lista de livros da estante1 e setando os livros que farão parte da estante 1.
		List<Livro> listaLivrosEstante1 = new ArrayList<Livro>();
		listaLivrosEstante1.add(livro1);
		listaLivrosEstante1.add(livro2);
		listaLivrosEstante1.add(livro3);
		estante1.setLivros(listaLivrosEstante1);

		//Criando a lista de livros da estante1 e setando os livros que farão parte da estante 1.
		List<Livro> listaLivrosEstante2 = new ArrayList<Livro>();
		listaLivrosEstante2.add(livro4);
		listaLivrosEstante2.add(livro5);
		listaLivrosEstante2.add(livro6);
		estante2.setLivros(listaLivrosEstante2);

		//Criando uma lista de todos os livros existentes na biblioteca e setando livros para lista. 
		List<Livro> listalivros = new ArrayList<Livro>();
		listalivros.add(livro1);
		listalivros.add(livro2);
		listalivros.add(livro3);
		listalivros.add(livro4);
		listalivros.add(livro5);
		listalivros.add(livro6);
		biblioteca.setLivro(listalivros);


		//Criação das Pessoas, Professor/Aluno
		Professor professor = new Professor("Leonardo Lima", 42, "Rua de rico", 1234);
		Aluno aluno = new Aluno("Ericlecio", 21, "Rua J", 567);

		//Criação dos funcionarios
		Funcionario funcionario1 = new Funcionario("Jose Ricardo", 32, "Rua Vinte", 0011, 1200);
		Funcionario funcionario2 = new Funcionario("Maria", 21, "Rua São vicente", 0022, 1500);
		Funcionario funcionario3 = new Funcionario("Larissa", 50, "Rua jose oliveira", 0033, 1000);


		//Criando lista de funcionarios e setando para a biblioteca
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		biblioteca.setFuncionario(listaFuncionario);


		//Criando uma lista de Pessoas e setando os alunos, professores e funcionarios
		List<Pessoa> ListaPessoa = new ArrayList<Pessoa>();
		ListaPessoa.add(aluno);
		ListaPessoa.add(professor);
		ListaPessoa.add(funcionario1);
		ListaPessoa.add(funcionario2);
		ListaPessoa.add(funcionario3);
		biblioteca.setPessoa(ListaPessoa);


		// Criando ItemEmprestimo1 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo1 = new ItemEmprestimo(livro1, "25/11/2023");

		// Criando Emprestimo 1 e adicionando itemEmprestimo1
		Emprestimo emprestimo1 = new Emprestimo();

		emprestimo1.setPessoa(professor);
		emprestimo1.adicionarItem(itemEmprestimo1);
		emprestimo1.setDataEmprestimo("20/11/2023");



		// Criando ItemEmprestimo2 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo2 = new ItemEmprestimo(livro2, "30/12/2023");
		// Criando Emprestimo e adicionando itemEmprestimo2
		Emprestimo emprestimo2 = new Emprestimo();
		emprestimo2.setPessoa(aluno);
		emprestimo2.adicionarItem(itemEmprestimo2);
		emprestimo2.setDataEmprestimo("20/12/2023");


		// Criando ItemEmprestimo3 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo3 = new ItemEmprestimo(livro3, "12/12/2023");
		// Criando Emprestimo3 e adicionando itemEmprestimo3
		Emprestimo emprestimo3 = new Emprestimo();
		emprestimo3.setPessoa(aluno);
		emprestimo3.adicionarItem(itemEmprestimo3);
		emprestimo3.setDataEmprestimo("06/12/2023");


		// Criando ItemEmprestimo3 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo4 = new ItemEmprestimo(livro5, "10/10/2023");
		// Criando Emprestimo4 e adicionando itemEmprestimo4
		Emprestimo emprestimo4 = new Emprestimo();
		emprestimo4.setPessoa(funcionario1);
		emprestimo4.adicionarItem(itemEmprestimo4);
		emprestimo4.setDataEmprestimo("07/12/2023");

		List<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
		ListaEmprestimos.add(emprestimo1);
		ListaEmprestimos.add(emprestimo2);
		ListaEmprestimos.add(emprestimo3);
		ListaEmprestimos.add(emprestimo4);
		biblioteca.setEmprestimo(ListaEmprestimos);

		Multa multa1 = new Multa();
		multa1.setLivro(livro1);
		multa1.setPessoa(professor);
		multa1.setValor(10);
		multa1.setDataPagamento("12/12/2023");


		Multa multa2 = new Multa();
		multa2.setLivro(livro2);
		multa2.setPessoa(aluno);
		multa2.setValor(100);
		multa2.setDataPagamento("12/12/2023");

		List<Multa> listasmultas = new ArrayList<>();
		listasmultas.add(multa1);
		listasmultas.add(multa2);
		biblioteca.setMulta(listasmultas);

		System.out.println("\n---------------- Todos os livros da Biblioteca -------------------");
		for (Livro livro : listalivros) {
			System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
		}


		System.out.println("\n------------------------- Funcionarios ---------------------------");
		for (Funcionario funcionarios : biblioteca.getFuncionario()) {
			System.out.println("Nome: " + funcionarios.getNome());
			System.out.println("Idade: " + funcionarios.getIdade());
			System.out.println("Endereço: " + funcionarios.getEndereco());
			System.out.println("Numero Funcionario" + funcionarios.getNumeroFuncionario());
			System.out.println("Salario: " + funcionarios.getSalario());
			System.out.println("Tipo: " + funcionarios.getTipo());
			System.out.println("---------------------------------------------------------------");
		}


		System.out.println("--------------------------- Estantes -----------------------------");
		int somador = 1;
		for (Estante estantes : biblioteca.getEstante()) {
			System.out.println();
			System.out.println("Estante " + somador);
			for (Livro livro : estantes.getLivros()) {
				System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
			}
			System.out.println("Todos os livros da estante " + somador +".\n");
			somador = somador + 1;
		}


		System.out.println("----------------------- Empréstimos -----------------------------");
		for (Emprestimo emprestimo : biblioteca.getEmprestimo()) {
			System.out.println(emprestimo.getPessoa().getTipo());
			System.out.println(emprestimo.getPessoa().getNome());
			System.out.println("Data de emprestimo: " + emprestimo.getDataEmprestimo());
			for (ItemEmprestimo item : emprestimo.getItens()) {
				System.out.println("Livro: " + item.getLivro().getTitulo());
				System.out.println("Data de devolução prevista: " + item.getDataDevolucaoPrevista());
				System.out.println("------------------------------------------------------------------");
			}
		}


		System.out.println("------------------------ Multas ----------------------------------");
		for (Multa multa :biblioteca.getMulta()) {
			System.out.println("Pessoa: " + multa.getPessoa().getNome());
			System.out.println("Livro: " + multa.getLivro().getTitulo());
			System.out.println("Valor da Multa: " + multa.getValor());
			System.out.println("Data de Pagamento: " + multa.getDataPagamento());
			System.out.println("------------------------------------------------------------------");
		}


		System.out.println("------------------- Pessoas Cadastradas ---------------------------");
		for (Pessoa pessoa : biblioteca.getPessoa()) {
			System.out.println("Pessoa: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Endereço: " + pessoa.getEndereco());
			System.out.println("Tipo: " + pessoa.getTipo());
			System.out.println("-------------------------------------------------------------------");
		}

	}
}