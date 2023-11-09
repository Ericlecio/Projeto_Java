package Biblioteca;

import java.util.Date;

public class ItemEmprestimo {
	private Livro livro;
	private Date dataDevolucaoPrevista;

	public ItemEmprestimo(Livro livro, Date dataDevolucaoPrevista) {
		this.livro = livro;
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public Livro getLivro() {
		return livro;
	}

	public Date getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}