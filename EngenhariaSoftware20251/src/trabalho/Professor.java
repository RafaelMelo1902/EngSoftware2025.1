package trabalho;

import regrasEmprestimo.RegraDoisEmprestimo;

public class Professor extends Usuario {
	private static int tempoEmprestimo = 8;
	private int contadorNotificacoes;
	
	public Professor(String codigo, String nome) {
		super(codigo, nome);
		contadorNotificacoes = 0;
		this.setRegraEmprestimo(new RegraDoisEmprestimo());
	}

	public int getContadorNotificacoes() {
		return contadorNotificacoes;
	}

	public void setContadorNotificacoes(int contadorNotificacoes) {
		this.contadorNotificacoes = contadorNotificacoes;
	}

	@Override
	public int getTempoEmprestimo() {
		return Professor.tempoEmprestimo;
	}

	@Override
	public void update() {
		this.contadorNotificacoes = this.contadorNotificacoes + 1;
		
	}

	public int getLimiteEmprestimo() {
		return 0;
	}
	public void consultarNotificacoes() {
		System.out.println("Numero de notificacoes para o usuario " + this.getCodigo()+ ": "+ this.contadorNotificacoes);
	}

}
