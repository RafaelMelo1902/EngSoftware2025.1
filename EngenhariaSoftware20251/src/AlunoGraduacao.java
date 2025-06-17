
public class AlunoGraduacao extends Usuario {

	public AlunoGraduacao(String codigo, String nome) {
		super(codigo, nome);
		this.setTempoEmprestimo(4);
	}

}
