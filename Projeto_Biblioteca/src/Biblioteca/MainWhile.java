//package Biblioteca;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MainWhile {
//	public static void main(String[] args) throws BibliotecaException {
//		// Criação dos objetos e listas como no código original
//		Scanner scanner = new Scanner(System.in);
//
//		Estante estante = new Estante();
//		List<Livro> livros = estante.getLivros();
//
//		List<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
//		// Adicione alguns empréstimos à lista de empréstimos para fins de exemplo
//
//		while (true) {
//			System.out.println("\nMenu:");
//			System.out.println("1. Adicionar Livro");
//			System.out.println("2. Listar Livros na Estante");
//			System.out.println("3. Consultar Empréstimos");
//			System.out.println("4. Sair");
//
//			System.out.print("Escolha uma opção: ");
//			int escolha = scanner.nextInt();
//			scanner.nextLine(); // Limpa a nova linha após a entrada do número
//
//			switch (escolha) {
//			case 1:
//				// Adicionar Livro
//				System.out.print("Título do livro: ");
//				String titulo = scanner.nextLine();
//				System.out.print("Autor do livro: ");
//				String autor = scanner.nextLine();
//				System.out.print("Ano de publicação do livro: ");
//				int ano = scanner.nextInt();
//				scanner.nextLine(); // Limpa a nova linha após a entrada do ano
//
//				Livro novoLivro = new Livro(titulo, autor, ano);
//				estante.adicionarLivro(novoLivro);
//				System.out.println("Livro adicionado com sucesso!");
//				break;
//			case 2:
//				// Listar Livros na Estante
//				System.out.println("Livros na Estante:");
//				for (Livro livro : livros) {
//					System.out.println(livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano de publicação: " + livro.getAnoPublicacao());
//				}
//				break;
//			case 3:
//				// Consultar Empréstimos
//				System.out.println("Consultar Empréstimos:");
//				for (Emprestimo emprestimo : ListaEmprestimos) {
//					Pessoa pessoa = emprestimo.getPessoa();
//					System.out.println("Pessoa: " + pessoa.getNome());
//					System.out.println("Data de empréstimo: " + emprestimo.getDataEmprestimo());
//
//					List<ItemEmprestimo> itens = emprestimo.getItens();
//					if (itens.isEmpty()) {
//						System.out.println("Nenhum livro emprestado.");
//					} else {
//						System.out.println("Livros emprestados:");
//						for (ItemEmprestimo item : itens) {
//							Livro livroEmprestado = item.getLivro();
//							System.out.println("Livro: " + livroEmprestado.getTitulo());
//							System.out.println("Data de devolução prevista: " + item.getDataDevolucaoPrevista());
//							System.out.println("------------------------------------------------------------------");
//						}
//					}
//				}
//				break;
//			case 4:
//				System.out.println("Encerrando o programa.");
//				scanner.close();
//				System.exit(0);
//			default:
//				System.out.println("Opção inválida. Tente novamente.");
//			}
//		}
//	}
//}
//
