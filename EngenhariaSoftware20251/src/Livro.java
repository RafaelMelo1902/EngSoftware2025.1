import java.util.ArrayList;
import java.util.Date;

public class Livro {
	private String codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edição;
	private Date anoPublicacao;
	private ArrayList<Reserva> reservas;
	private ArrayList<Exemplar> exemplares;
	
	public Livro(String codigo, String titulo, String editora, String autores, String edição, Date anoPublicacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edição = edição;
		this.anoPublicacao = anoPublicacao;
		this.reservas = new ArrayList<Reserva>();
		this.exemplares = new ArrayList<Exemplar>();
		
	}
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getAutores() {
		return autores;
	}


	public void setAutores(String autores) {
		this.autores = autores;
	}


	public String getEdição() {
		return edição;
	}


	public void setEdição(String edição) {
		this.edição = edição;
	}


	public Date getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public ArrayList<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(ArrayList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	

	
	

}
