package trabalho;
import java.util.ArrayList;
import java.util.Date;

import regrasEmprestimo.IRegraEmprestimo;

public abstract class Usuario {
	private String codigo;
    private String nome;
    private IRegraEmprestimo regraEmprestimo;
    private ArrayList<Emprestimo> emprestimosAtuais;
    private ArrayList<Emprestimo> emprestimosPassados;
    private ArrayList<Reserva> reservas;

    public Usuario(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.reservas = new ArrayList<Reserva>();
        this.emprestimosAtuais = new ArrayList<Emprestimo>();
        this.emprestimosPassados = new ArrayList<Emprestimo>();
    }

	public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Emprestimo> getEmprestimosAtuais() {
		return emprestimosAtuais;
	}

	public void setEmprestimosAtuais(ArrayList<Emprestimo> emprestimosAtuais) {
		this.emprestimosAtuais = emprestimosAtuais;
	}

	public ArrayList<Emprestimo> getEmprestimosPassados() {
		return emprestimosPassados;
	}

	public void setEmprestimosPassados(ArrayList<Emprestimo> emprestimosPassados) {
		this.emprestimosPassados = emprestimosPassados;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public IRegraEmprestimo getCalculadorEmprestimo() {
		return regraEmprestimo;
	}

	public void setCalculadorEmprestimo(IRegraEmprestimo regraEmprestimo) {
		this.regraEmprestimo = regraEmprestimo;
	}
	public abstract int getTempoEmprestimo();

	public boolean verificaDevedor() {
	    Date hoje = new Date();

	    for (Emprestimo emprestimo : emprestimosAtuais) {
	        Date prazo = emprestimo.getPrazoDevolucao();

	        if (hoje.after(prazo)) {
	            
	            return true;
	        }
	    }

	    return false;
	}
	
	public boolean fazerEmprestimo(Livro livro) {
		return regraEmprestimo.verificaEmprestimo(this, livro);
	}
	public abstract int getLimiteEmprestimo();
	
}
