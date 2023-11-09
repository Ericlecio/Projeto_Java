package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
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


		// Criando ItemReservas 1 e adicionando livro 
		ItemReserva itemReserva1 = new ItemReserva(livro1);

		// Criando Reserva1 e adicionando ItemReserva 1
		Reserva reserva1 = new Reserva(professor);
		reserva1.adicionarItem(itemReserva1);

		// Criando ItemReservas2 e adicionando livro 
		ItemReserva itemReserva2 = new ItemReserva(livro2);

		// Criando Reserva2 e adicionando ItemReserva2
		Reserva reserva2 = new Reserva(aluno);
		reserva2.adicionarItem(itemReserva2);

		// Criando Lista de Reserva e adicionando as reservas
		List<Reserva> ListaReservas = new ArrayList<Reserva>();
		ListaReservas.add(reserva1);
		ListaReservas.add(reserva2);

		// Crie uma multa e setando para a pessoas responsavel
		Multa multa = new Multa(professor, livro1, 10.0);
		List<Multa> multas = new ArrayList<Multa>();
		multas.add(multa);



		System.out.println("Todos os livros da biblioteca:");
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


		System.out.println("\nReservas:");
		for (Reserva reserva : ListaReservas) {
			System.out.println(reserva.getPessoa().getClass().getSimpleName());
			System.out.println(reserva.getPessoa().getNome());
			System.out.println("Data da Reserva: " + reserva.getDataReserva());
			for (ItemReserva item : reserva.getItens()) {
				System.out.println("Livro Reserva: " + item.getLivro().getTitulo());
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
			System.out.println("Livro Emprestados: " +pessoa.getLivrosEmprestados());
			System.out.println("------------------------------------------------------------------");
		}
	}
}
