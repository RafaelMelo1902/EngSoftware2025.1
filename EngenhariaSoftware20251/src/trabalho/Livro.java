package trabalho;
import java.util.ArrayList;

import java.util.Date;

import observer.Observer;
import observer.Subject;

public class Livro implements Subject {
	private String codigo;
	private String titulo;
	private String editora;
	private String autores;
	private String edição;
	private Date anoPublicacao;
	private ArrayList<Reserva> reservas;
	private ArrayList<Exemplar> exemplares;
	private ArrayList<Observer> observers;
	
	public Livro(String codigo, String titulo, String editora, String autores, String edição, Date anoPublicacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edição = edição;
		this.anoPublicacao = anoPublicacao;
		this.reservas = new ArrayList<Reserva>();
		this.exemplares = new ArrayList<Exemplar>();
		this.observers = new ArrayList<Observer>();
		
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
	public void adicionarReserva(Reserva reserva) {
		this.reservas.add(reserva);
		if(reservas.size() > 2 ) {
			this.notifyObservers();
		}
	}
	public void removerReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	public ArrayList<Exemplar> getExemplares() {
		return exemplares;
	}
	public void adicionarExemplar(Exemplar exemplar) {
		this.exemplares.add(exemplar);
	}
	public ArrayList<Exemplar> obterListaExemplaresDisponiveis(){
		ArrayList<Exemplar> exemplaresDisponiveis = new ArrayList<Exemplar>();
		for(Exemplar exemplar : this.exemplares) {
			if(exemplar.isDisponivel()) {
				exemplaresDisponiveis.add(exemplar);
			}
		}
		return exemplaresDisponiveis;
	}
	public Exemplar obterExemplarDisponivel() {
		ArrayList<Exemplar> exemplaresDisponiveis = this.obterListaExemplaresDisponiveis();
		return exemplaresDisponiveis.get(0);
	}

	public void setExemplares(ArrayList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update();
		}
	}

	
	

}
