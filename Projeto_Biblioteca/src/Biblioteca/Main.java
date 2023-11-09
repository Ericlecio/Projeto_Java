package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws BibliotecaException {

		// Criando a biblioteca
		Biblioteca biblioteca = new Biblioteca();

		// Criando as estantes
		Estante estante1 = new Estante();
		Estante estante2 = new Estante();

		// Criando uma lista de estantes e setando as estantes
		List<Estante> listaEstantes = new ArrayList<Estante>();
		listaEstantes.add(estante1);
		listaEstantes.add(estante2);

		// Setando a lista de estantes para a biblioteca
		biblioteca.setEstante(listaEstantes);


		// Criação do livros
		Livro livro1 = new Livro("Livro 1", "Autor 1", 2000);
		Livro livro2 = new Livro("Livro 2", "Autor 2", 2005);
		Livro livro3 = new Livro("Livro 3", "Autor 3", 2010);

		Livro livro4 = new Livro("Livro 4", "Autor 4", 2010);
		Livro livro5 = new Livro("Livro 5", "Autor 4", 2010);
		Livro livro6 = new Livro("Livro 6", "Autor 4", 2010);

		//Setando os livros para as estantes
		estante1.adicionarLivro(livro1);
		estante1.adicionarLivro(livro2);
		estante1.adicionarLivro(livro3);

		estante2.adicionarLivro(livro4);
		estante2.adicionarLivro(livro5);
		estante2.adicionarLivro(livro6);

		//Criando uma lista de livros e setando os TODOS os livros. 
		List<Livro> listalivros = new ArrayList<Livro>();
		listalivros.add(livro1);
		listalivros.add(livro2);
		listalivros.add(livro3);
		listalivros.add(livro4);
		listalivros.add(livro5);
		listalivros.add(livro6);


		//Criação das Pessoas, Professor/Aluno
		Professor professor = new Professor("Leonardo Lima", 40, "Rua de rico", 1234);
		Aluno aluno = new Aluno("Ericlecio", 24, "Rua J", 567);

		//Criando uma lista de Pessoas e setando os alunos e professores
		List<Pessoa> ListaPessoa = new ArrayList<Pessoa>();
		ListaPessoa.add(aluno);
		ListaPessoa.add(professor);


		// Criando ItemEmprestimo1 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo1 = new ItemEmprestimo(livro1, new Date());

		// Criando Emprestimo 1 e adicionando itemEmprestimo1
		Emprestimo emprestimo1 = new Emprestimo(professor);
		emprestimo1.adicionarItem(itemEmprestimo1);

		// Criando ItemEmprestimo2 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo2 = new ItemEmprestimo(livro2, new Date());

		// Criando Emprestimo e adicionando itemEmprestimo2
		Emprestimo emprestimo2 = new Emprestimo(aluno);
		emprestimo2.adicionarItem(itemEmprestimo2);

		// Criando ItemEmprestimo3 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo3 = new ItemEmprestimo(livro3, new Date());
		// Criando Emprestimo3 e adicionando itemEmprestimo3
		Emprestimo emprestimo3 = new Emprestimo(aluno);
		emprestimo3.adicionarItem(itemEmprestimo3);

		List<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
		ListaEmprestimos.add(emprestimo1);
		ListaEmprestimos.add(emprestimo2);
		ListaEmprestimos.add(emprestimo3);

		Multa multa = new Multa(professor,livro1, 10.0);
		List<Multa> multas = new ArrayList<>();
		multas.add(multa);


		System.out.println("Todos os livros da Biblioteca:");
		for (Livro livro : listalivros) {
			System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
		}

		int somador = 1;
		for (Estante estantes : listaEstantes) {
			System.out.println();
			System.out.println("Estante " + somador);
			for (Livro livro : estantes.getLivros()) {
				System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
			}
			System.out.println("Todos os livros da estante " + somador +".\n");
			somador = somador + 1;
		}


		System.out.println("\nEmpréstimos:");
		for (Emprestimo emprestimo : ListaEmprestimos) {
			System.out.println(emprestimo.getPessoa().getClass().getSimpleName());
			System.out.println(emprestimo.getPessoa().getNome());
			System.out.println("Data de emprestimo: " + emprestimo.getDataEmprestimo());
			for (ItemEmprestimo item : emprestimo.getItens()) {
				System.out.println("Livro: " + item.getLivro().getTitulo());
				System.out.println("Data de devolução prevista: " + item.getDataDevolucaoPrevista());
				System.out.println("------------------------------------------------------------------");
			}
		}


		System.out.println("\nMultas:");
		for (Multa multaItem : multas) {
			System.out.println("Pessoa: " + multaItem.getPessoa().getNome());
			System.out.println("Livro: " + multaItem.getLivro().getTitulo());
			System.out.println("Valor da Multa: " + multaItem.getValor());
			System.out.println("------------------------------------------------------------------");
		}


		System.out.println("\nPessoas Cadastradas:");
		for (Pessoa pessoa: ListaPessoa) {
			System.out.println("Pessoa: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Endereço: " + pessoa.getEndereco());
			System.out.println("------------------------------------------------------------------");
		}
	}
}
