
public class Professor extends Usuario  {

	public Professor(String codigo, String nome) {
		super(codigo, nome);
		this.setTempoEmprestimo(8);
	}

}
