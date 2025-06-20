
public class AlunoGraduacao extends Usuario {
	private static int tempoEmprestimo = 4;
	//private static int limiteEmprestimo = 2;
	public AlunoGraduacao(String codigo, String nome) {
		super(codigo, nome);
	}
	@Override
	public int getTempoEmprestimo() {
		return AlunoGraduacao.tempoEmprestimo;
	}
	/*
	public int getLimiteEmprestimo() {
		return AlunoGraduacao.limiteEmprestimo;
	}
	*/
}
