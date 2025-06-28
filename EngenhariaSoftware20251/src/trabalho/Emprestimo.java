package trabalho;
import java.util.Date;

public class Emprestimo {
	private Usuario usuario;
	private Exemplar exemplar;
	private Date diaEmprestimo;
	private Date prazoDevolucao;
	private Date diaDevolucao;
	



	public Emprestimo(Usuario usuario, Exemplar exemplar, Date diaEmprestimo, Date prazoDevolucao) {
		this.usuario = usuario;
		this.exemplar = exemplar;
		this.diaEmprestimo = diaEmprestimo;
		this.prazoDevolucao = prazoDevolucao;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public Exemplar getExemplar() {
		return exemplar;
	}



	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}



	public Date getPrazoDevolucao() {
		return prazoDevolucao;
	}



	public void setPrazoDevolucao(Date prazoDevolucao) {
		this.prazoDevolucao = prazoDevolucao;
	}
	
	public Date getDiaEmprestimo() {
		return diaEmprestimo;
	}



	public void setDiaEmprestimo(Date diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}
	
	public Date getDiaDevolucao() {
		return diaDevolucao;
	}



	public void setDiaDevolucao(Date diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}
	public void consultarEmprestimoExemplar() {
		System.out.println("Usuario: " + usuario.getNome() + "\nData de emprestimo: " + this.diaEmprestimo + "Prazo de devolucao" + this.prazoDevolucao);
	}
	public void consultarEmprestimoAtual() {
		System.out.println("Titulo: " + this.exemplar.getLivro() + ", Data do emprestimo: " + this.diaEmprestimo + ", em curso, data de devolucao: " + this.prazoDevolucao);
	}
	public void consultarEmprestimoPassado() {
		System.out.println("Titulo: " + this.exemplar.getLivro() + ", Data do emprestimo: " + this.diaEmprestimo + ", finalizado, data de devolucao: " + this.prazoDevolucao);
	}
}
