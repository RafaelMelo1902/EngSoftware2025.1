import java.util.Date;

public class Reserva {
	private Usuario usuario;
	private Livro livro;
	private Date dataReserva;
	

	public Reserva(Usuario usuario, Livro livro, Date dataReserva) {
		super();
		this.usuario = usuario;
		this.livro = livro;
		this.dataReserva = dataReserva;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	
	

}
