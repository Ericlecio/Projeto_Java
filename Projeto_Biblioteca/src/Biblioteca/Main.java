package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws BibliotecaException {

		// Criação do livros
		Livro livro1 = new Livro("Livro 1", "Autor 1", 2000);
		Livro livro2 = new Livro("Livro 2", "Autor 2", 2005);
		Livro livro3 = new Livro("Livro 3", "Autor 3", 2010);
		Livro livro4 = new Livro("Livro 4", "Autor 4", 2010);
		Livro livro5 = new Livro("Livro 5", "Autor 4", 2010);
		Livro livro6 = new Livro("Livro 6", "Autor 4", 2010);

		//Criação das Pessoas, Professor/Aluno
		Professor professor = new Professor("Leonardo Lima", 40, "Rua de rico", 1234);
		Aluno aluno = new Aluno("Ericlecio", 24, "Rua J", 567);


		List<Pessoa> ListaPessoa = new ArrayList<Pessoa>();
		ListaPessoa.add(aluno);
		ListaPessoa.add(professor);


		// Adicionando os livros a estante de livros.
		Estante estante = new Estante();
		estante.adicionarLivro(livro1);
		estante.adicionarLivro(livro2);
		estante.adicionarLivro(livro3);
		estante.adicionarLivro(livro4);
		estante.adicionarLivro(livro5);
		estante.adicionarLivro(livro6);

		// Coloque os objetos em listas para facilitar a iteração
		List<Livro> livros = estante.getLivros();

		// Criando ItemEmprestimo1 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo1 = new ItemEmprestimo(livro1, new Date());
		// Criando Emprestimo e adicionando itemEmprestimo1
		Emprestimo emprestimo1 = new Emprestimo(professor);
		emprestimo1.adicionarItem(itemEmprestimo1);

		// Criando ItemEmprestimo2 e adicionando o  livro com a data de devolução prevista
		ItemEmprestimo itemEmprestimo2 = new ItemEmprestimo(livro2, new Date());
		// Criando Emprestimo e adicionando itemEmprestimo2
		Emprestimo emprestimo2 = new Emprestimo(aluno);
		emprestimo2.adicionarItem(itemEmprestimo2);


		List<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
		ListaEmprestimos.add(emprestimo1);
		ListaEmprestimos.add(emprestimo2);

		Multa multa = new Multa(professor, 10.0);
		List<Multa> multas = new ArrayList<>();
		multas.add(multa);






		System.out.println("Livros na Estante:");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
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
			System.out.println("Valor da Multa: " + multaItem.getValor());
			System.out.println("------------------------------------------------------------------");
		}


		System.out.println("\nPessoas Cadastradas:");
		for (Pessoa pessoa: ListaPessoa) {
			System.out.println("Pessoa: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Endereço: " + pessoa.getEndereco());
			System.out.println("Livro Emprestados: " +pessoa.getLivrosEmprestados());
			System.out.println("------------------------------------------------------------------");
		}
	}
}
