package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Estante {
	private List<Livro> livros;

    public Estante() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}