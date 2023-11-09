package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
	private Pessoa pessoa;
    private Date dataEmprestimo;
    private List<ItemEmprestimo> itens;

    public Emprestimo(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.dataEmprestimo = new Date();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemEmprestimo item) {
        itens.add(item);
    }

   
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	

	public List<ItemEmprestimo> getItens() {
		return itens;
	}

	public void setItens(List<ItemEmprestimo> itens) {
		this.itens = itens;
	}
    
    
}
