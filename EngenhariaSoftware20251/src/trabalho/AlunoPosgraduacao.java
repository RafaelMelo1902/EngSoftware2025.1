package trabalho;

import regrasEmprestimo.RegraUmEmprestimo;

public class AlunoPosgraduacao extends Usuario {
	private static int tempoEmprestimo = 5;
	private static int limiteEmprestimo = 3;
	public AlunoPosgraduacao(String codigo, String nome) {
		super(codigo, nome);
		this.setRegraEmprestimo(new RegraUmEmprestimo());
	}
	@Override
	public int getTempoEmprestimo() {
		return AlunoPosgraduacao.tempoEmprestimo;
	}

	public int getLimiteEmprestimo() {
		return AlunoPosgraduacao.limiteEmprestimo;
	}

	

}
