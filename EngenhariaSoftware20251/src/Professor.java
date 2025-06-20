
public class Professor extends Usuario  {
	private static int tempoEmprestimo = 8;
	
	public Professor(String codigo, String nome) {
		super(codigo, nome);
	}

	@Override
	public int getTempoEmprestimo() {
		return Professor.tempoEmprestimo;
	}

}
