import java.util.Date;

public class Emprestimo {
	private Usuario usuario;
	private Exemplar exemplar;
	private Date prazoDevolucao;
	
	
	
	public Emprestimo(Usuario usuario, Exemplar exemplar) {
		this.usuario = usuario;
		this.exemplar = exemplar;
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
	
	
	
}
