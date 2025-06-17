
public class AlunoPosgraduacao extends Usuario{

	public AlunoPosgraduacao(String codigo, String nome) {
		super(codigo, nome);
		this.setTempoEmprestimo(5);
	}

}
